package com.unimedpg.atendimentomicro.application.port.`in`

import com.unimedpg.atendimentomicro.domain.model.IntegrationProcessingResult

interface ProcessJsonBatchUseCase {
    fun processConfiguredDirectory(): IntegrationProcessingResult
}
