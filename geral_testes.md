Para os teste de integração POC 

rodamos o projeto com o comando:

```bash
gradlew.bat bootRun
```

Temos os seguintes testes:
- Teste de integração com o espelho Tasy completo
- Teste de integração com o espelho Tasy manual

http://localhost:8082/espelho-tasy-ui.html
ou via swagger
http://localhost:8082/swagger-ui.html



os testes poc simulam a leitura de json do arquivo
- o espelho completo
- o espelho manual

onde temos o mamento do espelho das tabelas tasy ja a principio para os testes

## Observações

- Reunião 02/07: prioridade inicial era integrar contratantes primeiro e depois beneficiários.
- Reunião 02/07: a federação ainda iria encaminhar os 3 JSONs oficiais para configurarmos as APIs do nosso lado.
- SDD: o fluxo alvo definido foi `Lead -> Prospect -> Proposta -> Beneficiários -> Contrato`.
- SDD: o objetivo principal é centralizar o comercial no CRM e reduzir retrabalho no Tasy.

- O que foi feito: mapeamento real do Oracle/Tasy para espelho local no PostgreSQL.
- O que foi feito: espelho completo das tabelas principais do fluxo comercial mapeadas no documento `docs/MAPEAMENTO_ESPELHO_TASY.md`.
- O que foi feito: endpoint para leitura do JSON por arquivo/diretório e endpoint manual para receber o conteúdo JSON no request.
- O que foi feito: UI básica em `http://localhost:8082/espelho-tasy-ui.html` para colar, carregar e persistir o JSON como se fosse a integração.
- O que foi feito: exemplo completo na UI cobrindo contratante, pessoas físicas, lead, prospect, proposta, solicitação de contrato, contrato e dependente.

- Cobertura atual do fluxo: para POC e testes internos, cobrimos o fluxo ponta a ponta no espelho local.
- Cobertura atual do fluxo: conseguimos simular contratante, beneficiários e etapas comerciais até contrato no banco local.
- Cobertura atual do fluxo: a persistência está somente no banco espelho da Fundação, não no Tasy.

- Pendente para o fluxo real: receber e ajustar os 3 JSONs oficiais da federação.
- Pendente para o fluxo real: validar se o contrato final dos JSONs oficiais bate com o schema/modelo hoje espelhado.
- Pendente para o fluxo real: definir a integração definitiva de escrita/leitura operacional com o Tasy, caso essa etapa entre no escopo.
- Conclusão: para a POC de testes, o fluxo está coberto de forma satisfatória; para produção, ainda depende do alinhamento com os JSONs oficiais e da validação funcional final com a federação.
