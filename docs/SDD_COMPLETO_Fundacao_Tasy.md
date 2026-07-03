# SDD Completo - Integração Fundação x Tasy

## Visão Geral
Projeto de integração CRM Fundação -> Spring Boot -> Tasy.

## Objetivos
- Eliminar retrabalho e duplicidade de cadastro.
- Centralizar processo comercial no CRM.
- Automatizar criação de Lead, Prospect, Proposta e Contrato.

## Casos de Uso
1. Criar Lead
2. Aprovar Lead
3. Converter Prospect
4. Criar Proposta
5. Adicionar Beneficiários
6. Processar Portabilidade
7. Validar Proposta
8. Gerar Contrato

## Domínio
Lead -> Prospect -> Proposta -> Beneficiários -> Contrato

## Arquitetura
CRM Fundação -> API Spring -> Banco Tasy

## Tecnologias
Spring Boot 3
Java 21
PostgreSQL 16 em docker versão leve light
Flyway
Swagger
Docker

## Critérios de Aceite
Fluxo completo executado com sucesso.


## Vamos mapear as tabelas do Tasy primeiro para vermos como e onde iremos aplicar as integrações.

Acesso ao tasy em:
application.yml e jdbcConfig.kt


