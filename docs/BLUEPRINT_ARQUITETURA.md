# Blueprint Arquitetural

CRM Fundação
    |
    v
API Integração Spring
    |
    +--> Lead Service
    +--> Prospect Service
    +--> Proposta Service
    +--> Contrato Service
    |
    v
Banco Tasy

Fluxo:

Lead
 |
 v
Prospect
 |
 v
Proposta
 |
 v
Beneficiários
 |
 v
Portabilidade
 |
 v
Validação
 |
 v
Contrato

Regras:
- Não duplicar CNPJ
- Registrar logs
- Preparar integração Oracle/Tasy real
