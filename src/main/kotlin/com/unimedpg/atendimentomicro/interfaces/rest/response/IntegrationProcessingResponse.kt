package com.unimedpg.atendimentomicro.interfaces.rest.response

import java.time.OffsetDateTime

data class IntegrationProcessingResponse(
    val contractorDocument: String,
    val proposalCode: String,
    val beneficiariesProcessed: Int,
    val foundInTasy: Boolean,
    val processedAt: OffsetDateTime,
    val sourceDirectory: String,
)
