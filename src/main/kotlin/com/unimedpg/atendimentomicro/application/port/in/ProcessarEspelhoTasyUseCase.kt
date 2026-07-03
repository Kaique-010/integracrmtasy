package com.unimedpg.atendimentomicro.application.port.`in`

import com.unimedpg.atendimentomicro.domain.model.ResultadoProcessamentoEspelhoTasy

interface ProcessarEspelhoTasyUseCase {
    fun processarDiretorioConfigurado(): ResultadoProcessamentoEspelhoTasy
    fun processarConteudoJson(conteudoJson: String, origem: String = "json-manual"): ResultadoProcessamentoEspelhoTasy
}
