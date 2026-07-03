package com.unimedpg.atendimentomicro.infrastructure.persistence.espelho.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.math.BigDecimal
import java.time.LocalDateTime

@Entity
@Table(name = "pessoa_juridica")
class PessoaJuridicaEspelhoEntity(
    @Id
    @Column(name = "cd_cgc", nullable = false)
    var cdCgc: String,
    @Column(name = "ds_razao_social", nullable = false)
    var dsRazaoSocial: String,
    @Column(name = "nm_fantasia", nullable = false)
    var nmFantasia: String,
    @Column(name = "cd_cep")
    var cdCep: String? = null,
    @Column(name = "ds_endereco")
    var dsEndereco: String? = null,
    @Column(name = "ds_bairro")
    var dsBairro: String? = null,
    @Column(name = "ds_municipio")
    var dsMunicipio: String? = null,
    @Column(name = "sg_estado")
    var sgEstado: String? = null,
    @Column(name = "dt_atualizacao", nullable = false)
    var dtAtualizacao: LocalDateTime,
    @Column(name = "nm_usuario", nullable = false)
    var nmUsuario: String,
    @Column(name = "ds_complemento")
    var dsComplemento: String? = null,
    @Column(name = "nr_telefone")
    var nrTelefone: String? = null,
    @Column(name = "nr_endereco")
    var nrEndereco: String? = null,
    @Column(name = "nr_fax")
    var nrFax: String? = null,
    @Column(name = "ds_email")
    var dsEmail: String? = null,
    @Column(name = "nm_pessoa_contato")
    var nmPessoaContato: String? = null,
    @Column(name = "nr_ramal_contato")
    var nrRamalContato: Long? = null,
    @Column(name = "nr_inscricao_estadual")
    var nrInscricaoEstadual: String? = null,
    @Column(name = "cd_tipo_pessoa")
    var cdTipoPessoa: Long? = null,
    @Column(name = "cd_conta_contabil")
    var cdContaContabil: String? = null,
    @Column(name = "ie_prod_fabric", nullable = false)
    var ieProdFabric: String,
    @Column(name = "ds_site_internet")
    var dsSiteInternet: String? = null,
    @Column(name = "ie_qualidade")
    var ieQualidade: String? = null,
    @Column(name = "cd_cond_pagto")
    var cdCondPagto: Long? = null,
    @Column(name = "qt_dia_prazo_entrega")
    var qtDiaPrazoEntrega: Long? = null,
    @Column(name = "ds_nome_abrev")
    var dsNomeAbrev: String? = null,
    @Column(name = "ie_situacao", nullable = false)
    var ieSituacao: String,
    @Column(name = "vl_minimo_nf")
    var vlMinimoNf: BigDecimal? = null,
    @Column(name = "ds_senha")
    var dsSenha: String? = null,
    @Column(name = "cd_pf_resp_tecnico")
    var cdPfRespTecnico: String? = null,
    @Column(name = "nr_alvara_sanitario")
    var nrAlvaraSanitario: String? = null,
    @Column(name = "nr_autor_func")
    var nrAutorFunc: String? = null,
    @Column(name = "nr_inscricao_municipal")
    var nrInscricaoMunicipal: String? = null,
    @Column(name = "cd_ans")
    var cdAns: String? = null,
    @Column(name = "cd_referencia_fornec")
    var cdReferenciaFornec: String? = null,
    @Column(name = "ie_tipo_titulo")
    var ieTipoTitulo: String? = null,
    @Column(name = "dt_validade_alvara_sanit")
    var dtValidadeAlvaraSanit: LocalDateTime? = null,
    @Column(name = "dt_validade_autor_func")
    var dtValidadeAutorFunc: LocalDateTime? = null,
    @Column(name = "dt_atualizacao_nrec")
    var dtAtualizacaoNrec: LocalDateTime? = null,
    @Column(name = "nm_usuario_nrec")
    var nmUsuarioNrec: String? = null,
    @Column(name = "ie_alterar_senha")
    var ieAlterarSenha: String? = null,
    @Column(name = "nr_seq_pais")
    var nrSeqPais: Long? = null,
    @Column(name = "cd_portador")
    var cdPortador: Long? = null,
    @Column(name = "cd_tipo_portador")
    var cdTipoPortador: Long? = null,
    @Column(name = "cd_internacional")
    var cdInternacional: String? = null,
    @Column(name = "cd_cnes")
    var cdCnes: String? = null,
    @Column(name = "cd_municipio_ibge")
    var cdMunicipioIbge: String? = null,
    @Column(name = "nr_seq_tipo_logradouro")
    var nrSeqTipoLogradouro: Long? = null,
    @Column(name = "ie_status_exportar")
    var ieStatusExportar: String? = null,
    @Column(name = "dt_integracao_externa")
    var dtIntegracaoExterna: LocalDateTime? = null,
    @Column(name = "ie_tipo_tributacao")
    var ieTipoTributacao: String? = null,
    @Column(name = "nr_certificado_boas_prat")
    var nrCertificadoBoasPrat: String? = null,
    @Column(name = "nr_alvara_sanitario_munic")
    var nrAlvaraSanitarioMunic: String? = null,
    @Column(name = "dt_validade_alvara_munic")
    var dtValidadeAlvaraMunic: LocalDateTime? = null,
    @Column(name = "dt_validade_resp_tecnico")
    var dtValidadeRespTecnico: LocalDateTime? = null,
    @Column(name = "dt_validade_cert_boas_prat")
    var dtValidadeCertBoasPrat: LocalDateTime? = null,
    @Column(name = "cd_cnpj_raiz")
    var cdCnpjRaiz: String? = null,
    @Column(name = "nr_ddi_telefone")
    var nrDdiTelefone: String? = null,
    @Column(name = "nr_ddd_telefone")
    var nrDddTelefone: String? = null,
    @Column(name = "nr_ddi_fax")
    var nrDdiFax: String? = null,
    @Column(name = "nr_ddd_fax")
    var nrDddFax: String? = null,
    @Column(name = "nr_registro_pls")
    var nrRegistroPls: String? = null,
    @Column(name = "ds_orgao_reg_resp_tecnico")
    var dsOrgaoRegRespTecnico: String? = null,
    @Column(name = "nr_registro_resp_tecnico")
    var nrRegistroRespTecnico: String? = null,
    @Column(name = "ds_resp_tecnico")
    var dsRespTecnico: String? = null,
    @Column(name = "nr_seq_cnae")
    var nrSeqCnae: Long? = null,
    @Column(name = "cd_cgc_mantenedora")
    var cdCgcMantenedora: String? = null,
    @Column(name = "cd_operadora_empresa")
    var cdOperadoraEmpresa: Long? = null,
    @Column(name = "cd_sistema_ant")
    var cdSistemaAnt: String? = null,
    @Column(name = "nr_seq_nat_juridica")
    var nrSeqNatJuridica: Long? = null,
    @Column(name = "ie_transporte")
    var ieTransporte: String? = null,
    @Column(name = "ie_forma_revisao")
    var ieFormaRevisao: String? = null,
    @Column(name = "dt_ultima_revisao")
    var dtUltimaRevisao: LocalDateTime? = null,
    @Column(name = "nm_usuario_revisao")
    var nmUsuarioRevisao: String? = null,
    @Column(name = "ds_observacao")
    var dsObservacao: String? = null,
    @Column(name = "ds_observacao_compl")
    var dsObservacaoCompl: String? = null,
    @Column(name = "nr_ccm")
    var nrCcm: Long? = null,
    @Column(name = "dt_integracao")
    var dtIntegracao: LocalDateTime? = null,
    @Column(name = "ie_fornecedor_opme")
    var ieFornecedorOpme: String? = null,
    @Column(name = "ie_status_envio")
    var ieStatusEnvio: String? = null,
    @Column(name = "ie_tipo_trib_municipal")
    var ieTipoTribMunicipal: String? = null,
    @Column(name = "nr_seq_regiao")
    var nrSeqRegiao: Long? = null,
    @Column(name = "nr_seq_ident_cnes")
    var nrSeqIdentCnes: Long? = null,
    @Column(name = "nr_cei")
    var nrCei: String? = null,
    @Column(name = "ie_empreendedor_individual")
    var ieEmpreendedorIndividual: String? = null,
    @Column(name = "nr_matricula_cei")
    var nrMatriculaCei: String? = null,
    @Column(name = "cd_curp")
    var cdCurp: String? = null,
    @Column(name = "cd_rfc")
    var cdRfc: String? = null,
    @Column(name = "ds_orientacao_cobranca")
    var dsOrientacaoCobranca: String? = null,
    @Column(name = "cd_cvm")
    var cdCvm: String? = null,
    @Column(name = "dt_criacao")
    var dtCriacao: LocalDateTime? = null,
    @Column(name = "nr_seq_idioma")
    var nrSeqIdioma: Long? = null,
    @Column(name = "nr_seq_tipo_asen")
    var nrSeqTipoAsen: Long? = null,
    @Column(name = "ie_tipo_inst_saude")
    var ieTipoInstSaude: Long? = null,
    @Column(name = "nr_autor_transp_resid")
    var nrAutorTranspResid: String? = null,
    @Column(name = "nr_autor_receb_resid")
    var nrAutorRecebResid: String? = null,
    @Column(name = "nr_seq_pessoa_endereco")
    var nrSeqPessoaEndereco: Long? = null,
    @Column(name = "ds_email_nfe")
    var dsEmailNfe: String? = null,
    @Column(name = "ie_tipo_secretaria")
    var ieTipoSecretaria: String? = null,
    @Column(name = "cd_uf_ibge")
    var cdUfIbge: Long? = null,
    @Column(name = "ie_tipo_contribuicao")
    var ieTipoContribuicao: String? = null,
    @Column(name = "cd_facility_code")
    var cdFacilityCode: String? = null,
    @Column(name = "ds_longitude")
    var dsLongitude: String? = null,
    @Column(name = "ds_latitude")
    var dsLatitude: String? = null,
    @Column(name = "ie_tipo_contribuinte")
    var ieTipoContribuinte: String? = null,
    @Column(name = "dt_validade_pj")
    var dtValidadePj: LocalDateTime? = null,
    @Column(name = "ie_instituicao_medica")
    var ieInstituicaoMedica: String? = null,
    @Column(name = "ds_resolucion")
    var dsResolucion: String? = null,
    @Column(name = "ie_regime_iva")
    var ieRegimeIva: String? = null,
    @Column(name = "cd_type_person")
    var cdTypePerson: String? = null,
    @Column(name = "cd_regime_fiscal")
    var cdRegimeFiscal: String? = null,
    @Column(name = "ie_registro_mercantil")
    var ieRegistroMercantil: String? = null,
    @Column(name = "ie_tipo_situacao_iibb")
    var ieTipoSituacaoIibb: String? = null,
    @Column(name = "nr_inscricao_iibb")
    var nrInscricaoIibb: String? = null,
    @Column(name = "ie_regime_ica")
    var ieRegimeIca: String? = null,
    @Column(name = "nr_registro_mercantil")
    var nrRegistroMercantil: String? = null,
    @Column(name = "dt_atualizacao_senha")
    var dtAtualizacaoSenha: LocalDateTime? = null,
    @Column(name = "ds_hist_senha")
    var dsHistSenha: String? = null,
    @Column(name = "nr_seq_cat_estab_saude")
    var nrSeqCatEstabSaude: Long? = null,
    @Column(name = "cd_fiscal_internacional")
    var cdFiscalInternacional: String? = null,
    @Column(name = "ie_tipo_uni_psiq")
    var ieTipoUniPsiq: String? = null,
    @Column(name = "ds_timezone")
    var dsTimezone: String? = null
)

