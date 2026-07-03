package com.unimedpg.atendimentomicro.interfaces.rest.response

import java.time.OffsetDateTime

data class RespostaProcessamentoEspelhoTasy(
    val pessoasJuridicas: Int,
    val pessoasFisicas: Int,
    val leads: Int,
    val solicitacoesLead: Int,
    val clientes: Int,
    val canais: Int,
    val prospects: Int,
    val produtos: Int,
    val produtosProspect: Int,
    val propostasCliente: Int,
    val propostasCanal: Int,
    val solicitacoesContrato: Int,
    val contratos: Int,
    val dependentesContrato: Int,
    val processadoEm: OffsetDateTime,
    val arquivoOrigem: String,
)
