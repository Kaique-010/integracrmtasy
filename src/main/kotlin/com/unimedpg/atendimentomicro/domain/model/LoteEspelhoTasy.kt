package com.unimedpg.atendimentomicro.domain.model

import java.time.OffsetDateTime

typealias RegistroEspelhoTasy = Map<String, Any?>

enum class SecaoEspelhoTasy(val chaveJson: String) {
    PESSOAS_JURIDICAS("pessoasJuridicas"),
    PESSOAS_FISICAS("pessoasFisicas"),
    LEADS("leads"),
    SOLICITACOES_LEAD("solicitacoesLead"),
    CLIENTES("clientes"),
    CANAIS("canais"),
    PROSPECTS("prospects"),
    PRODUTOS("produtos"),
    PRODUTOS_PROSPECT("produtosProspect"),
    PROPOSTAS_CLIENTE("propostasCliente"),
    PROPOSTAS_CANAL("propostasCanal"),
    SOLICITACOES_CONTRATO("solicitacoesContrato"),
    CONTRATOS("contratos"),
    DEPENDENTES_CONTRATO("dependentesContrato"),
    ;

    companion object {
        fun fromValor(valor: String): SecaoEspelhoTasy? {
            return entries.firstOrNull {
                it.chaveJson.equals(valor, ignoreCase = true) || it.name.equals(valor, ignoreCase = true)
            }
        }
    }
}

data class LoteEspelhoTasy(
    val pessoasJuridicas: List<RegistroEspelhoTasy> = emptyList(),
    val pessoasFisicas: List<RegistroEspelhoTasy> = emptyList(),
    val leads: List<RegistroEspelhoTasy> = emptyList(),
    val solicitacoesLead: List<RegistroEspelhoTasy> = emptyList(),
    val clientes: List<RegistroEspelhoTasy> = emptyList(),
    val canais: List<RegistroEspelhoTasy> = emptyList(),
    val prospects: List<RegistroEspelhoTasy> = emptyList(),
    val produtos: List<RegistroEspelhoTasy> = emptyList(),
    val produtosProspect: List<RegistroEspelhoTasy> = emptyList(),
    val propostasCliente: List<RegistroEspelhoTasy> = emptyList(),
    val propostasCanal: List<RegistroEspelhoTasy> = emptyList(),
    val solicitacoesContrato: List<RegistroEspelhoTasy> = emptyList(),
    val contratos: List<RegistroEspelhoTasy> = emptyList(),
    val dependentesContrato: List<RegistroEspelhoTasy> = emptyList(),
) {
    fun filtrarPorSecao(secao: SecaoEspelhoTasy): LoteEspelhoTasy {
        return when (secao) {
            SecaoEspelhoTasy.PESSOAS_JURIDICAS -> LoteEspelhoTasy(pessoasJuridicas = pessoasJuridicas)
            SecaoEspelhoTasy.PESSOAS_FISICAS -> LoteEspelhoTasy(pessoasFisicas = pessoasFisicas)
            SecaoEspelhoTasy.LEADS -> LoteEspelhoTasy(leads = leads)
            SecaoEspelhoTasy.SOLICITACOES_LEAD -> LoteEspelhoTasy(solicitacoesLead = solicitacoesLead)
            SecaoEspelhoTasy.CLIENTES -> LoteEspelhoTasy(clientes = clientes)
            SecaoEspelhoTasy.CANAIS -> LoteEspelhoTasy(canais = canais)
            SecaoEspelhoTasy.PROSPECTS -> LoteEspelhoTasy(prospects = prospects)
            SecaoEspelhoTasy.PRODUTOS -> LoteEspelhoTasy(produtos = produtos)
            SecaoEspelhoTasy.PRODUTOS_PROSPECT -> LoteEspelhoTasy(produtosProspect = produtosProspect)
            SecaoEspelhoTasy.PROPOSTAS_CLIENTE -> LoteEspelhoTasy(propostasCliente = propostasCliente)
            SecaoEspelhoTasy.PROPOSTAS_CANAL -> LoteEspelhoTasy(propostasCanal = propostasCanal)
            SecaoEspelhoTasy.SOLICITACOES_CONTRATO -> LoteEspelhoTasy(solicitacoesContrato = solicitacoesContrato)
            SecaoEspelhoTasy.CONTRATOS -> LoteEspelhoTasy(contratos = contratos)
            SecaoEspelhoTasy.DEPENDENTES_CONTRATO -> LoteEspelhoTasy(dependentesContrato = dependentesContrato)
        }
    }

    fun gerarResultado(origem: String): ResultadoProcessamentoEspelhoTasy {
        return ResultadoProcessamentoEspelhoTasy(
            pessoasJuridicas = pessoasJuridicas.size,
            pessoasFisicas = pessoasFisicas.size,
            leads = leads.size,
            solicitacoesLead = solicitacoesLead.size,
            clientes = clientes.size,
            canais = canais.size,
            prospects = prospects.size,
            produtos = produtos.size,
            produtosProspect = produtosProspect.size,
            propostasCliente = propostasCliente.size,
            propostasCanal = propostasCanal.size,
            solicitacoesContrato = solicitacoesContrato.size,
            contratos = contratos.size,
            dependentesContrato = dependentesContrato.size,
            processadoEm = OffsetDateTime.now(),
            arquivoOrigem = origem,
        )
    }
}

data class ResultadoProcessamentoEspelhoTasy(
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
