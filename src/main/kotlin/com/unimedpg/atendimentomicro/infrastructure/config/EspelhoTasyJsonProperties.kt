package com.unimedpg.atendimentomicro.infrastructure.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "integration.espelho-json")
data class EspelhoTasyJsonProperties(
    val directory: String,
    val fileName: String,
)
