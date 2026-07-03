package com.unimedpg.atendimentomicro.infrastructure.persistence.foundation.repository

import com.unimedpg.atendimentomicro.infrastructure.persistence.foundation.entity.FoundationProposalEntity
import org.springframework.data.jpa.repository.JpaRepository

interface FoundationProposalJpaRepository : JpaRepository<FoundationProposalEntity, Long> {
    fun findByProposalCode(proposalCode: String): FoundationProposalEntity?
}
