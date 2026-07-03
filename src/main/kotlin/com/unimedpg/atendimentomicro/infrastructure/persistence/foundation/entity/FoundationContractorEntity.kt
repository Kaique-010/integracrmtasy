package com.unimedpg.atendimentomicro.infrastructure.persistence.foundation.entity

import com.unimedpg.atendimentomicro.domain.enum.DocumentType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.OffsetDateTime

@Entity
@Table(name = "foundation_contractor")
class FoundationContractorEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(name = "document", nullable = false, unique = true, length = 20)
    var document: String,
    @Enumerated(EnumType.STRING)
    @Column(name = "document_type", nullable = false, length = 10)
    var documentType: DocumentType,
    @Column(name = "legal_name", nullable = false)
    var legalName: String,
    @Column(name = "trade_name")
    var tradeName: String? = null,
    @Column(name = "email")
    var email: String? = null,
    @Column(name = "phone")
    var phone: String? = null,
    @Column(name = "source_system", nullable = false)
    var sourceSystem: String,
    @Column(name = "found_in_tasy", nullable = false)
    var foundInTasy: Boolean,
    @Column(name = "updated_at", nullable = false)
    var updatedAt: OffsetDateTime = OffsetDateTime.now(),
)
