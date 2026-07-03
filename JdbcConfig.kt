package com.unimedpg.atendimentomicro.infrastructure.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import javax.sql.DataSource

@Configuration
class JdbcConfig {
    @Bean
    @ConfigurationProperties("tasy.datasource")
    fun tasyDataSource(): DataSource {
        return DataSourceBuilder.create().build()
    }

    @Bean
    fun tasyJdbcTemplate(tasyDataSource: DataSource): JdbcTemplate {
        return JdbcTemplate(tasyDataSource)
    }

    @Bean
    fun tasyNamedParameterJdbcTemplate(tasyDataSource: DataSource): NamedParameterJdbcTemplate {
        return NamedParameterJdbcTemplate(tasyDataSource)
    }
}