# Roteiro de Apresentacao da POC

## Objetivo da demo
Apresentar a POC de integracao CRM Fundacao -> API Spring -> espelho local do Tasy no PostgreSQL, validando o fluxo comercial sem gravar no Tasy real.

## Abertura
- Contextualizar que a POC simula a integracao entre CRM e Tasy.
- Reforcar que o objetivo atual e validar fluxo, mapeamento e persistencia local.
- Reforcar que nesta fase a escrita acontece apenas no banco espelho local.

## Mostrar a arquitetura
- CRM Fundacao envia JSON
- API Spring recebe e processa
- Banco PostgreSQL local persiste o espelho do Tasy
- Tasy real foi usado para mapear schema e relacionamentos, nao para escrita

## Mostrar os artefatos principais
- SDD: `docs/SDD_COMPLETO_Fundacao_Tasy.md`
- Mapeamento do espelho: `docs/MAPEAMENTO_ESPELHO_TASY.md`
- UI manual: `http://localhost:8082/espelho-tasy-ui.html`
- Swagger: `http://localhost:8082/swagger-ui.html`

## Fluxo da demo
1. Abrir a UI manual
2. Mostrar que o exemplo completo ja vem preenchido
3. Explicar rapidamente os blocos do JSON
4. Executar a persistencia pela UI
5. Mostrar o retorno do processamento
6. Confirmar que os dados foram persistidos no espelho local
7. Reforcar que nao houve escrita no Tasy

## Pontos para destacar
- O fluxo cobre contratante, beneficiarios, lead, prospect, proposta e contrato
- O espelho foi baseado em mapeamento real do Oracle/Tasy
- A UI permite teste manual rapido sem depender ainda do contrato final da federacao
- A estrutura atual prepara o projeto para receber os 3 JSONs oficiais

## Limites atuais da POC
- Ainda nao usamos os JSONs oficiais da federacao
- Ainda nao e a integracao final de producao
- A escrita esta restrita ao banco espelho local
- Regras finais de negocio ainda dependem de alinhamento funcional

## Fechamento
- A POC valida a viabilidade tecnica do fluxo
- O proximo passo e adaptar a entrada para os JSONs oficiais
- Depois disso, evoluir a integracao do espelho para o fluxo oficial acordado com a federacao
