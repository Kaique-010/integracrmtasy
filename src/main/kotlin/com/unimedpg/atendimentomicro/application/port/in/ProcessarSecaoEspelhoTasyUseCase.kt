package com.unimedpg.atendimentomicro.application.port.`in`

import com.unimedpg.atendimentomicro.domain.model.ResultadoProcessamentoEspelhoTasy
import com.unimedpg.atendimentomicro.domain.model.SecaoEspelhoTasy

interface ProcessarSecaoEspelhoTasyUseCase {
    fun processarConteudoJson(
        secao: SecaoEspelhoTasy,
        conteudoJson: String,
        origem: String = "json-manual-secao",
    ): ResultadoProcessamentoEspelhoTasy
}
