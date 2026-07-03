package com.unimedpg.atendimentomicro.application.port.out

import com.unimedpg.atendimentomicro.domain.model.LoteEspelhoTasy

interface CarregarLoteEspelhoTasyPort {
    fun carregar(): LoteEspelhoTasy
    fun carregarConteudo(conteudoJson: String): LoteEspelhoTasy
    fun arquivoOrigem(): String
}

interface PersistirEspelhoTasyPort {
    fun persistir(lote: LoteEspelhoTasy)
}
