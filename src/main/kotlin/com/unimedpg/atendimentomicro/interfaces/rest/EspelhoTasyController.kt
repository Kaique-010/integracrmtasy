package com.unimedpg.atendimentomicro.interfaces.rest

import com.unimedpg.atendimentomicro.application.port.`in`.ProcessarEspelhoTasyUseCase
import com.unimedpg.atendimentomicro.interfaces.rest.request.RequisicaoProcessamentoEspelhoTasy
import com.unimedpg.atendimentomicro.interfaces.rest.response.RespostaProcessamentoEspelhoTasy
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/espelho-tasy")
class EspelhoTasyCargaCompletaController(
    private val processarEspelhoTasyUseCase: ProcessarEspelhoTasyUseCase,
) {
    @PostMapping(value = ["/processar-json", "/carga-completa/processar-json"])
    fun processarJson(): ResponseEntity<RespostaProcessamentoEspelhoTasy> {
        val resultado = processarEspelhoTasyUseCase.processarDiretorioConfigurado()
        return ResponseEntity.ok(resultado.toResponse())
    }

    @PostMapping(value = ["/processar-json-manual", "/carga-completa/processar-json-manual"])
    fun processarJsonManual(
        @Valid @RequestBody requisicao: RequisicaoProcessamentoEspelhoTasy,
    ): ResponseEntity<RespostaProcessamentoEspelhoTasy> {
        val resultado = processarEspelhoTasyUseCase.processarConteudoJson(
            conteudoJson = requisicao.conteudoJson,
            origem = requisicao.origem ?: "json-manual",
        )
        return ResponseEntity.ok(resultado.toResponse())
    }
}

@RestController
@RequestMapping("/api/espelho-tasy")
class EspelhoTasyHealthController {
    @GetMapping("/health")
    fun health(): ResponseEntity<Map<String, String>> = ResponseEntity.ok(mapOf("status" to "ok"))
}

fun com.unimedpg.atendimentomicro.domain.model.ResultadoProcessamentoEspelhoTasy.toResponse():
    RespostaProcessamentoEspelhoTasy {
    return RespostaProcessamentoEspelhoTasy(
        pessoasJuridicas = pessoasJuridicas,
        pessoasFisicas = pessoasFisicas,
        leads = leads,
        solicitacoesLead = solicitacoesLead,
        clientes = clientes,
        canais = canais,
        prospects = prospects,
        produtos = produtos,
        produtosProspect = produtosProspect,
        propostasCliente = propostasCliente,
        propostasCanal = propostasCanal,
        solicitacoesContrato = solicitacoesContrato,
        contratos = contratos,
        dependentesContrato = dependentesContrato,
        processadoEm = processadoEm,
        arquivoOrigem = arquivoOrigem,
    )
}
