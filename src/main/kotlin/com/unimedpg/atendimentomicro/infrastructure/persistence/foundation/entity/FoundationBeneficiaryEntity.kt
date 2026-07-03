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
import java.time.LocalDate

@Entity
@Table(name = "foundation_beneficiary")
class FoundationBeneficiaryEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "proposal_id", nullable = false)
    var proposal: FoundationProposalEntity,
    @Column(name = "name", nullable = false)
    var name: String,
    @Column(name = "cpf", nullable = false, length = 20)
    var cpf: String,
    @Column(name = "birth_date", nullable = false)
    var birthDate: LocalDate,
    @Column(name = "relationship", nullable = false, length = 50)
    var relationship: String,
    @Column(name = "portability", nullable = false)
    var portability: Boolean,
)
