package com.unimedpg.atendimentomicro.infrastructure.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "tasy.lookup")
data class TasyLookupProperties(
    val enabled: Boolean = false,
    val contractorSql: String = "",
)
