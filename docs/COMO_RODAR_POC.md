# Como Rodar a POC

## Objetivo
Subir uma POC local em Kotlin/Spring Boot 3 que:

- consome os JSONs em `docs/jsons`
- consulta o Tasy apenas para leitura
- persiste os dados normalizados no PostgreSQL local da Fundacao em Docker

## Estrutura importante
- `docs/`: base documental usada como insumo do projeto
- `docs/jsons/`: pasta observada pela POC para carregar `contratante.json`, `proposta.json` e `beneficiarios.json`
- `src/main/resources/application.yml`: configuracao ativa da aplicacao Spring Boot
- `src/main/kotlin/com/unimedpg/atendimentomicro/infrastructure/config/JdbcConfig.kt`: configuracao ativa do datasource JDBC do Tasy
- `application-referencia-legado.yml`: referencia original recebida do ambiente legado/Tasy
- `JdbcConfig.kt`: referencia original recebida do ambiente legado/Tasy

## Banco Fundacao local
Suba o PostgreSQL local:

```bash
docker compose up -d
```

Banco padrao da POC:
- host: `localhost`
- porta: `5433`
- database: `fundacao_poc`
- usuario: `fundacao`
- senha: `fundacao`

## Configuracao do Tasy
Por padrao, a POC sobe com a consulta no Tasy desabilitada. Para habilitar:

```bash
set TASY_DATASOURCE_ENABLED=true
set TASY_LOOKUP_ENABLED=true
set TASY_DATASOURCE_URL=jdbc:oracle:thin:@//HOST:PORT/SERVICE_NAME
set TASY_DATASOURCE_USERNAME=usuario
set TASY_DATASOURCE_PASSWORD=senha
set TASY_DATASOURCE_DRIVER=oracle.jdbc.OracleDriver
```

Observacao:
- ajuste o SQL em `src/main/resources/application.yml` na chave `tasy.lookup.contractor-sql` conforme a tabela real mapeada no Tasy local de testes

## Como executar
No Windows:

```bash
gradlew.bat bootRun
```

No Linux/macOS:

```bash
./gradlew bootRun
```

## Como processar os JSONs
Com a API em execucao:

```bash
curl -X POST http://localhost:8082/api/poc/integracoes/processar-jsons
```

Saidas disponiveis:
- Swagger: `http://localhost:8082/swagger`
- Endpoint da POC: `POST /api/poc/integracoes/processar-jsons`

## Como processar o espelho Tasy
Arquivo de entrada:

```text
docs/jsons/espelho_tasy_fluxo_completo.json
```

Endpoint:

```bash
curl -X POST http://localhost:8082/api/espelho-tasy/processar-json
```

Resultado esperado:
- Persiste o fluxo comercial espelhado no PostgreSQL local
- Nao grava nada no Oracle/Tasy
- Mantem os nomes fisicos das tabelas do Tasy nas tabelas espelho locais
- Usa o schema `espelho_tasy_full` para isolar o espelho completo do restante da POC

## Mapeamento dos arquivos citados
- `docs`: documentacao funcional e tecnica que guiou a estrutura da POC
- `application-referencia-legado.yml`: artefato de referencia do ambiente atual; use para comparar perfis e credenciais legadas
- `JdbcConfig.kt`: artefato de referencia do datasource do Tasy; a versao executavel foi recriada dentro de `src/main/...`
- `docs/MAPEAMENTO_ESPELHO_TASY.md`: consolidacao das tabelas reais levantadas no Oracle/Tasy e do desenho do espelho local

## Fluxo da POC
1. Ler `contratante.json`
2. Ler `proposta.json`
3. Ler `beneficiarios.json`
4. Normalizar documento do contratante
5. Consultar o Tasy local, se habilitado
6. Persistir contratante, proposta e beneficiarios no banco Fundacao local