@Entity
@Table(name = "pessoa_fisica")
class PessoaFisicaEspelhoEntity(
    @Id
    @Column(name = "cd_pessoa_fisica", nullable = false)
    var cdPessoaFisica: String,
    @Column(name = "ie_tipo_pessoa", nullable = false)
    var ieTipoPessoa: Long,
    @Column(name = "nm_pessoa_fisica", nullable = false)
    var nmPessoaFisica: String,
    @Column(name = "dt_atualizacao", nullable = false)
    var dtAtualizacao: LocalDateTime,
    @Column(name = "nm_usuario", nullable = false)
    var nmUsuario: String,
    @Column(name = "dt_nascimento")
    var dtNascimento: LocalDateTime? = null,
    @Column(name = "ie_sexo")
    var ieSexo: String? = null,
    @Column(name = "ie_estado_civil")
    var ieEstadoCivil: String? = null,
    @Column(name = "nr_cpf")
    var nrCpf: String? = null,
    @Column(name = "nr_identidade")
    var nrIdentidade: String? = null,
    @Column(name = "nr_telefone_celular")
    var nrTelefoneCelular: String? = null,
    @Column(name = "ie_grau_instrucao")
    var ieGrauInstrucao: Long? = null,
    @Column(name = "nr_cep_cidade_nasc")
    var nrCepCidadeNasc: String? = null,
    @Column(name = "nr_prontuario")
    var nrProntuario: Long? = null,
    @Column(name = "cd_religiao")
    var cdReligiao: Long? = null,
    @Column(name = "nr_pis_pasep")
    var nrPisPasep: String? = null,
    @Column(name = "cd_nacionalidade")
    var cdNacionalidade: String? = null,
    @Column(name = "ie_dependencia_sus")
    var ieDependenciaSus: String? = null,
    @Column(name = "qt_altura_cm")
    var qtAlturaCm: Long? = null,
    @Column(name = "ie_tipo_sangue")
    var ieTipoSangue: String? = null,
    @Column(name = "ie_fator_rh")
    var ieFatorRh: String? = null,
    @Column(name = "dt_obito")
    var dtObito: LocalDateTime? = null,
    @Column(name = "nr_iss")
    var nrIss: String? = null,
    @Column(name = "nr_inss")
    var nrInss: String? = null,
    @Column(name = "nr_cert_nasc")
    var nrCertNasc: String? = null,
    @Column(name = "cd_cargo")
    var cdCargo: Long? = null,
    @Column(name = "ds_codigo_prof")
    var dsCodigoProf: String? = null,
    @Column(name = "ie_funcionario")
    var ieFuncionario: String? = null,
    @Column(name = "nr_seq_cor_pele")
    var nrSeqCorPele: Long? = null,
    @Column(name = "ds_orgao_emissor_ci")
    var dsOrgaoEmissorCi: String? = null,
    @Column(name = "nr_cartao_nac_sus_ant")
    var nrCartaoNacSusAnt: Long? = null,
    @Column(name = "cd_cbo_sus")
    var cdCboSus: Long? = null,
    @Column(name = "cd_atividade_sus")
    var cdAtividadeSus: Long? = null,
    @Column(name = "ie_vinculo_sus")
    var ieVinculoSus: Long? = null,
    @Column(name = "cd_estabelecimento")
    var cdEstabelecimento: Long? = null,
    @Column(name = "cd_sistema_ant")
    var cdSistemaAnt: String? = null,
    @Column(name = "cd_funcionario")
    var cdFuncionario: String? = null,
    @Column(name = "nr_pager_bip")
    var nrPagerBip: String? = null,
    @Column(name = "nr_transacao_sus")
    var nrTransacaoSus: String? = null,
    @Column(name = "cd_medico")
    var cdMedico: String? = null,
    @Column(name = "nm_pessoa_pesquisa")
    var nmPessoaPesquisa: String? = null,
    @Column(name = "dt_emissao_ci")
    var dtEmissaoCi: LocalDateTime? = null,
    @Column(name = "nr_seq_conselho")
    var nrSeqConselho: Long? = null,
    @Column(name = "dt_admissao_hosp")
    var dtAdmissaoHosp: LocalDateTime? = null,
    @Column(name = "ie_fluencia_portugues")
    var ieFluenciaPortugues: String? = null,
    @Column(name = "nr_titulo_eleitor")
    var nrTituloEleitor: String? = null,
    @Column(name = "nr_zona")
    var nrZona: String? = null,
    @Column(name = "nr_secao")
    var nrSecao: String? = null,
    @Column(name = "nr_cartao_estrangeiro")
    var nrCartaoEstrangeiro: String? = null,
    @Column(name = "nr_reg_geral_estrang")
    var nrRegGeralEstrang: String? = null,
    @Column(name = "dt_chegada_brasil")
    var dtChegadaBrasil: LocalDateTime? = null,
    @Column(name = "nm_usuario_original")
    var nmUsuarioOriginal: String? = null,
    @Column(name = "ds_historico")
    var dsHistorico: String? = null,
    @Column(name = "dt_cadastro_original")
    var dtCadastroOriginal: LocalDateTime? = null,
    @Column(name = "dt_atualizacao_nrec")
    var dtAtualizacaoNrec: LocalDateTime? = null,
    @Column(name = "nm_usuario_nrec")
    var nmUsuarioNrec: String? = null,
    @Column(name = "ie_tipo_prontuario")
    var ieTipoProntuario: Long? = null,
    @Column(name = "ds_observacao")
    var dsObservacao: String? = null,
    @Column(name = "qt_dependente")
    var qtDependente: Long? = null,
    @Column(name = "nr_transplante")
    var nrTransplante: Long? = null,
    @Column(name = "cd_empresa")
    var cdEmpresa: Long? = null,
    @Column(name = "sg_emissora_ci")
    var sgEmissoraCi: String? = null,
    @Column(name = "dt_naturalizacao_pf")
    var dtNaturalizacaoPf: LocalDateTime? = null,
    @Column(name = "nr_ctps")
    var nrCtps: Long? = null,
    @Column(name = "nr_serie_ctps")
    var nrSerieCtps: String? = null,
    @Column(name = "uf_emissora_ctps")
    var ufEmissoraCtps: String? = null,
    @Column(name = "dt_emissao_ctps")
    var dtEmissaoCtps: LocalDateTime? = null,
    @Column(name = "nm_pessoa_fisica_sem_acento")
    var nmPessoaFisicaSemAcento: String? = null,
    @Column(name = "dt_revisao")
    var dtRevisao: LocalDateTime? = null,
    @Column(name = "nm_usuario_revisao")
    var nmUsuarioRevisao: String? = null,
    @Column(name = "dt_demissao_hosp")
    var dtDemissaoHosp: LocalDateTime? = null,
    @Column(name = "nr_contra_ref_sus")
    var nrContraRefSus: String? = null,
    @Column(name = "cd_puericultura")
    var cdPuericultura: Long? = null,
    @Column(name = "nr_portaria_nat")
    var nrPortariaNat: String? = null,
    @Column(name = "ds_senha")
    var dsSenha: String? = null,
    @Column(name = "ds_fonetica")
    var dsFonetica: String? = null,
    @Column(name = "ie_revisar")
    var ieRevisar: String? = null,
    @Column(name = "cd_cnes")
    var cdCnes: String? = null,
    @Column(name = "nr_seq_perfil")
    var nrSeqPerfil: Long? = null,
    @Column(name = "nr_same")
    var nrSame: Long? = null,
    @Column(name = "nr_seq_cbo_saude")
    var nrSeqCboSaude: Long? = null,
    @Column(name = "dt_integracao_externa")
    var dtIntegracaoExterna: LocalDateTime? = null,
    @Column(name = "ds_fonetica_cns")
    var dsFoneticaCns: String? = null,
    @Column(name = "dt_geracao_pront")
    var dtGeracaoPront: LocalDateTime? = null,
    @Column(name = "ds_apelido")
    var dsApelido: String? = null,
    @Column(name = "cd_municipio_ibge")
    var cdMunicipioIbge: String? = null,
    @Column(name = "nr_seq_pais")
    var nrSeqPais: Long? = null,
    @Column(name = "nr_cert_casamento")
    var nrCertCasamento: String? = null,
    @Column(name = "nr_seq_cartorio_nasc")
    var nrSeqCartorioNasc: Long? = null,
    @Column(name = "nr_seq_cartorio_casamento")
    var nrSeqCartorioCasamento: Long? = null,
    @Column(name = "dt_emissao_cert_nasc")
    var dtEmissaoCertNasc: LocalDateTime? = null,
    @Column(name = "dt_emissao_cert_casamento")
    var dtEmissaoCertCasamento: LocalDateTime? = null,
    @Column(name = "nr_livro_cert_nasc")
    var nrLivroCertNasc: Long? = null,
    @Column(name = "nr_livro_cert_casamento")
    var nrLivroCertCasamento: Long? = null,
    @Column(name = "nr_folha_cert_nasc")
    var nrFolhaCertNasc: Long? = null,
    @Column(name = "nr_folha_cert_casamento")
    var nrFolhaCertCasamento: Long? = null,
    @Column(name = "nr_seq_nut_perfil")
    var nrSeqNutPerfil: Long? = null,
    @Column(name = "nr_registro_pls")
    var nrRegistroPls: String? = null,
    @Column(name = "dt_validade_rg")
    var dtValidadeRg: LocalDateTime? = null,
    @Column(name = "qt_peso_nasc")
    var qtPesoNasc: Long? = null,
    @Column(name = "uf_conselho")
    var ufConselho: String? = null,
    @Column(name = "ie_status_exportar")
    var ieStatusExportar: String? = null,
    @Column(name = "ie_endereco_correspondencia")
    var ieEnderecoCorrespondencia: Long? = null,
    @Column(name = "nr_pront_dv")
    var nrProntDv: String? = null,
    @Column(name = "nm_abreviado")
    var nmAbreviado: String? = null,
    @Column(name = "nr_ddd_celular")
    var nrDddCelular: String? = null,
    @Column(name = "nr_ddi_celular")
    var nrDdiCelular: String? = null,
    @Column(name = "ie_frequenta_escola")
    var ieFrequentaEscola: String? = null,
    @Column(name = "nr_ccm")
    var nrCcm: Long? = null,
    @Column(name = "dt_fim_experiencia")
    var dtFimExperiencia: LocalDateTime? = null,
    @Column(name = "dt_validade_conselho")
    var dtValidadeConselho: LocalDateTime? = null,
    @Column(name = "ie_nf_correio")
    var ieNfCorreio: String? = null,
    @Column(name = "ds_profissao")
    var dsProfissao: String? = null,
    @Column(name = "ds_empresa_pf")
    var dsEmpresaPf: String? = null,
    @Column(name = "nr_passaporte")
    var nrPassaporte: String? = null,
    @Column(name = "cd_tipo_pj")
    var cdTipoPj: Long? = null,
    @Column(name = "nr_cnh")
    var nrCnh: String? = null,
    @Column(name = "nr_cert_militar")
    var nrCertMilitar: String? = null,
    @Column(name = "cd_perfil_ativo")
    var cdPerfilAtivo: Long? = null,
    @Column(name = "nr_pront_ext")
    var nrProntExt: String? = null,
    @Column(name = "dt_inicio_ocup_atual")
    var dtInicioOcupAtual: LocalDateTime? = null,
    @Column(name = "ie_situacao_conj_cns")
    var ieSituacaoConjCns: String? = null,
    @Column(name = "nr_folha_cert_div")
    var nrFolhaCertDiv: Long? = null,
    @Column(name = "nr_cert_divorcio")
    var nrCertDivorcio: String? = null,
    @Column(name = "nr_seq_cartorio_divorcio")
    var nrSeqCartorioDivorcio: Long? = null,
    @Column(name = "dt_emissao_cert_divorcio")
    var dtEmissaoCertDivorcio: LocalDateTime? = null,
    @Column(name = "nr_livro_cert_divorcio")
    var nrLivroCertDivorcio: Long? = null,
    @Column(name = "ie_escolaridade_cns")
    var ieEscolaridadeCns: String? = null,
    @Column(name = "dt_alta_institucional")
    var dtAltaInstitucional: LocalDateTime? = null,
    @Column(name = "dt_transplante")
    var dtTransplante: LocalDateTime? = null,
    @Column(name = "cd_familia")
    var cdFamilia: Long? = null,
    @Column(name = "nr_matricula_nasc")
    var nrMatriculaNasc: String? = null,
    @Column(name = "ie_doador")
    var ieDoador: String? = null,
    @Column(name = "dt_vencimento_cnh")
    var dtVencimentoCnh: LocalDateTime? = null,
    @Column(name = "ds_categoria_cnh")
    var dsCategoriaCnh: String? = null,
    @Column(name = "cd_pessoa_mae")
    var cdPessoaMae: String? = null,
    @Column(name = "dt_primeira_admissao")
    var dtPrimeiraAdmissao: LocalDateTime? = null,
    @Column(name = "dt_fim_prorrogacao")
    var dtFimProrrogacao: LocalDateTime? = null,
    @Column(name = "nr_certidao_obito")
    var nrCertidaoObito: String? = null,
    @Column(name = "nr_seq_etnia")
    var nrSeqEtnia: Long? = null,
    @Column(name = "nr_cartao_nac_sus")
    var nrCartaoNacSus: String? = null,
    @Column(name = "qt_peso")
    var qtPeso: Long? = null,
    @Column(name = "ie_emancipado")
    var ieEmancipado: String? = null,
    @Column(name = "ie_vinculo_profissional")
    var ieVinculoProfissional: Long? = null,
    @Column(name = "cd_nit")
    var cdNit: String? = null,
    @Column(name = "ie_dependente")
    var ieDependente: String? = null,
    @Column(name = "ds_email_ccih")
    var dsEmailCcih: String? = null,
    @Column(name = "cd_cgc_orig_transpl")
    var cdCgcOrigTranspl: String? = null,
    @Column(name = "dt_afastamento")
    var dtAfastamento: LocalDateTime? = null,
    @Column(name = "nr_seq_tipo_beneficio")
    var nrSeqTipoBeneficio: Long? = null,
    @Column(name = "nr_seq_tipo_incapacidade")
    var nrSeqTipoIncapacidade: Long? = null,
    @Column(name = "ie_tratamento_psiquiatrico")
    var ieTratamentoPsiquiatrico: String? = null,
    @Column(name = "nr_seq_agencia_inss")
    var nrSeqAgenciaInss: Long? = null,
    @Column(name = "qt_dias_ig")
    var qtDiasIg: Long? = null,
    @Column(name = "qt_semanas_ig")
    var qtSemanasIg: Long? = null,
    @Column(name = "ie_regra_ig")
    var ieRegraIg: String? = null,
    @Column(name = "dt_nascimento_ig")
    var dtNascimentoIg: LocalDateTime? = null,
    @Column(name = "ie_status_usuario_event")
    var ieStatusUsuarioEvent: String? = null,
    @Column(name = "cd_cid_direta")
    var cdCidDireta: String? = null,
    @Column(name = "ie_coren")
    var ieCoren: String? = null,
    @Column(name = "dt_validade_coren")
    var dtValidadeCoren: LocalDateTime? = null,
    @Column(name = "nm_social")
    var nmSocial: String? = null,
    @Column(name = "nr_seq_cor_olho")
    var nrSeqCorOlho: Long? = null,
    @Column(name = "nr_seq_cor_cabelo")
    var nrSeqCorCabelo: Long? = null,
    @Column(name = "dt_cad_sistema_ant")
    var dtCadSistemaAnt: LocalDateTime? = null,
    @Column(name = "ie_perm_sms_email")
    var iePermSmsEmail: String? = null,
    @Column(name = "nr_seq_classif_pac_age")
    var nrSeqClassifPacAge: Long? = null,
    @Column(name = "nr_inscricao_estadual")
    var nrInscricaoEstadual: String? = null,
    @Column(name = "ie_socio")
    var ieSocio: String? = null,
    @Column(name = "cd_ult_profissao")
    var cdUltProfissao: Long? = null,
    @Column(name = "ie_vegetariano")
    var ieVegetariano: String? = null,
    @Column(name = "ds_orientacao_cobranca")
    var dsOrientacaoCobranca: String? = null,
    @Column(name = "ie_conselheiro")
    var ieConselheiro: String? = null,
    @Column(name = "ie_fumante")
    var ieFumante: String? = null,
    @Column(name = "nr_codigo_serv_prest")
    var nrCodigoServPrest: String? = null,
    @Column(name = "dt_adocao")
    var dtAdocao: LocalDateTime? = null,
    @Column(name = "nr_celular_numeros")
    var nrCelularNumeros: Long? = null,
    @Column(name = "ds_laudo_anat_patol")
    var dsLaudoAnatPatol: String? = null,
    @Column(name = "dt_laudo_anat_patol")
    var dtLaudoAnatPatol: LocalDateTime? = null,
    @Column(name = "nr_ric")
    var nrRic: String? = null,
    @Column(name = "ie_consiste_nr_serie_nf")
    var ieConsisteNrSerieNf: String? = null,
    @Column(name = "nr_rga")
    var nrRga: String? = null,
    @Column(name = "cd_pessoa_cross")
    var cdPessoaCross: Long? = null,
    @Column(name = "cd_barras_pessoa")
    var cdBarrasPessoa: String? = null,
    @Column(name = "nr_seq_funcao_pf")
    var nrSeqFuncaoPf: Long? = null,
    @Column(name = "nm_usuario_princ_ci")
    var nmUsuarioPrincCi: String? = null,
    @Column(name = "nr_seq_turno_trabalho")
    var nrSeqTurnoTrabalho: Long? = null,
    @Column(name = "nr_seq_chefia")
    var nrSeqChefia: Long? = null,
    @Column(name = "cd_declaracao_nasc_vivo")
    var cdDeclaracaoNascVivo: String? = null,
    @Column(name = "nr_termo_cert_nasc")
    var nrTermoCertNasc: String? = null,
    @Column(name = "cd_curp")
    var cdCurp: String? = null,
    @Column(name = "cd_rfc")
    var cdRfc: String? = null,
    @Column(name = "sg_estado_nasc")
    var sgEstadoNasc: String? = null,
    @Column(name = "ie_fornecedor")
    var ieFornecedor: String? = null,
    @Column(name = "cd_ife")
    var cdIfe: String? = null,
    @Column(name = "nm_primeiro_nome")
    var nmPrimeiroNome: String? = null,
    @Column(name = "nm_sobrenome_pai")
    var nmSobrenomePai: String? = null,
    @Column(name = "nm_sobrenome_mae")
    var nmSobrenomeMae: String? = null,
    @Column(name = "ie_rh_fraco")
    var ieRhFraco: String? = null,
    @Column(name = "ds_municipio_nasc_estrangeiro")
    var dsMunicipioNascEstrangeiro: String? = null,
    @Column(name = "ie_gemelar")
    var ieGemelar: String? = null,
    @Column(name = "ie_subtipo_sanguineo")
    var ieSubtipoSanguineo: Long? = null,
    @Column(name = "nr_seq_person_name")
    var nrSeqPersonName: Long? = null,
    @Column(name = "ie_tipo_definitivo_provisorio")
    var ieTipoDefinitivoProvisorio: String? = null,
    @Column(name = "nr_inscricao_municipal")
    var nrInscricaoMunicipal: String? = null,
    @Column(name = "nr_seq_forma_trat")
    var nrSeqFormaTrat: Long? = null,
    @Column(name = "nr_spss")
    var nrSpss: String? = null,
    @Column(name = "nr_seq_lingua_indigena")
    var nrSeqLinguaIndigena: Long? = null,
    @Column(name = "nr_seq_nome_solteiro")
    var nrSeqNomeSolteiro: Long? = null,
    @Column(name = "ie_considera_indio")
    var ieConsideraIndio: String? = null,
    @Column(name = "ie_ocupacao_habitual")
    var ieOcupacaoHabitual: String? = null,
    @Column(name = "ie_nasc_estimado")
    var ieNascEstimado: String? = null,
    @Column(name = "ie_unid_med_peso")
    var ieUnidMedPeso: String? = null,
    @Column(name = "qt_peso_um")
    var qtPesoUm: Long? = null,
    @Column(name = "cd_genero")
    var cdGenero: String? = null,
    @Column(name = "dt_atualizacao_senha")
    var dtAtualizacaoSenha: LocalDateTime? = null,
    @Column(name = "nr_genero")
    var nrGenero: Long? = null,
    @Column(name = "ie_sit_rua_sus")
    var ieSitRuaSus: String? = null,
    @Column(name = "cd_cond_pagto")
    var cdCondPagto: Long? = null,
    @Column(name = "ds_timezone")
    var dsTimezone: String? = null
)

