# Mapeamento do Espelho Tasy

## Objetivo
Persistir no PostgreSQL da Fundacao um espelho do fluxo comercial do Tasy sem gravar no Oracle/Tasy.

## Origem real consultada
- Oracle/Tasy homologacao consultado via JDBC.
- Schema principal observado: `TASY`.
- A consulta foi feita em metadados do Oracle para descobrir tabelas, colunas e chaves do fluxo comercial.

## Fluxo mapeado
1. `com_leads`
2. `com_solic_lead`
3. `com_cliente`
4. `com_canal`
5. `cml_prospect`
6. `cml_produto`
7. `cml_prospect_produto`
8. `com_cliente_proposta`
9. `com_canal_proposta`
10. `com_solic_contrato`
11. `contrato`
12. `contrato_dependente`

## Tabelas-base de pessoa
- `pessoa_juridica`
- `pessoa_fisica`

## Relacionamentos-chave identificados
- `com_cliente.cd_cnpj -> pessoa_juridica.cd_cgc`
- `com_cliente.nr_seq_lead -> com_solic_lead.nr_sequencia`
- `com_canal.cd_pessoa_fisica -> pessoa_fisica.cd_pessoa_fisica`
- `com_canal.cd_cnpj -> pessoa_juridica.cd_cgc`
- `cml_prospect.nr_seq_lead -> com_leads.nr_sequencia`
- `cml_prospect.cd_pessoa_fisica -> pessoa_fisica.cd_pessoa_fisica`
- `cml_prospect.cd_cnpj -> pessoa_juridica.cd_cgc`
- `cml_prospect.nr_seq_produto -> cml_produto.nr_sequencia`
- `cml_prospect_produto.nr_seq_prospect -> cml_prospect.nr_sequencia`
- `cml_prospect_produto.nr_seq_produto -> cml_produto.nr_sequencia`
- `com_cliente_proposta.nr_seq_cliente -> com_cliente.nr_sequencia`
- `com_cliente_proposta.cd_pessoa_fisica -> pessoa_fisica.cd_pessoa_fisica`
- `com_canal_proposta.nr_seq_canal -> com_canal.nr_sequencia`
- `com_canal_proposta.nr_seq_cliente -> com_cliente.nr_sequencia`
- `com_solic_contrato.nr_seq_canal -> com_canal.nr_sequencia`
- `com_solic_contrato.cd_pessoa_fisica -> pessoa_fisica.cd_pessoa_fisica`
- `contrato.cd_cnpj_contratante -> pessoa_juridica.cd_cgc`
- `contrato.nr_seq_cliente -> com_cliente.nr_sequencia`
- `contrato_dependente.nr_seq_contrato -> contrato.nr_sequencia`
- `contrato_dependente.cd_pessoa_fisica -> pessoa_fisica.cd_pessoa_fisica`
- `contrato_dependente.cd_cnpj -> pessoa_juridica.cd_cgc`

## Estrategia adotada na aplicacao
- Classes e services em portugues.
- Tabelas espelho no PostgreSQL com nomes fisicos do Tasy.
- Colunas 100% espelhadas para as tabelas mapeadas do fluxo comercial.
- Persistencia somente no banco Fundacao local.
- Importacao via JSON unico de lote para facilitar versionamento e teste.
- Schema dedicado `espelho_tasy_full` para nao conflitar com a POC anterior.

## Arquivos principais
- JSON do espelho: `docs/jsons/espelho_tasy_fluxo_completo.json`
- Endpoint: `POST /api/espelho-tasy/processar-json`
- Entities: `src/main/kotlin/com/unimedpg/atendimentomicro/infrastructure/persistence/espelho/entity/EntidadesEspelhoTasy.kt`
- Service: `src/main/kotlin/com/unimedpg/atendimentomicro/application/service/ProcessarEspelhoTasyService.kt`
- Loader: `src/main/kotlin/com/unimedpg/atendimentomicro/infrastructure/json/CarregadorJsonEspelhoTasy.kt`

## Observacao importante
O espelho implementado agora cobre todas as colunas das tabelas selecionadas no fluxo comercial levantado no Oracle/Tasy. O proximo passo natural passa a ser ampliar o conjunto de tabelas espelhadas, e nao mais completar colunas destas tabelas.
