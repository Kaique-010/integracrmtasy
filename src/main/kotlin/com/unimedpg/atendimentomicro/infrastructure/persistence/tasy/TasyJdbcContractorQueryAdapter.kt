package com.unimedpg.atendimentomicro.infrastructure.persistence.tasy

import com.unimedpg.atendimentomicro.application.port.out.TasyContractorQueryPort
import com.unimedpg.atendimentomicro.domain.model.TasyContractorSnapshot
import com.unimedpg.atendimentomicro.infrastructure.config.TasyLookupProperties
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.ObjectProvider
import org.springframework.dao.DataAccessException
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Component

@Component
class TasyJdbcContractorQueryAdapter(
    private val jdbcTemplateProvider: ObjectProvider<NamedParameterJdbcTemplate>,
    private val properties: TasyLookupProperties,
) : TasyContractorQueryPort {
    private val logger = LoggerFactory.getLogger(javaClass)

    override fun findByDocument(document: String): TasyContractorSnapshot? {
        if (!properties.enabled) {
            logger.info("Consulta no Tasy desabilitada para a POC local.")
            return null
        }

        val jdbcTemplate = jdbcTemplateProvider.ifAvailable ?: run {
            logger.warn("NamedParameterJdbcTemplate do Tasy nao disponivel.")
            return null
        }

        if (properties.contractorSql.isBlank()) {
            logger.warn("SQL de consulta do contratante no Tasy nao configurado.")
            return null
        }

        return try {
            jdbcTemplate.query(
                properties.contractorSql,
                mapOf("document" to document.filter(Char::isDigit)),
            ) { rs, _ ->
                TasyContractorSnapshot(
                    id = rs.getString("id"),
                    document = rs.getString("document"),
                    legalName = rs.getString("legal_name"),
                )
            }.firstOrNull()
        } catch (exception: DataAccessException) {
            logger.warn("Falha ao consultar contratante no Tasy: {}", exception.message)
            null
        }
    }
}
