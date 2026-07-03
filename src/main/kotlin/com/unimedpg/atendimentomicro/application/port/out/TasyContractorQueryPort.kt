package com.unimedpg.atendimentomicro.application.port.out

import com.unimedpg.atendimentomicro.domain.model.TasyContractorSnapshot

interface TasyContractorQueryPort {
    fun findByDocument(document: String): TasyContractorSnapshot?
}
