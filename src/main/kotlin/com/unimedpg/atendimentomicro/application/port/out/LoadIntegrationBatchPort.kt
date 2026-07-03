package com.unimedpg.atendimentomicro.application.port.out

import com.unimedpg.atendimentomicro.domain.model.IntegrationBatchPayload

interface LoadIntegrationBatchPort {
    fun load(): IntegrationBatchPayload
    fun sourceDirectory(): String
}
