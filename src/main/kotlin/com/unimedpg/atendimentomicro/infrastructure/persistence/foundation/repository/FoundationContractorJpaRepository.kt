package com.unimedpg.atendimentomicro.infrastructure.persistence.foundation.repository

import com.unimedpg.atendimentomicro.infrastructure.persistence.foundation.entity.FoundationContractorEntity
import org.springframework.data.jpa.repository.JpaRepository

interface FoundationContractorJpaRepository : JpaRepository<FoundationContractorEntity, Long> {
    fun findByDocument(document: String): FoundationContractorEntity?
}
