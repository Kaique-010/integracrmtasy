package com.unimedpg.atendimentomicro.application.service

import com.unimedpg.atendimentomicro.application.port.`in`.ProcessarSecaoEspelhoTasyUseCase
import com.unimedpg.atendimentomicro.application.port.out.CarregarLoteEspelhoTasyPort
import com.unimedpg.atendimentomicro.application.port.out.PersistirEspelhoTasyPort
import com.unimedpg.atendimentomicro.domain.model.ResultadoProcessamentoEspelhoTasy
import com.unimedpg.atendimentomicro.domain.model.SecaoEspelhoTasy
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ProcessarSecaoEspelhoTasyService(
    private val carregarLoteEspelhoTasyPort: CarregarLoteEspelhoTasyPort,
    private val persistirEspelhoTasyPort: PersistirEspelhoTasyPort,
) : ProcessarSecaoEspelhoTasyUseCase {
    @Transactional
    override fun processarConteudoJson(
        secao: SecaoEspelhoTasy,
        conteudoJson: String,
        origem: String,
    ): ResultadoProcessamentoEspelhoTasy {
        val loteCompleto = carregarLoteEspelhoTasyPort.carregarConteudo(conteudoJson)
        val loteFiltrado = loteCompleto.filtrarPorSecao(secao)

        persistirEspelhoTasyPort.persistir(loteFiltrado)

        return loteFiltrado.gerarResultado("$origem:${secao.chaveJson}")
    }
}
