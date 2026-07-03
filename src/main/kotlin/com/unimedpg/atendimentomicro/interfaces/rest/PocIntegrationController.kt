package com.unimedpg.atendimentomicro.interfaces.rest

import com.unimedpg.atendimentomicro.application.port.`in`.ProcessJsonBatchUseCase
import com.unimedpg.atendimentomicro.interfaces.rest.response.IntegrationProcessingResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/poc/integracoes")
class PocIntegrationController(
    private val processJsonBatchUseCase: ProcessJsonBatchUseCase,
) {
    @PostMapping("/processar-jsons")
    fun processarJsons(): ResponseEntity<IntegrationProcessingResponse> {
        val result = processJsonBatchUseCase.processConfiguredDirectory()

        return ResponseEntity.ok(
            IntegrationProcessingResponse(
                contractorDocument = result.contractorDocument,
                proposalCode = result.proposalCode,
                beneficiariesProcessed = result.beneficiariesProcessed,
                foundInTasy = result.foundInTasy,
                processedAt = result.processedAt,
                sourceDirectory = result.sourceDirectory,
            ),
        )
    }
}
