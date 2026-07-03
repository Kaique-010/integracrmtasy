package com.unimedpg.atendimentomicro.infrastructure.persistence.foundation.repository

import com.unimedpg.atendimentomicro.infrastructure.persistence.foundation.entity.FoundationBeneficiaryEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.transaction.annotation.Transactional

interface FoundationBeneficiaryJpaRepository : JpaRepository<FoundationBeneficiaryEntity, Long> {
    @Transactional
    fun deleteByProposal_Id(proposalId: Long)
}