@Entity
@Table(name = "com_leads")
class LeadEspelhoEntity(
    @Id
    @Column(name = "nr_sequencia", nullable = false)
    var nrSequencia: Long,
    @Column(name = "dt_atualizacao", nullable = false)
    var dtAtualizacao: LocalDateTime,
    @Column(name = "nm_usuario", nullable = false)
    var nmUsuario: String,
    @Column(name = "dt_atualizacao_nrec")
    var dtAtualizacaoNrec: LocalDateTime? = null,
    @Column(name = "nm_usuario_nrec")
    var nmUsuarioNrec: String? = null,
    @Column(name = "ie_situacao", nullable = false)
    var ieSituacao: String,
    @Column(name = "ds_descricao")
    var dsDescricao: String? = null,
    @Column(name = "ds_timezone")
    var dsTimezone: String? = null
)

@Entity
@Table(name = "com_solic_lead")
class SolicitacaoLeadEspelhoEntity(
    @Id
    @Column(name = "nr_sequencia", nullable = false)
    var nrSequencia: Long,
    @Column(name = "cd_cnpj", nullable = false)
    var cdCnpj: String,
    @Column(name = "ds_razao_social", nullable = false)
    var dsRazaoSocial: String,
    @Column(name = "dt_solicitacao", nullable = false)
    var dtSolicitacao: LocalDateTime,
    @Column(name = "dt_aprov_reprov")
    var dtAprovReprov: LocalDateTime? = null,
    @Column(name = "ie_status_lead", nullable = false)
    var ieStatusLead: String,
    @Column(name = "dt_atualizacao", nullable = false)
    var dtAtualizacao: LocalDateTime,
    @Column(name = "nm_usuario", nullable = false)
    var nmUsuario: String,
    @Column(name = "dt_atualizacao_nrec")
    var dtAtualizacaoNrec: LocalDateTime? = null,
    @Column(name = "nm_usuario_nrec")
    var nmUsuarioNrec: String? = null,
    @Column(name = "ie_natureza", nullable = false)
    var ieNatureza: String,
    @Column(name = "ie_tipo", nullable = false)
    var ieTipo: String,
    @Column(name = "ie_fase_venda", nullable = false)
    var ieFaseVenda: String,
    @Column(name = "nr_seq_canal", nullable = false)
    var nrSeqCanal: Long,
    @Column(name = "dt_revisao_prevista")
    var dtRevisaoPrevista: LocalDateTime? = null,
    @Column(name = "ie_status_neg", nullable = false)
    var ieStatusNeg: String,
    @Column(name = "nr_seq_ativ")
    var nrSeqAtiv: Long? = null,
    @Column(name = "ie_classificacao", nullable = false)
    var ieClassificacao: String,
    @Column(name = "qt_leito")
    var qtLeito: Long? = null,
    @Column(name = "qt_leito_uti")
    var qtLeitoUti: Long? = null,
    @Column(name = "ds_endereco")
    var dsEndereco: String? = null,
    @Column(name = "nr_endereco")
    var nrEndereco: String? = null,
    @Column(name = "ds_complemento")
    var dsComplemento: String? = null,
    @Column(name = "ds_bairro")
    var dsBairro: String? = null,
    @Column(name = "ds_municipio")
    var dsMunicipio: String? = null,
    @Column(name = "sg_estado")
    var sgEstado: String? = null,
    @Column(name = "cd_cep")
    var cdCep: String? = null,
    @Column(name = "nr_telefone")
    var nrTelefone: String? = null,
    @Column(name = "ds_email")
    var dsEmail: String? = null,
    @Column(name = "nm_pessoa_contato")
    var nmPessoaContato: String? = null,
    @Column(name = "nm_gestor_negocio")
    var nmGestorNegocio: String? = null,
    @Column(name = "ds_motivo_cadastro")
    var dsMotivoCadastro: String? = null,
    @Column(name = "ds_motivo_reprov")
    var dsMotivoReprov: String? = null,
    @Column(name = "ds_cargo_contato")
    var dsCargoContato: String? = null,
    @Column(name = "ds_setor_contato")
    var dsSetorContato: String? = null,
    @Column(name = "ie_produto")
    var ieProduto: String? = null,
    @Column(name = "dt_avaliacao")
    var dtAvaliacao: LocalDateTime? = null,
    @Column(name = "cd_forma_aquisicao")
    var cdFormaAquisicao: String? = null,
    @Column(name = "cd_pessoa_fisica")
    var cdPessoaFisica: String? = null,
    @Column(name = "nm_fantasia")
    var nmFantasia: String? = null,
    @Column(name = "nr_seq_pais")
    var nrSeqPais: Long? = null,
    @Column(name = "nr_ddi_telefone")
    var nrDdiTelefone: String? = null,
    @Column(name = "ds_timezone")
    var dsTimezone: String? = null
)

