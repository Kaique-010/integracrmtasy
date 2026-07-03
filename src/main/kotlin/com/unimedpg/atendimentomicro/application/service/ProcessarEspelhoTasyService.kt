package com.unimedpg.atendimentomicro.application.service

import com.unimedpg.atendimentomicro.application.port.`in`.ProcessarEspelhoTasyUseCase
import com.unimedpg.atendimentomicro.application.port.out.CarregarLoteEspelhoTasyPort
import com.unimedpg.atendimentomicro.application.port.out.PersistirEspelhoTasyPort
import com.unimedpg.atendimentomicro.domain.model.LoteEspelhoTasy
import com.unimedpg.atendimentomicro.domain.model.ResultadoProcessamentoEspelhoTasy
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ProcessarEspelhoTasyService(
    private val carregarLoteEspelhoTasyPort: CarregarLoteEspelhoTasyPort,
    private val persistirEspelhoTasyPort: PersistirEspelhoTasyPort,
) : ProcessarEspelhoTasyUseCase {
    @Transactional
    override fun processarDiretorioConfigurado(): ResultadoProcessamentoEspelhoTasy {
        val lote = carregarLoteEspelhoTasyPort.carregar()
        return processarLote(lote, carregarLoteEspelhoTasyPort.arquivoOrigem())
    }

    @Transactional
    override fun processarConteudoJson(conteudoJson: String, origem: String): ResultadoProcessamentoEspelhoTasy {
        val lote = carregarLoteEspelhoTasyPort.carregarConteudo(conteudoJson)
        return processarLote(lote, origem)
    }

    private fun processarLote(
        lote: LoteEspelhoTasy,
        origem: String,
    ): ResultadoProcessamentoEspelhoTasy {
        persistirEspelhoTasyPort.persistir(lote)
        return lote.gerarResultado(origem)
    }
}
