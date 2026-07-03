# Checklist de Homologacao do Fluxo

## Objetivo
Validar de forma objetiva o fluxo da POC de integracao CRM Fundacao -> API Spring -> espelho local do Tasy no PostgreSQL.

## Acesso
- Aplicacao: `http://localhost:8082`
- UI manual: `http://localhost:8082/espelho-tasy-ui.html`
- Swagger: `http://localhost:8082/swagger-ui/index.html`
- Endpoint manual: `POST /api/espelho-tasy/processar-json-manual`
- Endpoint por arquivo: `POST /api/espelho-tasy/processar-json`

## Preparacao
- [ x ] Subir a aplicacao com `gradlew.bat bootRun`
- [ x ] Confirmar que a UI abre em `http://localhost:8082/espelho-tasy-ui.html`
- [ x ] Confirmar que o health responde em `GET /api/espelho-tasy/health`
- [ x ] Confirmar que o banco PostgreSQL local esta acessivel
- [ x ] Confirmar que o schema `espelho_tasy_full` existe

## Homologacao Funcional

### 1. Contratante
- [ x ] Validar carga de `pessoasJuridicas`
- [ x ] Validar campos obrigatorios do contratante
- [ x ] Validar persistencia em `pessoa_juridica`

### 2. Pessoas Fisicas
- [ x ] Validar carga de `pessoasFisicas`
- [ x ] Validar titular e dependente no JSON
- [ x ] Validar persistencia em `pessoa_fisica`

### 3. Lead
- [ ] Validar carga de `leads`
- [ x ] Validar carga de `solicitacoesLead`
- [ x ] Validar relacionamento com contratante/canal/pessoa fisica
- [ x ] Validar persistencia em `com_leads` e `com_solic_lead`

### 4. Cliente e Canal
- [ x ] Validar carga de `clientes`
- [ x ] Validar carga de `canais`
- [ x ] Validar persistencia em `com_cliente` e `com_canal`

### 5. Prospect e Produto
- [ x ] Validar carga de `prospects`
- [ x ] Validar carga de `produtos`
- [ x ] Validar carga de `produtosProspect` 
- [ x ] Validar persistencia em `cml_prospect`, `cml_produto` e `cml_prospect_produto`

### 6. Proposta
- [ ] Validar carga de `propostasCliente`
- [ ] Validar carga de `propostasCanal`
- [ ] Validar persistencia em `com_cliente_proposta` e `com_canal_proposta`

### 7. Contrato
- [ ] Validar carga de `solicitacoesContrato`
- [ ] Validar carga de `contratos`
- [ ] Validar carga de `dependentesContrato`
- [ ] Validar persistencia em `com_solic_contrato`, `contrato` e `contrato_dependente`

## Homologacao Tecnica
- [ ] Validar envio pela UI com exemplo completo pre-preenchido
- [ ] Validar envio manual colando JSON customizado
- [ ] Validar upload de arquivo `.json`
- [ ] Validar retorno do resumo de processamento
- [ ] Validar que a persistencia ocorre apenas no PostgreSQL local
- [ ] Validar que nao ha escrita no Oracle/Tasy

## Validacao de Escopo
- [ ] Confirmar que o fluxo da POC cobre: Contratante -> Beneficiarios -> Lead -> Prospect -> Proposta -> Contrato
- [ ] Confirmar que o espelho local reflete o mapeamento atual do Tasy
- [ ] Confirmar aderencia com a SDD atual
- [ ] Confirmar aderencia com os encaminhamentos da reuniao de 02/07

## Pendencias Para Proxima Etapa
- [ ] Receber os 3 JSONs oficiais da federacao
- [ ] Comparar JSONs oficiais com o modelo atual da POC
- [ ] Ajustar contrato de entrada para o formato oficial
- [ ] Validar regras de negocio finais com a federacao
- [ ] Definir escopo da integracao real com Tasy alem do espelho local

## Resultado da Homologacao
- [ ] Homologado para POC interna
- [ ] Homologado para apresentacao funcional
- [ ] Pendente de ajustes
- [ ] Pendente de JSON oficial
