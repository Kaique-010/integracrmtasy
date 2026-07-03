package com.unimedpg.atendimentomicro.interfaces.rest

import com.unimedpg.atendimentomicro.application.port.`in`.ProcessarSecaoEspelhoTasyUseCase
import com.unimedpg.atendimentomicro.domain.model.SecaoEspelhoTasy
import com.unimedpg.atendimentomicro.interfaces.rest.request.RequisicaoProcessamentoSecaoEspelhoTasy
import com.unimedpg.atendimentomicro.interfaces.rest.response.RespostaProcessamentoEspelhoTasy
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/api/espelho-tasy/carga-secao")
class EspelhoTasySecaoController(
    private val processarSecaoEspelhoTasyUseCase: ProcessarSecaoEspelhoTasyUseCase,
) {
    @PostMapping("/processar-json-manual")
    fun processarJsonManualPorSecao(
        @Valid @RequestBody requisicao: RequisicaoProcessamentoSecaoEspelhoTasy,
    ): ResponseEntity<RespostaProcessamentoEspelhoTasy> {
        val secao = SecaoEspelhoTasy.fromValor(requisicao.secao)
            ?: throw ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "Secao invalida: ${requisicao.secao}",
            )

        val resultado = processarSecaoEspelhoTasyUseCase.processarConteudoJson(
            secao = secao,
            conteudoJson = requisicao.conteudoJson,
            origem = requisicao.origem ?: "json-manual-secao",
        )

        return ResponseEntity.ok(resultado.toResponse())
    }
}