@Entity
@Table(name = "com_cliente")
class ClienteEspelhoEntity(
    @Id
    @Column(name = "nr_sequencia", nullable = false)
    var nrSequencia: Long,
    @Column(name = "cd_empresa", nullable = false)
    var cdEmpresa: Long,
    @Column(name = "dt_atualizacao", nullable = false)
    var dtAtualizacao: LocalDateTime,
    @Column(name = "nm_usuario", nullable = false)
    var nmUsuario: String,
    @Column(name = "cd_cnpj", nullable = false)
    var cdCnpj: String,
    @Column(name = "ie_situacao", nullable = false)
    var ieSituacao: String,
    @Column(name = "ie_natureza", nullable = false)
    var ieNatureza: String,
    @Column(name = "ie_fase_venda", nullable = false)
    var ieFaseVenda: String,
    @Column(name = "ie_status_neg", nullable = false)
    var ieStatusNeg: String,
    @Column(name = "ie_classificacao", nullable = false)
    var ieClassificacao: String,
    @Column(name = "ie_tipo", nullable = false)
    var ieTipo: String,
    @Column(name = "qt_leito")
    var qtLeito: Long? = null,
    @Column(name = "qt_leito_uti")
    var qtLeitoUti: Long? = null,
    @Column(name = "vl_fat_anual")
    var vlFatAnual: BigDecimal? = null,
    @Column(name = "ie_resp_atend", nullable = false)
    var ieRespAtend: String,
    @Column(name = "ie_recebe_visita", nullable = false)
    var ieRecebeVisita: String,
    @Column(name = "ie_referencia", nullable = false)
    var ieReferencia: String,
    @Column(name = "nr_seq_forma_conhec")
    var nrSeqFormaConhec: Long? = null,
    @Column(name = "dt_revisao_prevista")
    var dtRevisaoPrevista: LocalDateTime? = null,
    @Column(name = "nr_seq_ativ")
    var nrSeqAtiv: Long? = null,
    @Column(name = "qt_consultores")
    var qtConsultores: Long? = null,
    @Column(name = "dt_atualizacao_nrec")
    var dtAtualizacaoNrec: LocalDateTime? = null,
    @Column(name = "nm_usuario_nrec")
    var nmUsuarioNrec: String? = null,
    @Column(name = "dt_oficializacao_uso")
    var dtOficializacaoUso: LocalDateTime? = null,
    @Column(name = "ie_resp_coordenacao")
    var ieRespCoordenacao: String? = null,
    @Column(name = "qt_mes_estimado")
    var qtMesEstimado: Long? = null,
    @Column(name = "ie_hosp_escola", nullable = false)
    var ieHospEscola: String,
    @Column(name = "ie_resp_implantacao", nullable = false)
    var ieRespImplantacao: String,
    @Column(name = "qt_vidas")
    var qtVidas: Long? = null,
    @Column(name = "ie_revisado")
    var ieRevisado: String? = null,
    @Column(name = "ie_produto")
    var ieProduto: String? = null,
    @Column(name = "ie_acompanha_implantacao")
    var ieAcompanhaImplantacao: String? = null,
    @Column(name = "nr_visita_pos_venda")
    var nrVisitaPosVenda: Long? = null,
    @Column(name = "pr_possib_fecham")
    var prPossibFecham: BigDecimal? = null,
    @Column(name = "ie_inclusao_manual")
    var ieInclusaoManual: String? = null,
    @Column(name = "nr_seq_lead")
    var nrSeqLead: Long? = null,
    @Column(name = "ie_forma_aquisicao")
    var ieFormaAquisicao: String? = null,
    @Column(name = "dt_revisao_prevista_orig")
    var dtRevisaoPrevistaOrig: LocalDateTime? = null,
    @Column(name = "cd_estabelecimento")
    var cdEstabelecimento: Long? = null,
    @Column(name = "dt_cliente")
    var dtCliente: LocalDateTime? = null,
    @Column(name = "ie_migracao")
    var ieMigracao: String? = null,
    @Column(name = "dt_migrado")
    var dtMigrado: LocalDateTime? = null,
    @Column(name = "ie_porte_cliente")
    var iePorteCliente: String? = null,
    @Column(name = "ie_etapa_duplic")
    var ieEtapaDuplic: String? = null,
    @Column(name = "dt_aprov_duplic")
    var dtAprovDuplic: LocalDateTime? = null,
    @Column(name = "nr_seq_situacao_fin")
    var nrSeqSituacaoFin: Long? = null,
    @Column(name = "ie_restricao")
    var ieRestricao: String? = null,
    @Column(name = "ie_segmentacao")
    var ieSegmentacao: String? = null,
    @Column(name = "ie_recebe_auditoria")
    var ieRecebeAuditoria: String? = null,
    @Column(name = "ie_responde_psc")
    var ieRespondePsc: String? = null,
    @Column(name = "nr_seq_cliente_status")
    var nrSeqClienteStatus: Long? = null,
    @Column(name = "nr_seq_equip_audit")
    var nrSeqEquipAudit: Long? = null,
    @Column(name = "ds_timezone")
    var dsTimezone: String? = null
)

