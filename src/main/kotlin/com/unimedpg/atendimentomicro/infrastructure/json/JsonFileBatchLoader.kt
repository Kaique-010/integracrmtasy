package com.unimedpg.atendimentomicro.infrastructure.json

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.unimedpg.atendimentomicro.application.port.out.LoadIntegrationBatchPort
import com.unimedpg.atendimentomicro.domain.model.BeneficiaryPayload
import com.unimedpg.atendimentomicro.domain.model.ContractorPayload
import com.unimedpg.atendimentomicro.domain.model.IntegrationBatchPayload
import com.unimedpg.atendimentomicro.domain.model.ProposalPayload
import com.unimedpg.atendimentomicro.infrastructure.config.IntegrationJsonProperties
import org.springframework.stereotype.Component
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.exists

@Component
class JsonFileBatchLoader(
    private val objectMapper: ObjectMapper,
    private val properties: IntegrationJsonProperties,
) : LoadIntegrationBatchPort {
    override fun load(): IntegrationBatchPayload {
        val baseDirectory = Path.of(properties.directory)
        require(baseDirectory.exists()) {
            "Diretorio de JSONs nao encontrado: ${baseDirectory.toAbsolutePath()}"
        }

        val contractor = readFile<ContractorPayload>(baseDirectory.resolve(properties.contractorFileName))
        val proposal = readFile<ProposalPayload>(baseDirectory.resolve(properties.proposalFileName))
        val beneficiaries = readFile<List<BeneficiaryPayload>>(baseDirectory.resolve(properties.beneficiariesFileName))

        val normalizedContractorDocument = contractor.document.onlyDigits()
        val normalizedProposalDocument = proposal.contractorDocument.onlyDigits()

        require(normalizedContractorDocument == normalizedProposalDocument) {
            "Documento do contratante diferente entre contratante.json e proposta.json"
        }

        return IntegrationBatchPayload(
            contractor = contractor.copy(document = normalizedContractorDocument),
            proposal = proposal.copy(contractorDocument = normalizedProposalDocument),
            beneficiaries = beneficiaries,
        )
    }

    override fun sourceDirectory(): String = Path.of(properties.directory).toAbsolutePath().toString()

    private inline fun <reified T> readFile(path: Path): T {
        require(Files.exists(path)) { "Arquivo JSON obrigatorio nao encontrado: ${path.toAbsolutePath()}" }
        return objectMapper.readValue(path.toFile())
    }

    private fun String.onlyDigits(): String = filter(Char::isDigit)
}
