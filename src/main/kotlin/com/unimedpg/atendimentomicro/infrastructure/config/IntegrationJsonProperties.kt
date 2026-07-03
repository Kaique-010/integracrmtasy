package com.unimedpg.atendimentomicro.infrastructure.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "integration.json")
data class IntegrationJsonProperties(
    val directory: String,
    val contractorFileName: String,
    val proposalFileName: String,
    val beneficiariesFileName: String,
)