@Entity
@Table(name = "com_canal")
class CanalEspelhoEntity(
    @Id
    @Column(name = "nr_sequencia", nullable = false)
    var nrSequencia: Long,
    @Column(name = "cd_empresa", nullable = false)
    var cdEmpresa: Long,
    @Column(name = "dt_atualizacao", nullable = false)
    var dtAtualizacao: LocalDateTime,
    @Column(name = "nm_usuario", nullable = false)
    var nmUsuario: String,
    @Column(name = "nm_guerra", nullable = false)
    var nmGuerra: String,
    @Column(name = "cd_pessoa_fisica")
    var cdPessoaFisica: String? = null,
    @Column(name = "cd_cnpj")
    var cdCnpj: String? = null,
    @Column(name = "dt_inicio_atuacao")
    var dtInicioAtuacao: LocalDateTime? = null,
    @Column(name = "dt_desligamento")
    var dtDesligamento: LocalDateTime? = null,
    @Column(name = "ie_situacao", nullable = false)
    var ieSituacao: String,
    @Column(name = "dt_atualizacao_nrec")
    var dtAtualizacaoNrec: LocalDateTime? = null,
    @Column(name = "nm_usuario_nrec")
    var nmUsuarioNrec: String? = null,
    @Column(name = "nr_seq_tipo")
    var nrSeqTipo: Long? = null,
    @Column(name = "ds_email_contato")
    var dsEmailContato: String? = null,
    @Column(name = "cd_gerente")
    var cdGerente: String? = null,
    @Column(name = "ie_exibicao")
    var ieExibicao: String? = null,
    @Column(name = "ds_timezone")
    var dsTimezone: String? = null
)

