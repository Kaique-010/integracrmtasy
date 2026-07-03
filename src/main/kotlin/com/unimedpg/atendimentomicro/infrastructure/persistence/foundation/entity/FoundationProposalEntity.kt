package com.unimedpg.atendimentomicro.infrastructure.persistence.foundation.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.OffsetDateTime

@Entity
@Table(name = "foundation_proposal")
class FoundationProposalEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(name = "proposal_code", nullable = false, unique = true, length = 60)
    var proposalCode: String,
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "contractor_id", nullable = false)
    var contractor: FoundationContractorEntity,
    @Column(name = "product_code", nullable = false, length = 60)
    var productCode: String,
    @Column(name = "product_name", nullable = false)
    var productName: String,
    @Column(name = "price_table")
    var priceTable: String? = null,
    @Column(name = "monthly_value", precision = 14, scale = 2)
    var monthlyValue: BigDecimal? = null,
    @Column(name = "portability", nullable = false)
    var portability: Boolean,
    @Column(name = "requested_at", nullable = false)
    var requestedAt: LocalDateTime,
    @Column(name = "updated_at", nullable = false)
    var updatedAt: OffsetDateTime = OffsetDateTime.now(),
)
