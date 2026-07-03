package com.unimedpg.atendimentomicro.application.service

import com.unimedpg.atendimentomicro.application.port.`in`.ProcessJsonBatchUseCase
import com.unimedpg.atendimentomicro.application.port.out.FoundationPersistencePort
import com.unimedpg.atendimentomicro.application.port.out.LoadIntegrationBatchPort
import com.unimedpg.atendimentomicro.application.port.out.TasyContractorQueryPort
import com.unimedpg.atendimentomicro.domain.model.IntegrationProcessingResult
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.OffsetDateTime

@Service
class ProcessJsonBatchService(
    private val loadIntegrationBatchPort: LoadIntegrationBatchPort,
    private val tasyContractorQueryPort: TasyContractorQueryPort,
    private val foundationPersistencePort: FoundationPersistencePort,
) : ProcessJsonBatchUseCase {
    @Transactional
    override fun processConfiguredDirectory(): IntegrationProcessingResult {
        val batch = loadIntegrationBatchPort.load()
        val normalizedDocument = batch.contractor.document.onlyDigits()
        val tasyContractor = tasyContractorQueryPort.findByDocument(normalizedDocument)
        val foundInTasy = tasyContractor != null

        foundationPersistencePort.save(
            batch = batch.copy(
                contractor = batch.contractor.copy(document = normalizedDocument),
                proposal = batch.proposal.copy(contractorDocument = normalizedDocument),
            ),
            foundInTasy = foundInTasy,
        )

        return IntegrationProcessingResult(
            contractorDocument = normalizedDocument,
            proposalCode = batch.proposal.proposalCode,
            beneficiariesProcessed = batch.beneficiaries.size,
            foundInTasy = foundInTasy,
            processedAt = OffsetDateTime.now(),
            sourceDirectory = loadIntegrationBatchPort.sourceDirectory(),
        )
    }

    private fun String.onlyDigits(): String = filter(Char::isDigit)
}
