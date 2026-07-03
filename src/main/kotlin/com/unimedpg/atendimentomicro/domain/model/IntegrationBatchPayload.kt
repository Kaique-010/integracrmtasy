package com.unimedpg.atendimentomicro.domain.model

import com.unimedpg.atendimentomicro.domain.enum.DocumentType
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime

data class ContractorPayload(
    val document: String,
    val documentType: DocumentType,
    val legalName: String,
    val tradeName: String? = null,
    val email: String? = null,
    val phone: String? = null,
    val sourceSystem: String = "CRM_FUNDACAO",
)

data class ProposalPayload(
    val proposalCode: String,
    val contractorDocument: String,
    val productCode: String,
    val productName: String,
    val priceTable: String? = null,
    val monthlyValue: BigDecimal? = null,
    val portability: Boolean = false,
    val requestedAt: LocalDateTime,
)

data class BeneficiaryPayload(
    val name: String,
    val cpf: String,
    val birthDate: LocalDate,
    val relationship: String,
    val portability: Boolean = false,
)

data class IntegrationBatchPayload(
    val contractor: ContractorPayload,
    val proposal: ProposalPayload,
    val beneficiaries: List<BeneficiaryPayload>,
)