@Entity
@Table(name = "cml_prospect")
class ProspectEspelhoEntity(
    @Id
    @Column(name = "nr_sequencia", nullable = false)
    var nrSequencia: Long,
    @Column(name = "cd_estabelecimento", nullable = false)
    var cdEstabelecimento: Long,
    @Column(name = "dt_atualizacao", nullable = false)
    var dtAtualizacao: LocalDateTime,
    @Column(name = "nm_usuario", nullable = false)
    var nmUsuario: String,
    @Column(name = "dt_atualizacao_nrec")
    var dtAtualizacaoNrec: LocalDateTime? = null,
    @Column(name = "nm_usuario_nrec")
    var nmUsuarioNrec: String? = null,
    @Column(name = "cd_pessoa_fisica")
    var cdPessoaFisica: String? = null,
    @Column(name = "nr_seq_classif")
    var nrSeqClassif: Long? = null,
    @Column(name = "nr_seq_origem")
    var nrSeqOrigem: Long? = null,
    @Column(name = "nr_seq_estagio")
    var nrSeqEstagio: Long? = null,
    @Column(name = "nr_seq_atividade")
    var nrSeqAtividade: Long? = null,
    @Column(name = "dt_prospect")
    var dtProspect: LocalDateTime? = null,
    @Column(name = "dt_liberacao")
    var dtLiberacao: LocalDateTime? = null,
    @Column(name = "cd_cnpj")
    var cdCnpj: String? = null,
    @Column(name = "nr_seq_produto")
    var nrSeqProduto: Long? = null,
    @Column(name = "ds_cliente")
    var dsCliente: String? = null,
    @Column(name = "nr_seq_especialidade")
    var nrSeqEspecialidade: Long? = null,
    @Column(name = "nr_seq_lead")
    var nrSeqLead: Long? = null,
    @Column(name = "ds_timezone")
    var dsTimezone: String? = null
)

@Entity
@Table(name = "cml_produto")
class ProdutoEspelhoEntity(
    @Id
    @Column(name = "nr_sequencia", nullable = false)
    var nrSequencia: Long,
    @Column(name = "cd_estabelecimento", nullable = false)
    var cdEstabelecimento: Long,
    @Column(name = "ds_produto", nullable = false)
    var dsProduto: String,
    @Column(name = "dt_atualizacao", nullable = false)
    var dtAtualizacao: LocalDateTime,
    @Column(name = "nm_usuario", nullable = false)
    var nmUsuario: String,
    @Column(name = "dt_atualizacao_nrec")
    var dtAtualizacaoNrec: LocalDateTime? = null,
    @Column(name = "nm_usuario_nrec")
    var nmUsuarioNrec: String? = null,
    @Column(name = "ie_situacao", nullable = false)
    var ieSituacao: String,
    @Column(name = "ds_timezone")
    var dsTimezone: String? = null
)

@Entity
@Table(name = "cml_prospect_produto")
class ProdutoProspectEspelhoEntity(
    @Id
    @Column(name = "nr_sequencia", nullable = false)
    var nrSequencia: Long,
    @Column(name = "dt_atualizacao", nullable = false)
    var dtAtualizacao: LocalDateTime,
    @Column(name = "nm_usuario", nullable = false)
    var nmUsuario: String,
    @Column(name = "dt_atualizacao_nrec")
    var dtAtualizacaoNrec: LocalDateTime? = null,
    @Column(name = "nm_usuario_nrec")
    var nmUsuarioNrec: String? = null,
    @Column(name = "nr_seq_prospect", nullable = false)
    var nrSeqProspect: Long,
    @Column(name = "nr_seq_produto", nullable = false)
    var nrSeqProduto: Long,
    @Column(name = "ds_observacao")
    var dsObservacao: String? = null,
    @Column(name = "ds_timezone")
    var dsTimezone: String? = null
)

@Entity
@Table(name = "com_cliente_proposta")
class PropostaClienteEspelhoEntity(
    @Id
    @Column(name = "nr_sequencia", nullable = false)
    var nrSequencia: Long,
    @Column(name = "nr_seq_cliente", nullable = false)
    var nrSeqCliente: Long,
    @Column(name = "dt_atualizacao", nullable = false)
    var dtAtualizacao: LocalDateTime,
    @Column(name = "nm_usuario", nullable = false)
    var nmUsuario: String,
    @Column(name = "dt_proposta", nullable = false)
    var dtProposta: LocalDateTime,
    @Column(name = "dt_aprovacao")
    var dtAprovacao: LocalDateTime? = null,
    @Column(name = "nm_usuario_aprov")
    var nmUsuarioAprov: String? = null,
    @Column(name = "ds_arquivo")
    var dsArquivo: String? = null,
    @Column(name = "ds_observacao")
    var dsObservacao: String? = null,
    @Column(name = "cd_pessoa_fisica")
    var cdPessoaFisica: String? = null,
    @Column(name = "dt_atualizacao_nrec")
    var dtAtualizacaoNrec: LocalDateTime? = null,
    @Column(name = "nm_usuario_nrec")
    var nmUsuarioNrec: String? = null,
    @Column(name = "dt_liberacao")
    var dtLiberacao: LocalDateTime? = null,
    @Column(name = "nm_usuario_lib")
    var nmUsuarioLib: String? = null,
    @Column(name = "dt_cancelamento")
    var dtCancelamento: LocalDateTime? = null,
    @Column(name = "nm_usuario_cancelamento")
    var nmUsuarioCancelamento: String? = null,
    @Column(name = "dt_vencimento")
    var dtVencimento: LocalDateTime? = null,
    @Column(name = "ds_mot_alt_venc")
    var dsMotAltVenc: String? = null,
    @Column(name = "ie_escritorio_atual")
    var ieEscritorioAtual: String? = null,
    @Column(name = "ie_pos_vendas")
    var iePosVendas: String? = null,
    @Column(name = "dt_prev_fechamento")
    var dtPrevFechamento: LocalDateTime? = null,
    @Column(name = "ie_status")
    var ieStatus: String? = null,
    @Column(name = "pr_fechamento")
    var prFechamento: BigDecimal? = null,
    @Column(name = "dt_ini_implantacao")
    var dtIniImplantacao: LocalDateTime? = null,
    @Column(name = "ds_timezone")
    var dsTimezone: String? = null
)

@Entity
@Table(name = "com_canal_proposta")
class PropostaCanalEspelhoEntity(
    @Id
    @Column(name = "nr_sequencia", nullable = false)
    var nrSequencia: Long,
    @Column(name = "nr_seq_canal", nullable = false)
    var nrSeqCanal: Long,
    @Column(name = "dt_atualizacao", nullable = false)
    var dtAtualizacao: LocalDateTime,
    @Column(name = "nm_usuario", nullable = false)
    var nmUsuario: String,
    @Column(name = "dt_atualizacao_nrec")
    var dtAtualizacaoNrec: LocalDateTime? = null,
    @Column(name = "nm_usuario_nrec")
    var nmUsuarioNrec: String? = null,
    @Column(name = "nr_seq_produto", nullable = false)
    var nrSeqProduto: Long,
    @Column(name = "dt_proposta", nullable = false)
    var dtProposta: LocalDateTime,
    @Column(name = "qt_produto", nullable = false)
    var qtProduto: Long,
    @Column(name = "vl_total", nullable = false)
    var vlTotal: BigDecimal,
    @Column(name = "dt_aceite")
    var dtAceite: LocalDateTime? = null,
    @Column(name = "ds_observacao")
    var dsObservacao: String? = null,
    @Column(name = "nr_seq_cliente")
    var nrSeqCliente: Long? = null,
    @Column(name = "ds_timezone")
    var dsTimezone: String? = null
)

