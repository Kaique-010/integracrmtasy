package com.unimedpg.atendimentomicro

import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class IntegracaoTasyFundacaoPocApplication

fun main(args: Array<String>) {
	runApplication<IntegracaoTasyFundacaoPocApplication>(*args)
}
