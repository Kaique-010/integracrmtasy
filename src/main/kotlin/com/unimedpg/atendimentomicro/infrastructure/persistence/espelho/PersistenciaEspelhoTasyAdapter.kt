package com.unimedpg.atendimentomicro.infrastructure.persistence.espelho

import com.fasterxml.jackson.databind.ObjectMapper
import com.unimedpg.atendimentomicro.application.port.out.PersistirEspelhoTasyPort
import com.unimedpg.atendimentomicro.domain.model.LoteEspelhoTasy
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.entity.CanalEspelhoEntity
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.entity.ClienteEspelhoEntity
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.entity.ContratoEspelhoEntity
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.entity.DependenteContratoEspelhoEntity
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.entity.LeadEspelhoEntity
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.entity.PessoaFisicaEspelhoEntity
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.entity.PessoaJuridicaEspelhoEntity
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.entity.ProdutoEspelhoEntity
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.entity.ProdutoProspectEspelhoEntity
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.entity.PropostaCanalEspelhoEntity
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.entity.PropostaClienteEspelhoEntity
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.entity.ProspectEspelhoEntity
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.entity.SolicitacaoContratoEspelhoEntity
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.entity.SolicitacaoLeadEspelhoEntity
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.repository.CanalEspelhoRepository
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.repository.ClienteEspelhoRepository
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.repository.ContratoEspelhoRepository
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.repository.DependenteContratoEspelhoRepository
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.repository.LeadEspelhoRepository
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.repository.PessoaFisicaEspelhoRepository
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.repository.PessoaJuridicaEspelhoRepository
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.repository.ProdutoEspelhoRepository
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.repository.ProdutoProspectEspelhoRepository
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.repository.PropostaCanalEspelhoRepository
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.repository.PropostaClienteEspelhoRepository
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.repository.ProspectEspelhoRepository
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.repository.SolicitacaoContratoEspelhoRepository
import com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.repository.SolicitacaoLeadEspelhoRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Component

@Component
class PersistenciaEspelhoTasyAdapter(
    private val objectMapper: ObjectMapper,
    private val pessoaJuridicaRepository: PessoaJuridicaEspelhoRepository,
    private val pessoaFisicaRepository: PessoaFisicaEspelhoRepository,
    private val leadRepository: LeadEspelhoRepository,
    private val solicitacaoLeadRepository: SolicitacaoLeadEspelhoRepository,
    private val clienteRepository: ClienteEspelhoRepository,
    private val canalRepository: CanalEspelhoRepository,
    private val prospectRepository: ProspectEspelhoRepository,
    private val produtoRepository: ProdutoEspelhoRepository,
    private val produtoProspectRepository: ProdutoProspectEspelhoRepository,
    private val propostaClienteRepository: PropostaClienteEspelhoRepository,
    private val propostaCanalRepository: PropostaCanalEspelhoRepository,
    private val solicitacaoContratoRepository: SolicitacaoContratoEspelhoRepository,
    private val contratoRepository: ContratoEspelhoRepository,
    private val dependenteContratoRepository: DependenteContratoEspelhoRepository,
) : PersistirEspelhoTasyPort {
    override fun persistir(lote: LoteEspelhoTasy) {
        salvarRegistros(lote.pessoasJuridicas, pessoaJuridicaRepository, PessoaJuridicaEspelhoEntity::class.java)
        salvarRegistros(lote.pessoasFisicas, pessoaFisicaRepository, PessoaFisicaEspelhoEntity::class.java)
        salvarRegistros(lote.leads, leadRepository, LeadEspelhoEntity::class.java)
        salvarRegistros(lote.solicitacoesLead, solicitacaoLeadRepository, SolicitacaoLeadEspelhoEntity::class.java)
        salvarRegistros(lote.clientes, clienteRepository, ClienteEspelhoEntity::class.java)
        salvarRegistros(lote.canais, canalRepository, CanalEspelhoEntity::class.java)
        salvarRegistros(lote.prospects, prospectRepository, ProspectEspelhoEntity::class.java)
        salvarRegistros(lote.produtos, produtoRepository, ProdutoEspelhoEntity::class.java)
        salvarRegistros(lote.produtosProspect, produtoProspectRepository, ProdutoProspectEspelhoEntity::class.java)
        salvarRegistros(lote.propostasCliente, propostaClienteRepository, PropostaClienteEspelhoEntity::class.java)
        salvarRegistros(lote.propostasCanal, propostaCanalRepository, PropostaCanalEspelhoEntity::class.java)
        salvarRegistros(lote.solicitacoesContrato, solicitacaoContratoRepository, SolicitacaoContratoEspelhoEntity::class.java)
        salvarRegistros(lote.contratos, contratoRepository, ContratoEspelhoEntity::class.java)
        salvarRegistros(lote.dependentesContrato, dependenteContratoRepository, DependenteContratoEspelhoEntity::class.java)
    }

    private fun <T, ID> salvarRegistros(
        registros: List<Map<String, Any?>>,
        repository: JpaRepository<T, ID>,
        entityClass: Class<T>,
    ) {
        if (registros.isEmpty()) {
            return
        }

        repository.saveAll(
            registros.map { objectMapper.convertValue(it, entityClass) },
        )
    }
}