@Entity
@Table(name = "com_solic_contrato")
class SolicitacaoContratoEspelhoEntity(
    @Id
    @Column(name = "nr_sequencia", nullable = false)
    var nrSequencia: Long,
    @Column(name = "cd_cnpj", nullable = false)
    var cdCnpj: String,
    @Column(name = "ds_razao_social")
    var dsRazaoSocial: String? = null,
    @Column(name = "dt_solicitacao", nullable = false)
    var dtSolicitacao: LocalDateTime,
    @Column(name = "dt_aprov_reprov")
    var dtAprovReprov: LocalDateTime? = null,
    @Column(name = "ie_status_contrato", nullable = false)
    var ieStatusContrato: String,
    @Column(name = "dt_atualizacao", nullable = false)
    var dtAtualizacao: LocalDateTime,
    @Column(name = "nm_usuario", nullable = false)
    var nmUsuario: String,
    @Column(name = "dt_atualizacao_nrec")
    var dtAtualizacaoNrec: LocalDateTime? = null,
    @Column(name = "nm_usuario_nrec")
    var nmUsuarioNrec: String? = null,
    @Column(name = "ie_natureza", nullable = false)
    var ieNatureza: String,
    @Column(name = "ie_tipo", nullable = false)
    var ieTipo: String,
    @Column(name = "ie_fase_venda", nullable = false)
    var ieFaseVenda: String,
    @Column(name = "nr_seq_canal", nullable = false)
    var nrSeqCanal: Long,
    @Column(name = "qt_licenca", nullable = false)
    var qtLicenca: Long,
    @Column(name = "dt_revisao_prevista")
    var dtRevisaoPrevista: LocalDateTime? = null,
    @Column(name = "vl_unitario", nullable = false)
    var vlUnitario: BigDecimal,
    @Column(name = "ie_status_neg", nullable = false)
    var ieStatusNeg: String,
    @Column(name = "vl_total", nullable = false)
    var vlTotal: BigDecimal,
    @Column(name = "cd_pessoa_fisica")
    var cdPessoaFisica: String? = null,
    @Column(name = "nr_seq_ativ")
    var nrSeqAtiv: Long? = null,
    @Column(name = "ie_classificacao", nullable = false)
    var ieClassificacao: String,
    @Column(name = "dt_inicio_venc")
    var dtInicioVenc: LocalDateTime? = null,
    @Column(name = "qt_leito")
    var qtLeito: Long? = null,
    @Column(name = "qt_leito_uti")
    var qtLeitoUti: Long? = null,
    @Column(name = "vl_unit_manut")
    var vlUnitManut: BigDecimal? = null,
    @Column(name = "vl_manut_mensal")
    var vlManutMensal: BigDecimal? = null,
    @Column(name = "ds_endereco")
    var dsEndereco: String? = null,
    @Column(name = "dt_inicio_venc_manut")
    var dtInicioVencManut: LocalDateTime? = null,
    @Column(name = "nr_endereco")
    var nrEndereco: String? = null,
    @Column(name = "ds_complemento")
    var dsComplemento: String? = null,
    @Column(name = "vl_unit_distr", nullable = false)
    var vlUnitDistr: BigDecimal,
    @Column(name = "ds_bairro")
    var dsBairro: String? = null,
    @Column(name = "ds_municipio")
    var dsMunicipio: String? = null,
    @Column(name = "vl_distribuidor", nullable = false)
    var vlDistribuidor: BigDecimal,
    @Column(name = "sg_estado")
    var sgEstado: String? = null,
    @Column(name = "cd_cep")
    var cdCep: String? = null,
    @Column(name = "nr_telefone")
    var nrTelefone: String? = null,
    @Column(name = "ds_email")
    var dsEmail: String? = null,
    @Column(name = "nm_pessoa_contato")
    var nmPessoaContato: String? = null,
    @Column(name = "nm_gestor_negocio")
    var nmGestorNegocio: String? = null,
    @Column(name = "ds_motivo_cadastro")
    var dsMotivoCadastro: String? = null,
    @Column(name = "ds_motivo_reprov")
    var dsMotivoReprov: String? = null,
    @Column(name = "ds_cargo_contato")
    var dsCargoContato: String? = null,
    @Column(name = "ds_setor_contato")
    var dsSetorContato: String? = null,
    @Column(name = "ie_produto")
    var ieProduto: String? = null,
    @Column(name = "dt_avaliacao")
    var dtAvaliacao: LocalDateTime? = null,
    @Column(name = "nr_ddi_telefone")
    var nrDdiTelefone: String? = null,
    @Column(name = "cd_forma_aquisicao", nullable = false)
    var cdFormaAquisicao: String,
    @Column(name = "nm_fantasia")
    var nmFantasia: String? = null,
    @Column(name = "nr_seq_pais", nullable = false)
    var nrSeqPais: Long,
    @Column(name = "ds_timezone")
    var dsTimezone: String? = null
)

