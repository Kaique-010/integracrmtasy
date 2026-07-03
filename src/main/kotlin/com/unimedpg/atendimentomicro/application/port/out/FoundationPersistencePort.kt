package com.unimedpg.atendimentomicro.application.port.out

import com.unimedpg.atendimentomicro.domain.model.IntegrationBatchPayload

interface FoundationPersistencePort {
    fun save(batch: IntegrationBatchPayload, foundInTasy: Boolean)
}
