package com.unimedpg.atendimentomicro.interfaces.rest.request

import jakarta.validation.constraints.NotBlank

data class RequisicaoProcessamentoSecaoEspelhoTasy(
    @field:NotBlank(message = "A secao e obrigatoria")
    val secao: String,
    @field:NotBlank(message = "O conteudoJson e obrigatorio")
    val conteudoJson: String,
    val origem: String? = null,
)