@Entity
@Table(name = "contrato")
class ContratoEspelhoEntity(
    @Id
    @Column(name = "nr_sequencia", nullable = false)
    var nrSequencia: Long,
    @Column(name = "cd_estabelecimento", nullable = false)
    var cdEstabelecimento: Long,
    @Column(name = "nr_seq_tipo_contrato", nullable = false)
    var nrSeqTipoContrato: Long,
    @Column(name = "ds_objeto_contrato", nullable = false)
    var dsObjetoContrato: String,
    @Column(name = "ie_renovacao", nullable = false)
    var ieRenovacao: String,
    @Column(name = "dt_atualizacao", nullable = false)
    var dtAtualizacao: LocalDateTime,
    @Column(name = "nm_usuario", nullable = false)
    var nmUsuario: String,
    @Column(name = "ie_situacao", nullable = false)
    var ieSituacao: String,
    @Column(name = "dt_inicio", nullable = false)
    var dtInicio: LocalDateTime,
    @Column(name = "dt_fim")
    var dtFim: LocalDateTime? = null,
    @Column(name = "cd_cgc_contratado")
    var cdCgcContratado: String? = null,
    @Column(name = "cd_pessoa_contratada")
    var cdPessoaContratada: String? = null,
    @Column(name = "qt_dias_rescisao")
    var qtDiasRescisao: Long? = null,
    @Column(name = "cd_contrato")
    var cdContrato: String? = null,
    @Column(name = "ie_prazo_contrato")
    var iePrazoContrato: String? = null,
    @Column(name = "nm_contato")
    var nmContato: String? = null,
    @Column(name = "cd_pessoa_resp")
    var cdPessoaResp: String? = null,
    @Column(name = "vl_total_contrato")
    var vlTotalContrato: BigDecimal? = null,
    @Column(name = "ds_atribuicao")
    var dsAtribuicao: String? = null,
    @Column(name = "ie_pagar_receber")
    var iePagarReceber: String? = null,
    @Column(name = "cd_pessoa_negoc")
    var cdPessoaNegoc: String? = null,
    @Column(name = "dt_revisao")
    var dtRevisao: LocalDateTime? = null,
    @Column(name = "ie_avisa_vencimento", nullable = false)
    var ieAvisaVencimento: String,
    @Column(name = "qt_dias_aviso_venc")
    var qtDiasAvisoVenc: Long? = null,
    @Column(name = "cd_cargo")
    var cdCargo: Long? = null,
    @Column(name = "ds_motivo_rescisao")
    var dsMotivoRescisao: String? = null,
    @Column(name = "nr_seq_forma_rescisao")
    var nrSeqFormaRescisao: Long? = null,
    @Column(name = "cd_setor")
    var cdSetor: Long? = null,
    @Column(name = "cd_condicao_pagamento")
    var cdCondicaoPagamento: Long? = null,
    @Column(name = "vl_multa_contratual")
    var vlMultaContratual: BigDecimal? = null,
    @Column(name = "ie_avisa_venc_setor", nullable = false)
    var ieAvisaVencSetor: String,
    @Column(name = "pr_multa_contratual")
    var prMultaContratual: BigDecimal? = null,
    @Column(name = "nr_seq_subtipo_contrato")
    var nrSeqSubtipoContrato: Long? = null,
    @Column(name = "ie_classificacao", nullable = false)
    var ieClassificacao: String,
    @Column(name = "dt_atualizacao_aditivo")
    var dtAtualizacaoAditivo: LocalDateTime? = null,
    @Column(name = "nr_seq_contrato_atual")
    var nrSeqContratoAtual: Long? = null,
    @Column(name = "nr_seq_aditivo")
    var nrSeqAditivo: Long? = null,
    @Column(name = "qt_dias_interv_aviso")
    var qtDiasIntervAviso: Long? = null,
    @Column(name = "nr_seq_area")
    var nrSeqArea: Long? = null,
    @Column(name = "nr_seq_indice_reajuste")
    var nrSeqIndiceReajuste: Long? = null,
    @Column(name = "dt_liberacao")
    var dtLiberacao: LocalDateTime? = null,
    @Column(name = "nm_usuario_lib")
    var nmUsuarioLib: String? = null,
    @Column(name = "ie_avisa_reajuste")
    var ieAvisaReajuste: String? = null,
    @Column(name = "dt_publicacao")
    var dtPublicacao: LocalDateTime? = null,
    @Column(name = "dt_atualizacao_nrec")
    var dtAtualizacaoNrec: LocalDateTime? = null,
    @Column(name = "nm_usuario_nrec")
    var nmUsuarioNrec: String? = null,
    @Column(name = "nr_solic_compra")
    var nrSolicCompra: Long? = null,
    @Column(name = "cd_operacao_nf")
    var cdOperacaoNf: Long? = null,
    @Column(name = "cd_natureza_operacao")
    var cdNaturezaOperacao: Long? = null,
    @Column(name = "ie_email_origem")
    var ieEmailOrigem: String? = null,
    @Column(name = "dt_assinatura")
    var dtAssinatura: LocalDateTime? = null,
    @Column(name = "nm_usuario_assinat")
    var nmUsuarioAssinat: String? = null,
    @Column(name = "qt_dias_reajuste")
    var qtDiasReajuste: Long? = null,
    @Column(name = "telefone_contato")
    var telefoneContato: String? = null,
    @Column(name = "email_contato")
    var emailContato: String? = null,
    @Column(name = "cd_cnpj_contratante")
    var cdCnpjContratante: String? = null,
    @Column(name = "cd_pessoa_contratante")
    var cdPessoaContratante: String? = null,
    @Column(name = "vl_custas_contrato")
    var vlCustasContrato: BigDecimal? = null,
    @Column(name = "pr_custas_contrato")
    var prCustasContrato: BigDecimal? = null,
    @Column(name = "ds_titulo_contrato")
    var dsTituloContrato: String? = null,
    @Column(name = "nr_documento_externo")
    var nrDocumentoExterno: String? = null,
    @Column(name = "ie_periodo_nf")
    var iePeriodoNf: String? = null,
    @Column(name = "qt_maximo_nf_periodo")
    var qtMaximoNfPeriodo: Long? = null,
    @Column(name = "qt_dias_revisao")
    var qtDiasRevisao: Long? = null,
    @Column(name = "nr_seq_contrato_gestao")
    var nrSeqContratoGestao: Long? = null,
    @Column(name = "vl_negociado")
    var vlNegociado: BigDecimal? = null,
    @Column(name = "nr_cpf_contato")
    var nrCpfContato: String? = null,
    @Column(name = "qt_dias_periodo")
    var qtDiasPeriodo: Long? = null,
    @Column(name = "ie_estagio")
    var ieEstagio: String? = null,
    @Column(name = "dt_encerramento")
    var dtEncerramento: LocalDateTime? = null,
    @Column(name = "nm_usuario_encer")
    var nmUsuarioEncer: String? = null,
    @Column(name = "ds_observacao")
    var dsObservacao: String? = null,
    @Column(name = "nr_seq_errata")
    var nrSeqErrata: Long? = null,
    @Column(name = "nr_seq_pendencia")
    var nrSeqPendencia: Long? = null,
    @Column(name = "ie_finalizado")
    var ieFinalizado: String? = null,
    @Column(name = "dt_finalizado")
    var dtFinalizado: LocalDateTime? = null,
    @Column(name = "nm_usuario_finaliz")
    var nmUsuarioFinaliz: String? = null,
    @Column(name = "ie_sla")
    var ieSla: String? = null,
    @Column(name = "ie_enviar_email_oc")
    var ieEnviarEmailOc: String? = null,
    @Column(name = "cd_medico_resp")
    var cdMedicoResp: String? = null,
    @Column(name = "vl_fatur_minimo")
    var vlFaturMinimo: BigDecimal? = null,
    @Column(name = "nr_seq_cliente")
    var nrSeqCliente: Long? = null,
    @Column(name = "nm_medico_externo")
    var nmMedicoExterno: String? = null,
    @Column(name = "ie_indice_reajuste")
    var ieIndiceReajuste: String? = null,
    @Column(name = "cd_paciente")
    var cdPaciente: String? = null,
    @Column(name = "cd_moeda_estrangeira")
    var cdMoedaEstrangeira: Long? = null,
    @Column(name = "cd_comprador")
    var cdComprador: String? = null,
    @Column(name = "dt_assinatura_orig")
    var dtAssinaturaOrig: LocalDateTime? = null,
    @Column(name = "nm_usuario_assinat_orig")
    var nmUsuarioAssinatOrig: String? = null,
    @Column(name = "ie_somente_oc_pagto")
    var ieSomenteOcPagto: String? = null,
    @Column(name = "ie_sistema_amort")
    var ieSistemaAmort: String? = null,
    @Column(name = "vl_taxa_banco_contrat")
    var vlTaxaBancoContrat: BigDecimal? = null,
    @Column(name = "ds_indexador")
    var dsIndexador: String? = null,
    @Column(name = "nr_ddi_telefone")
    var nrDdiTelefone: String? = null,
    @Column(name = "dt_ult_geracao_oc")
    var dtUltGeracaoOc: LocalDateTime? = null,
    @Column(name = "qt_dias_oc_auto")
    var qtDiasOcAuto: Long? = null,
    @Column(name = "dt_aprovacao")
    var dtAprovacao: LocalDateTime? = null,
    @Column(name = "nr_seq_aprovacao")
    var nrSeqAprovacao: Long? = null,
    @Column(name = "nr_seq_proc_aprov")
    var nrSeqProcAprov: Long? = null,
    @Column(name = "dt_desdobr_aprov")
    var dtDesdobrAprov: LocalDateTime? = null,
    @Column(name = "dt_reprovacao")
    var dtReprovacao: LocalDateTime? = null,
    @Column(name = "ie_motivo_reprovacao")
    var ieMotivoReprovacao: String? = null,
    @Column(name = "ds_justificativa_reprov")
    var dsJustificativaReprov: String? = null,
    @Column(name = "nm_usuario_aprov")
    var nmUsuarioAprov: String? = null,
    @Column(name = "vl_conv_estrangeiro")
    var vlConvEstrangeiro: BigDecimal? = null,
    @Column(name = "ie_risco")
    var ieRisco: String? = null,
    @Column(name = "ie_delegado")
    var ieDelegado: String? = null,
    @Column(name = "ie_fideicomiso")
    var ieFideicomiso: String? = null,
    @Column(name = "dt_fim_vig_philips")
    var dtFimVigPhilips: LocalDateTime? = null,
    @Column(name = "ds_timezone")
    var dsTimezone: String? = null
)

@Entity
@Table(name = "contrato_dependente")
class DependenteContratoEspelhoEntity(
    @Id
    @Column(name = "nr_sequencia", nullable = false)
    var nrSequencia: Long,
    @Column(name = "dt_atualizacao", nullable = false)
    var dtAtualizacao: LocalDateTime,
    @Column(name = "nm_usuario", nullable = false)
    var nmUsuario: String,
    @Column(name = "dt_atualizacao_nrec")
    var dtAtualizacaoNrec: LocalDateTime? = null,
    @Column(name = "nm_usuario_nrec")
    var nmUsuarioNrec: String? = null,
    @Column(name = "cd_pessoa_fisica")
    var cdPessoaFisica: String? = null,
    @Column(name = "nr_seq_contrato")
    var nrSeqContrato: Long? = null,
    @Column(name = "cd_cnpj")
    var cdCnpj: String? = null,
    @Column(name = "ie_tipo_pessoa")
    var ieTipoPessoa: String? = null,
    @Column(name = "ds_pessoa")
    var dsPessoa: String? = null,
    @Column(name = "ds_endereco")
    var dsEndereco: String? = null,
    @Column(name = "nr_telefone")
    var nrTelefone: String? = null,
    @Column(name = "ds_contato")
    var dsContato: String? = null,
    @Column(name = "ds_observacao")
    var dsObservacao: String? = null,
    @Column(name = "nr_ddi_telefone")
    var nrDdiTelefone: String? = null,
    @Column(name = "ds_timezone")
    var dsTimezone: String? = null
)

