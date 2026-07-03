package com.unimedpg.atendimentomicro.infrastructure.json

import com.fasterxml.jackson.databind.ObjectMapper
import com.unimedpg.atendimentomicro.application.port.out.CarregarLoteEspelhoTasyPort
import com.unimedpg.atendimentomicro.domain.model.LoteEspelhoTasy
import com.unimedpg.atendimentomicro.infrastructure.config.EspelhoTasyJsonProperties
import org.springframework.stereotype.Component
import java.nio.file.Files
import java.nio.file.Path

@Component
class CarregadorJsonEspelhoTasy(
    private val objectMapper: ObjectMapper,
    private val properties: EspelhoTasyJsonProperties,
) : CarregarLoteEspelhoTasyPort {
    override fun carregar(): LoteEspelhoTasy {
        val arquivo = arquivo()
        require(Files.exists(arquivo)) {
            "Arquivo de espelho Tasy nao encontrado: $arquivo"
        }

        return Files.newBufferedReader(arquivo).use { reader ->
            objectMapper.readValue(reader, LoteEspelhoTasy::class.java)
        }
    }

    override fun carregarConteudo(conteudoJson: String): LoteEspelhoTasy {
        return objectMapper.readValue(conteudoJson, LoteEspelhoTasy::class.java)
    }

    override fun arquivoOrigem(): String = arquivo().toString()

    private fun arquivo(): Path = Path.of(properties.directory, properties.fileName)
}
