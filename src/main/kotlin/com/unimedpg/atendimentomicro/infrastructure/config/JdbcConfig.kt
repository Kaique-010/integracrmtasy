package com.unimedpg.atendimentomicro.infrastructure.config

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import javax.sql.DataSource

@Configuration
class JdbcConfig {
    @Bean(name = ["tasyDataSource"])
    @ConditionalOnProperty(prefix = "tasy.datasource", name = ["enabled"], havingValue = "true")
    @ConfigurationProperties("tasy.datasource")
    fun tasyDataSource(): DataSource = DataSourceBuilder.create().build()

    @Bean
    @ConditionalOnProperty(prefix = "tasy.datasource", name = ["enabled"], havingValue = "true")
    fun tasyJdbcTemplate(@Qualifier("tasyDataSource") tasyDataSource: DataSource): JdbcTemplate =
        JdbcTemplate(tasyDataSource)

    @Bean
    @ConditionalOnProperty(prefix = "tasy.datasource", name = ["enabled"], havingValue = "true")
    fun tasyNamedParameterJdbcTemplate(@Qualifier("tasyDataSource") tasyDataSource: DataSource): NamedParameterJdbcTemplate =
        NamedParameterJdbcTemplate(tasyDataSource)
}
