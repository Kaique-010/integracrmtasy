package com.unimedpg.atendimentomicro.infrastructure.persistence.foundation

import com.unimedpg.atendimentomicro.application.port.out.FoundationPersistencePort
import com.unimedpg.atendimentomicro.domain.model.IntegrationBatchPayload
import com.unimedpg.atendimentomicro.infrastructure.persistence.foundation.entity.FoundationBeneficiaryEntity
import com.unimedpg.atendimentomicro.infrastructure.persistence.foundation.entity.FoundationContractorEntity
import com.unimedpg.atendimentomicro.infrastructure.persistence.foundation.entity.FoundationProposalEntity
import com.unimedpg.atendimentomicro.infrastructure.persistence.foundation.repository.FoundationBeneficiaryJpaRepository
import com.unimedpg.atendimentomicro.infrastructure.persistence.foundation.repository.FoundationContractorJpaRepository
import com.unimedpg.atendimentomicro.infrastructure.persistence.foundation.repository.FoundationProposalJpaRepository
import org.springframework.stereotype.Component
import java.time.OffsetDateTime

@Component
class FoundationPersistenceAdapter(
    private val contractorRepository: FoundationContractorJpaRepository,
    private val proposalRepository: FoundationProposalJpaRepository,
    private val beneficiaryRepository: FoundationBeneficiaryJpaRepository,
) : FoundationPersistencePort {
    override fun save(batch: IntegrationBatchPayload, foundInTasy: Boolean) {
        val contractor = contractorRepository.findByDocument(batch.contractor.document)
            ?.apply {
                documentType = batch.contractor.documentType
                legalName = batch.contractor.legalName
                tradeName = batch.contractor.tradeName
                email = batch.contractor.email
                phone = batch.contractor.phone
                sourceSystem = batch.contractor.sourceSystem
                this.foundInTasy = foundInTasy
                updatedAt = OffsetDateTime.now()
            }
            ?: FoundationContractorEntity(
                document = batch.contractor.document,
                documentType = batch.contractor.documentType,
                legalName = batch.contractor.legalName,
                tradeName = batch.contractor.tradeName,
                email = batch.contractor.email,
                phone = batch.contractor.phone,
                sourceSystem = batch.contractor.sourceSystem,
                foundInTasy = foundInTasy,
            )

        val savedContractor = contractorRepository.save(contractor)

        val proposal = proposalRepository.findByProposalCode(batch.proposal.proposalCode)
            ?.apply {
                this.contractor = savedContractor
                productCode = batch.proposal.productCode
                productName = batch.proposal.productName
                priceTable = batch.proposal.priceTable
                monthlyValue = batch.proposal.monthlyValue
                portability = batch.proposal.portability
                requestedAt = batch.proposal.requestedAt
                updatedAt = OffsetDateTime.now()
            }
            ?: FoundationProposalEntity(
                proposalCode = batch.proposal.proposalCode,
                contractor = savedContractor,
                productCode = batch.proposal.productCode,
                productName = batch.proposal.productName,
                priceTable = batch.proposal.priceTable,
                monthlyValue = batch.proposal.monthlyValue,
                portability = batch.proposal.portability,
                requestedAt = batch.proposal.requestedAt,
            )

        val savedProposal = proposalRepository.save(proposal)

        savedProposal.id?.let { beneficiaryRepository.deleteByProposal_Id(it) }

        val beneficiaries = batch.beneficiaries.map { beneficiary ->
            FoundationBeneficiaryEntity(
                proposal = savedProposal,
                name = beneficiary.name,
                cpf = beneficiary.cpf.filter(Char::isDigit),
                birthDate = beneficiary.birthDate,
                relationship = beneficiary.relationship,
                portability = beneficiary.portability,
            )
        }

        beneficiaryRepository.saveAll(beneficiaries)
    }
}
