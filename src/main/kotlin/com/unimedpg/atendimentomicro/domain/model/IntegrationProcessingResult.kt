package com.unimedpg.atendimentomicro.domain.model

import java.time.OffsetDateTime

data class IntegrationProcessingResult(
    val contractorDocument: String,
    val proposalCode: String,
    val beneficiariesProcessed: Int,
    val foundInTasy: Boolean,
    val processedAt: OffsetDateTime,
    val sourceDirectory: String,
)
