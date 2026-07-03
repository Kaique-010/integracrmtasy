package com.unimedpg.atendimentomicro.interfaces.rest.request

import jakarta.validation.constraints.NotBlank

data class RequisicaoProcessamentoEspelhoTasy(
    @field:NotBlank(message = "O conteudoJson e obrigatorio")
    val conteudoJson: String,
    val origem: String? = null,
)
