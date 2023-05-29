package br.com.msscsh.isoutil.pojos;

public class ArquivoElo {

    private String codigoMensagemTransacao;
    private String primeiroMapaBits;
    private String segundoMapaBits;
    private String numeroCartao;
    private String codigoTipoTransacao;
    private String tipoContaOrigem;
    private String tipoContaDestino;
    private String valorTransacaoMoedaLocal;
    private String valorTransacaoFaturaPortador;
    private String dataHorarioTransmissao;
    private String taxaValorFaturaPortador;
    private String taxaConversaoMoedaLocalParaLiquidacao;
    private String taxaConversaoFaturaPortador;
    private String identificadorTransacao;
    private String horaLocalTransacao;
    private String dataLocalTransacao;
    private String dataValidadeCartao;
    private String dataLiquidacao;
    private String dataConversao;
    private String codigoAtividade;
    private String codigoPaisAdquirente;
    private String modoEntradaPan;
    private String capacidadeEntradaPan;
    private String numeroSequencialCartao;
    private String codigoFuncao;
    private String codigoMotivoMensagem;
    private String codigoCapturaPinNoPos;
    private String valorTaxaTransacao;
    private String valorTaxaMoedaLiquidacao;
    private String codigoIdentificacaoRedeCaptura;
    private String codigoIdentificacaoInstituicaoRepasse;
    private String trilha2;
    private String trilha3;
    private String nsuRedeCaptura;
    private String codigoAutorizacao;
    private String codigoResposta;
    private String identificacaoTerminalEstabelecimentoComercial;
    private String codigoIdentificacaoEstabelecimento;
    private String nomeEstabelecimento;
    private String nomeCidade;
    private String codigoPaisEstado;
    private String trilha1;
    private String informacoesAdicionaisResposta;
    private String resultadoAvs;
    private String resultadoCve2;
    private String fonteAutorizacao;
    private String mudancaEndereco;
    private String resultadoCVVDCVVICVV;
    private String resultadoCriptograma;
    private String resultadoTVR;
    private String resultadoCVR;
    private String codigoRepostaCAVV;
    private String dadosAdicionaisNacionais;
    private String identificacaoPedido;
    private String parcelas;
    private String periodicidadeAmortizacao;
    private String taxaJuros;
    private String parcelasCarencia;
    private String periodicidadeCarencia;
    private String taxaJurosCarencia;
    private String informacoesAdicionais;
    private String cpnjEstabelecimento;
    private String compraParceladaVPS;
    private String compraParceladaVPR;
    private String compraParceladaVPP;
    private String compraParceladaSVA;
    private String compraParceladaSPA;
    private String compraParceladaSVB;
    private String compraParceladaSPB;
    private String cincoDigitosTrilha1;
    private String codigoCertificadoDigital;
    private String agroBNDES;
    private String indicadorIncrementoPreAutorizacao;
    private String informacoesBandeira;
    private String produto;
    private String identificacaoCarteiraDigital;
    private String codigoMoeda;
    private String codigoMoedaliquidacao;
    private String codigoMoedaFaturaPortador;
    private String dadosPIN;
    private String informacaoControleSeguranca;
    private String valoresAdicionais;
    private String tipoContaValorAdicional;
    private String tipoValorAdicional;
    private String codigoMoedaValorAdicional;
    private String indicadorCreditoDebito;
    private String valorAdicional;
    private String dadosEMV;
    private String dadosRelacionadosPortador;
    private String numeroReferenciaPagamento;
    private String dadosGeoTerminalEndereco;
    private String dadosGeoTerminalCEP;
    private String dadosGeoTerminalCodigoPais;
    private String dadosGeoTerminalNumeroLoja;
    private String dadosGeoTerminalNomeShopping;
    private String dadosTransporte;
    private String tipoTerminal;
    private String indicadorAprovacaoParcial;
    private String indicadorLocalizacaoTerminal;
    private String indicadorPresencaPortador;
    private String indicadorPresencaCartao;
    private String indicadorCapacidadeCapturaCartao;
    private String indicadorStatusTransacao;
    private String indicadorSegurancaTransacao;
    private String tipoDispositivoTerminal;
    private String capacidadeEntradaTerminal;
    private String dadosIdentificarTransacaoOnline;
    private String indicadorComercioEletronico;
    private String codigoGerenciamentoRedes1;
    private String codigoGerenciamentoRedes2;
    private String dadosIdentificarTransacaoOriginal;
    private String valorSubValorRealTransacao;
    private String valorSubValorRealLiquidacao;
    private String valorSubTipoTaxaTransacao; // Crédito ou Débito
    private String valorSubValorRealTaxaTransacao;
    private String valorSubTipoTaxaLiquidacao;
    private String codigoInstituicaoReceptora;
    private String dadosTransacoesEspecificas3;
    private String numeroIdentificadorMarketplaceSubcredenciador;
    private String dadosTransacoesEspecificas2;
    private String dadosTransacionais;
    private String digitosPAN;
    private String carteiraDigital;
    private String pan;
    private String token;
    private String expiracaoToken;
    private String situacaoToken;
    private String verificacaoCriptogramaToken;
    private String verificacaoEMVToken;
    private String verificacaoRestricaoToken;
    private String restricaoDataTransacao;
    private String restricaoValorTransacao;
    private String restricao;
    private String contadorToken;
    private String verificacaoCVEToken;
    private String restricaoMCC;
    private String resultadoTarjaToken;
    private String resultadoCVV2;
    private String numeroIdentificacaoRedeOriginal;
    private String valorTransacaoOriginal;
    private String dadosTransferenciaFundos;
    private String tipoPagamento;
    private String numeroUnicoReferencia;
    private String nomeRemetente;
    private String enderecoRemetente;
    private String cidadeRemetente;
    private String paisRemetente;
    private String cepRemetente;
    private String numeroConta;
    private String origemFundos;
    private String dataNascimentoRemetente;
    private String nomeDestinatario;
    private String dadosAdicionaisTransferencia;
    private String destinatario;
    private String deviceID;
    private String dadosAdicionaisAutenticacao;
    private String campoPromocional;
    private String qualificadorTransacoes;
    private String campoUsoPersonalizado;
    private String identificacaoCartaoCVE2;
    private String informacaoCVE2;
    private String indicadorVersao;

    public String getCodigoMensagemTransacao() {
	return codigoMensagemTransacao;
    }

    public void setCodigoMensagemTransacao(String codigoMensagemTransacao) {
	this.codigoMensagemTransacao = codigoMensagemTransacao;
    }

    public String getPrimeiroMapaBits() {
	return primeiroMapaBits;
    }

    public void setPrimeiroMapaBits(String primeiroMapaBits) {
	this.primeiroMapaBits = primeiroMapaBits;
    }

    public String getSegundoMapaBits() {
	return segundoMapaBits;
    }

    public void setSegundoMapaBits(String segundoMapaBits) {
	this.segundoMapaBits = segundoMapaBits;
    }

    public String getNumeroCartao() {
	return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
	this.numeroCartao = numeroCartao;
    }

    public String getCodigoTipoTransacao() {
	return codigoTipoTransacao;
    }

    public void setCodigoTipoTransacao(String codigoTipoTransacao) {
	this.codigoTipoTransacao = codigoTipoTransacao;
    }

    public String getTipoContaOrigem() {
	return tipoContaOrigem;
    }

    public void setTipoContaOrigem(String tipoContaOrigem) {
	this.tipoContaOrigem = tipoContaOrigem;
    }

    public String getTipoContaDestino() {
	return tipoContaDestino;
    }

    public void setTipoContaDestino(String tipoContaDestino) {
	this.tipoContaDestino = tipoContaDestino;
    }

    public String getValorTransacaoMoedaLocal() {
	return valorTransacaoMoedaLocal;
    }

    public void setValorTransacaoMoedaLocal(String valorTransacaoMoedaLocal) {
	this.valorTransacaoMoedaLocal = valorTransacaoMoedaLocal;
    }

    public String getValorTransacaoFaturaPortador() {
	return valorTransacaoFaturaPortador;
    }

    public void setValorTransacaoFaturaPortador(String valorTransacaoFaturaPortador) {
	this.valorTransacaoFaturaPortador = valorTransacaoFaturaPortador;
    }

    public String getDataHorarioTransmissao() {
	return dataHorarioTransmissao;
    }

    public void setDataHorarioTransmissao(String dataHorarioTransmissao) {
	this.dataHorarioTransmissao = dataHorarioTransmissao;
    }

    public String getTaxaValorFaturaPortador() {
	return taxaValorFaturaPortador;
    }

    public void setTaxaValorFaturaPortador(String taxaValorFaturaPortador) {
	this.taxaValorFaturaPortador = taxaValorFaturaPortador;
    }

    public String getTaxaConversaoMoedaLocalParaLiquidacao() {
	return taxaConversaoMoedaLocalParaLiquidacao;
    }

    public void setTaxaConversaoMoedaLocalParaLiquidacao(String taxaConversaoMoedaLocalParaLiquidacao) {
	this.taxaConversaoMoedaLocalParaLiquidacao = taxaConversaoMoedaLocalParaLiquidacao;
    }

    public String getTaxaConversaoFaturaPortador() {
	return taxaConversaoFaturaPortador;
    }

    public void setTaxaConversaoFaturaPortador(String taxaConversaoFaturaPortador) {
	this.taxaConversaoFaturaPortador = taxaConversaoFaturaPortador;
    }

    public String getIdentificadorTransacao() {
	return identificadorTransacao;
    }

    public void setIdentificadorTransacao(String identificadorTransacao) {
	this.identificadorTransacao = identificadorTransacao;
    }

    public String getHoraLocalTransacao() {
	return horaLocalTransacao;
    }

    public void setHoraLocalTransacao(String horaLocalTransacao) {
	this.horaLocalTransacao = horaLocalTransacao;
    }

    public String getDataLocalTransacao() {
	return dataLocalTransacao;
    }

    public void setDataLocalTransacao(String dataLocalTransacao) {
	this.dataLocalTransacao = dataLocalTransacao;
    }

    public String getDataValidadeCartao() {
	return dataValidadeCartao;
    }

    public void setDataValidadeCartao(String dataValidadeCartao) {
	this.dataValidadeCartao = dataValidadeCartao;
    }

    public String getDataLiquidacao() {
	return dataLiquidacao;
    }

    public void setDataLiquidacao(String dataLiquidacao) {
	this.dataLiquidacao = dataLiquidacao;
    }

    public String getDataConversao() {
	return dataConversao;
    }

    public void setDataConversao(String dataConversao) {
	this.dataConversao = dataConversao;
    }

    public String getCodigoAtividade() {
	return codigoAtividade;
    }

    public void setCodigoAtividade(String codigoAtividade) {
	this.codigoAtividade = codigoAtividade;
    }

    public String getCodigoPaisAdquirente() {
	return codigoPaisAdquirente;
    }

    public void setCodigoPaisAdquirente(String codigoPaisAdquirente) {
	this.codigoPaisAdquirente = codigoPaisAdquirente;
    }

    public String getModoEntradaPan() {
	return modoEntradaPan;
    }

    public void setModoEntradaPan(String modoEntradaPan) {
	this.modoEntradaPan = modoEntradaPan;
    }

    public String getCapacidadeEntradaPan() {
	return capacidadeEntradaPan;
    }

    public void setCapacidadeEntradaPan(String capacidadeEntradaPan) {
	this.capacidadeEntradaPan = capacidadeEntradaPan;
    }

    public String getNumeroSequencialCartao() {
	return numeroSequencialCartao;
    }

    public void setNumeroSequencialCartao(String numeroSequencialCartao) {
	this.numeroSequencialCartao = numeroSequencialCartao;
    }

    public String getCodigoFuncao() {
	return codigoFuncao;
    }

    public void setCodigoFuncao(String codigoFuncao) {
	this.codigoFuncao = codigoFuncao;
    }

    public String getCodigoMotivoMensagem() {
	return codigoMotivoMensagem;
    }

    public void setCodigoMotivoMensagem(String codigoMotivoMensagem) {
	this.codigoMotivoMensagem = codigoMotivoMensagem;
    }

    public String getCodigoCapturaPinNoPos() {
	return codigoCapturaPinNoPos;
    }

    public void setCodigoCapturaPinNoPos(String codigoCapturaPinNoPos) {
	this.codigoCapturaPinNoPos = codigoCapturaPinNoPos;
    }

    public String getValorTaxaTransacao() {
	return valorTaxaTransacao;
    }

    public void setValorTaxaTransacao(String valorTaxaTransacao) {
	this.valorTaxaTransacao = valorTaxaTransacao;
    }

    public String getValorTaxaMoedaLiquidacao() {
	return valorTaxaMoedaLiquidacao;
    }

    public void setValorTaxaMoedaLiquidacao(String valorTaxaMoedaLiquidacao) {
	this.valorTaxaMoedaLiquidacao = valorTaxaMoedaLiquidacao;
    }

    public String getCodigoIdentificacaoRedeCaptura() {
	return codigoIdentificacaoRedeCaptura;
    }

    public void setCodigoIdentificacaoRedeCaptura(String codigoIdentificacaoRedeCaptura) {
	this.codigoIdentificacaoRedeCaptura = codigoIdentificacaoRedeCaptura;
    }

    public String getCodigoIdentificacaoInstituicaoRepasse() {
	return codigoIdentificacaoInstituicaoRepasse;
    }

    public void setCodigoIdentificacaoInstituicaoRepasse(String codigoIdentificacaoInstituicaoRepasse) {
	this.codigoIdentificacaoInstituicaoRepasse = codigoIdentificacaoInstituicaoRepasse;
    }

    public String getTrilha2() {
	return trilha2;
    }

    public void setTrilha2(String trilha2) {
	this.trilha2 = trilha2;
    }

    public String getTrilha3() {
	return trilha3;
    }

    public void setTrilha3(String trilha3) {
	this.trilha3 = trilha3;
    }

    public String getNsuRedeCaptura() {
	return nsuRedeCaptura;
    }

    public void setNsuRedeCaptura(String nsuRedeCaptura) {
	this.nsuRedeCaptura = nsuRedeCaptura;
    }

    public String getCodigoAutorizacao() {
	return codigoAutorizacao;
    }

    public void setCodigoAutorizacao(String codigoAutorizacao) {
	this.codigoAutorizacao = codigoAutorizacao;
    }

    public String getCodigoResposta() {
	return codigoResposta;
    }

    public void setCodigoResposta(String codigoResposta) {
	this.codigoResposta = codigoResposta;
    }

    public String getIdentificacaoTerminalEstabelecimentoComercial() {
	return identificacaoTerminalEstabelecimentoComercial;
    }

    public void setIdentificacaoTerminalEstabelecimentoComercial(String identificacaoTerminalEstabelecimentoComercial) {
	this.identificacaoTerminalEstabelecimentoComercial = identificacaoTerminalEstabelecimentoComercial;
    }

    public String getCodigoIdentificacaoEstabelecimento() {
	return codigoIdentificacaoEstabelecimento;
    }

    public void setCodigoIdentificacaoEstabelecimento(String codigoIdentificacaoEstabelecimento) {
	this.codigoIdentificacaoEstabelecimento = codigoIdentificacaoEstabelecimento;
    }

    public String getNomeEstabelecimento() {
	return nomeEstabelecimento;
    }

    public void setNomeEstabelecimento(String nomeEstabelecimento) {
	this.nomeEstabelecimento = nomeEstabelecimento;
    }

    public String getNomeCidade() {
	return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
	this.nomeCidade = nomeCidade;
    }

    public String getCodigoPaisEstado() {
	return codigoPaisEstado;
    }

    public void setCodigoPaisEstado(String codigoPaisEstado) {
	this.codigoPaisEstado = codigoPaisEstado;
    }

    public String getTrilha1() {
	return trilha1;
    }

    public void setTrilha1(String trilha1) {
	this.trilha1 = trilha1;
    }

    public String getInformacoesAdicionaisResposta() {
	return informacoesAdicionaisResposta;
    }

    public void setInformacoesAdicionaisResposta(String informacoesAdicionaisResposta) {
	this.informacoesAdicionaisResposta = informacoesAdicionaisResposta;
    }

    public String getResultadoAvs() {
	return resultadoAvs;
    }

    public void setResultadoAvs(String resultadoAvs) {
	this.resultadoAvs = resultadoAvs;
    }

    public String getResultadoCve2() {
	return resultadoCve2;
    }

    public void setResultadoCve2(String resultadoCve2) {
	this.resultadoCve2 = resultadoCve2;
    }

    public String getFonteAutorizacao() {
	return fonteAutorizacao;
    }

    public void setFonteAutorizacao(String fonteAutorizacao) {
	this.fonteAutorizacao = fonteAutorizacao;
    }

    public String getMudancaEndereco() {
	return mudancaEndereco;
    }

    public void setMudancaEndereco(String mudancaEndereco) {
	this.mudancaEndereco = mudancaEndereco;
    }

    public String getResultadoCVVDCVVICVV() {
	return resultadoCVVDCVVICVV;
    }

    public void setResultadoCVVDCVVICVV(String resultadoCVVDCVVICVV) {
	this.resultadoCVVDCVVICVV = resultadoCVVDCVVICVV;
    }

    public String getResultadoCriptograma() {
	return resultadoCriptograma;
    }

    public void setResultadoCriptograma(String resultadoCriptograma) {
	this.resultadoCriptograma = resultadoCriptograma;
    }

    public String getResultadoTVR() {
	return resultadoTVR;
    }

    public void setResultadoTVR(String resultadoTVR) {
	this.resultadoTVR = resultadoTVR;
    }

    public String getResultadoCVR() {
	return resultadoCVR;
    }

    public void setResultadoCVR(String resultadoCVR) {
	this.resultadoCVR = resultadoCVR;
    }

    public String getCodigoRepostaCAVV() {
	return codigoRepostaCAVV;
    }

    public void setCodigoRepostaCAVV(String codigoRepostaCAVV) {
	this.codigoRepostaCAVV = codigoRepostaCAVV;
    }

    public String getDadosAdicionaisNacionais() {
	return dadosAdicionaisNacionais;
    }

    public void setDadosAdicionaisNacionais(String dadosAdicionaisNacionais) {
	this.dadosAdicionaisNacionais = dadosAdicionaisNacionais;
    }

    public String getIdentificacaoPedido() {
	return identificacaoPedido;
    }

    public void setIdentificacaoPedido(String identificacaoPedido) {
	this.identificacaoPedido = identificacaoPedido;
    }

    public String getParcelas() {
	return parcelas;
    }

    public void setParcelas(String parcelas) {
	this.parcelas = parcelas;
    }

    public String getPeriodicidadeAmortizacao() {
	return periodicidadeAmortizacao;
    }

    public void setPeriodicidadeAmortizacao(String periodicidadeAmortizacao) {
	this.periodicidadeAmortizacao = periodicidadeAmortizacao;
    }

    public String getTaxaJuros() {
	return taxaJuros;
    }

    public void setTaxaJuros(String taxaJuros) {
	this.taxaJuros = taxaJuros;
    }

    public String getParcelasCarencia() {
	return parcelasCarencia;
    }

    public void setParcelasCarencia(String parcelasCarencia) {
	this.parcelasCarencia = parcelasCarencia;
    }

    public String getPeriodicidadeCarencia() {
	return periodicidadeCarencia;
    }

    public void setPeriodicidadeCarencia(String periodicidadeCarencia) {
	this.periodicidadeCarencia = periodicidadeCarencia;
    }

    public String getTaxaJurosCarencia() {
	return taxaJurosCarencia;
    }

    public void setTaxaJurosCarencia(String taxaJurosCarencia) {
	this.taxaJurosCarencia = taxaJurosCarencia;
    }

    public String getInformacoesAdicionais() {
	return informacoesAdicionais;
    }

    public void setInformacoesAdicionais(String informacoesAdicionais) {
	this.informacoesAdicionais = informacoesAdicionais;
    }

    public String getCpnjEstabelecimento() {
	return cpnjEstabelecimento;
    }

    public void setCpnjEstabelecimento(String cpnjEstabelecimento) {
	this.cpnjEstabelecimento = cpnjEstabelecimento;
    }

    public String getCompraParceladaVPS() {
	return compraParceladaVPS;
    }

    public void setCompraParceladaVPS(String compraParceladaVPS) {
	this.compraParceladaVPS = compraParceladaVPS;
    }

    public String getCompraParceladaVPR() {
	return compraParceladaVPR;
    }

    public void setCompraParceladaVPR(String compraParceladaVPR) {
	this.compraParceladaVPR = compraParceladaVPR;
    }

    public String getCompraParceladaVPP() {
	return compraParceladaVPP;
    }

    public void setCompraParceladaVPP(String compraParceladaVPP) {
	this.compraParceladaVPP = compraParceladaVPP;
    }

    public String getCompraParceladaSVA() {
	return compraParceladaSVA;
    }

    public void setCompraParceladaSVA(String compraParceladaSVA) {
	this.compraParceladaSVA = compraParceladaSVA;
    }

    public String getCompraParceladaSPA() {
	return compraParceladaSPA;
    }

    public void setCompraParceladaSPA(String compraParceladaSPA) {
	this.compraParceladaSPA = compraParceladaSPA;
    }

    public String getCompraParceladaSVB() {
	return compraParceladaSVB;
    }

    public void setCompraParceladaSVB(String compraParceladaSVB) {
	this.compraParceladaSVB = compraParceladaSVB;
    }

    public String getCompraParceladaSPB() {
	return compraParceladaSPB;
    }

    public void setCompraParceladaSPB(String compraParceladaSPB) {
	this.compraParceladaSPB = compraParceladaSPB;
    }

    public String getCincoDigitosTrilha1() {
	return cincoDigitosTrilha1;
    }

    public void setCincoDigitosTrilha1(String cincoDigitosTrilha1) {
	this.cincoDigitosTrilha1 = cincoDigitosTrilha1;
    }

    public String getCodigoCertificadoDigital() {
	return codigoCertificadoDigital;
    }

    public void setCodigoCertificadoDigital(String codigoCertificadoDigital) {
	this.codigoCertificadoDigital = codigoCertificadoDigital;
    }

    public String getAgroBNDES() {
	return agroBNDES;
    }

    public void setAgroBNDES(String agroBNDES) {
	this.agroBNDES = agroBNDES;
    }

    public String getIndicadorIncrementoPreAutorizacao() {
	return indicadorIncrementoPreAutorizacao;
    }

    public void setIndicadorIncrementoPreAutorizacao(String indicadorIncrementoPreAutorizacao) {
	this.indicadorIncrementoPreAutorizacao = indicadorIncrementoPreAutorizacao;
    }

    public String getInformacoesBandeira() {
	return informacoesBandeira;
    }

    public void setInformacoesBandeira(String informacoesBandeira) {
	this.informacoesBandeira = informacoesBandeira;
    }

    public String getProduto() {
	return produto;
    }

    public void setProduto(String produto) {
	this.produto = produto;
    }

    public String getIdentificacaoCarteiraDigital() {
	return identificacaoCarteiraDigital;
    }

    public void setIdentificacaoCarteiraDigital(String identificacaoCarteiraDigital) {
	this.identificacaoCarteiraDigital = identificacaoCarteiraDigital;
    }

    public String getCodigoMoeda() {
	return codigoMoeda;
    }

    public void setCodigoMoeda(String codigoMoeda) {
	this.codigoMoeda = codigoMoeda;
    }

    public String getCodigoMoedaliquidacao() {
	return codigoMoedaliquidacao;
    }

    public void setCodigoMoedaliquidacao(String codigoMoedaliquidacao) {
	this.codigoMoedaliquidacao = codigoMoedaliquidacao;
    }

    public String getCodigoMoedaFaturaPortador() {
	return codigoMoedaFaturaPortador;
    }

    public void setCodigoMoedaFaturaPortador(String codigoMoedaFaturaPortador) {
	this.codigoMoedaFaturaPortador = codigoMoedaFaturaPortador;
    }

    public String getDadosPIN() {
	return dadosPIN;
    }

    public void setDadosPIN(String dadosPIN) {
	this.dadosPIN = dadosPIN;
    }

    public String getInformacaoControleSeguranca() {
	return informacaoControleSeguranca;
    }

    public void setInformacaoControleSeguranca(String informacaoControleSeguranca) {
	this.informacaoControleSeguranca = informacaoControleSeguranca;
    }

    public String getValoresAdicionais() {
	return valoresAdicionais;
    }

    public void setValoresAdicionais(String valoresAdicionais) {
	this.valoresAdicionais = valoresAdicionais;
    }

    public String getTipoContaValorAdicional() {
	return tipoContaValorAdicional;
    }

    public void setTipoContaValorAdicional(String tipoContaValorAdicional) {
	this.tipoContaValorAdicional = tipoContaValorAdicional;
    }

    public String getTipoValorAdicional() {
	return tipoValorAdicional;
    }

    public void setTipoValorAdicional(String tipoValorAdicional) {
	this.tipoValorAdicional = tipoValorAdicional;
    }

    public String getCodigoMoedaValorAdicional() {
	return codigoMoedaValorAdicional;
    }

    public void setCodigoMoedaValorAdicional(String codigoMoedaValorAdicional) {
	this.codigoMoedaValorAdicional = codigoMoedaValorAdicional;
    }

    public String getIndicadorCreditoDebito() {
	return indicadorCreditoDebito;
    }

    public void setIndicadorCreditoDebito(String indicadorCreditoDebito) {
	this.indicadorCreditoDebito = indicadorCreditoDebito;
    }

    public String getValorAdicional() {
	return valorAdicional;
    }

    public void setValorAdicional(String valorAdicional) {
	this.valorAdicional = valorAdicional;
    }

    public String getDadosEMV() {
	return dadosEMV;
    }

    public void setDadosEMV(String dadosEMV) {
	this.dadosEMV = dadosEMV;
    }

    public String getDadosRelacionadosPortador() {
	return dadosRelacionadosPortador;
    }

    public void setDadosRelacionadosPortador(String dadosRelacionadosPortador) {
	this.dadosRelacionadosPortador = dadosRelacionadosPortador;
    }

    public String getNumeroReferenciaPagamento() {
	return numeroReferenciaPagamento;
    }

    public void setNumeroReferenciaPagamento(String numeroReferenciaPagamento) {
	this.numeroReferenciaPagamento = numeroReferenciaPagamento;
    }

    public String getDadosGeoTerminalEndereco() {
	return dadosGeoTerminalEndereco;
    }

    public void setDadosGeoTerminalEndereco(String dadosGeoTerminalEndereco) {
	this.dadosGeoTerminalEndereco = dadosGeoTerminalEndereco;
    }

    public String getDadosGeoTerminalCEP() {
	return dadosGeoTerminalCEP;
    }

    public void setDadosGeoTerminalCEP(String dadosGeoTerminalCEP) {
	this.dadosGeoTerminalCEP = dadosGeoTerminalCEP;
    }

    public String getDadosGeoTerminalCodigoPais() {
	return dadosGeoTerminalCodigoPais;
    }

    public void setDadosGeoTerminalCodigoPais(String dadosGeoTerminalCodigoPais) {
	this.dadosGeoTerminalCodigoPais = dadosGeoTerminalCodigoPais;
    }

    public String getDadosGeoTerminalNumeroLoja() {
	return dadosGeoTerminalNumeroLoja;
    }

    public void setDadosGeoTerminalNumeroLoja(String dadosGeoTerminalNumeroLoja) {
	this.dadosGeoTerminalNumeroLoja = dadosGeoTerminalNumeroLoja;
    }

    public String getDadosGeoTerminalNomeShopping() {
	return dadosGeoTerminalNomeShopping;
    }

    public void setDadosGeoTerminalNomeShopping(String dadosGeoTerminalNomeShopping) {
	this.dadosGeoTerminalNomeShopping = dadosGeoTerminalNomeShopping;
    }

    public String getDadosTransporte() {
	return dadosTransporte;
    }

    public void setDadosTransporte(String dadosTransporte) {
	this.dadosTransporte = dadosTransporte;
    }

    public String getTipoTerminal() {
	return tipoTerminal;
    }

    public void setTipoTerminal(String tipoTerminal) {
	this.tipoTerminal = tipoTerminal;
    }

    public String getIndicadorAprovacaoParcial() {
	return indicadorAprovacaoParcial;
    }

    public void setIndicadorAprovacaoParcial(String indicadorAprovacaoParcial) {
	this.indicadorAprovacaoParcial = indicadorAprovacaoParcial;
    }

    public String getIndicadorLocalizacaoTerminal() {
	return indicadorLocalizacaoTerminal;
    }

    public void setIndicadorLocalizacaoTerminal(String indicadorLocalizacaoTerminal) {
	this.indicadorLocalizacaoTerminal = indicadorLocalizacaoTerminal;
    }

    public String getIndicadorPresencaPortador() {
	return indicadorPresencaPortador;
    }

    public void setIndicadorPresencaPortador(String indicadorPresencaPortador) {
	this.indicadorPresencaPortador = indicadorPresencaPortador;
    }

    public String getIndicadorPresencaCartao() {
	return indicadorPresencaCartao;
    }

    public void setIndicadorPresencaCartao(String indicadorPresencaCartao) {
	this.indicadorPresencaCartao = indicadorPresencaCartao;
    }

    public String getIndicadorCapacidadeCapturaCartao() {
	return indicadorCapacidadeCapturaCartao;
    }

    public void setIndicadorCapacidadeCapturaCartao(String indicadorCapacidadeCapturaCartao) {
	this.indicadorCapacidadeCapturaCartao = indicadorCapacidadeCapturaCartao;
    }

    public String getIndicadorStatusTransacao() {
	return indicadorStatusTransacao;
    }

    public void setIndicadorStatusTransacao(String indicadorStatusTransacao) {
	this.indicadorStatusTransacao = indicadorStatusTransacao;
    }

    public String getIndicadorSegurancaTransacao() {
	return indicadorSegurancaTransacao;
    }

    public void setIndicadorSegurancaTransacao(String indicadorSegurancaTransacao) {
	this.indicadorSegurancaTransacao = indicadorSegurancaTransacao;
    }

    public String getTipoDispositivoTerminal() {
	return tipoDispositivoTerminal;
    }

    public void setTipoDispositivoTerminal(String tipoDispositivoTerminal) {
	this.tipoDispositivoTerminal = tipoDispositivoTerminal;
    }

    public String getCapacidadeEntradaTerminal() {
	return capacidadeEntradaTerminal;
    }

    public void setCapacidadeEntradaTerminal(String capacidadeEntradaTerminal) {
	this.capacidadeEntradaTerminal = capacidadeEntradaTerminal;
    }

    public String getDadosIdentificarTransacaoOnline() {
	return dadosIdentificarTransacaoOnline;
    }

    public void setDadosIdentificarTransacaoOnline(String dadosIdentificarTransacaoOnline) {
	this.dadosIdentificarTransacaoOnline = dadosIdentificarTransacaoOnline;
    }

    public String getIndicadorComercioEletronico() {
	return indicadorComercioEletronico;
    }

    public void setIndicadorComercioEletronico(String indicadorComercioEletronico) {
	this.indicadorComercioEletronico = indicadorComercioEletronico;
    }

    public String getCodigoGerenciamentoRedes1() {
	return codigoGerenciamentoRedes1;
    }

    public void setCodigoGerenciamentoRedes1(String codigoGerenciamentoRedes1) {
	this.codigoGerenciamentoRedes1 = codigoGerenciamentoRedes1;
    }

    public String getCodigoGerenciamentoRedes2() {
	return codigoGerenciamentoRedes2;
    }

    public void setCodigoGerenciamentoRedes2(String codigoGerenciamentoRedes2) {
	this.codigoGerenciamentoRedes2 = codigoGerenciamentoRedes2;
    }

    public String getDadosIdentificarTransacaoOriginal() {
	return dadosIdentificarTransacaoOriginal;
    }

    public void setDadosIdentificarTransacaoOriginal(String dadosIdentificarTransacaoOriginal) {
	this.dadosIdentificarTransacaoOriginal = dadosIdentificarTransacaoOriginal;
    }

    public String getValorSubValorRealTransacao() {
	return valorSubValorRealTransacao;
    }

    public void setValorSubValorRealTransacao(String valorSubValorRealTransacao) {
	this.valorSubValorRealTransacao = valorSubValorRealTransacao;
    }

    public String getValorSubValorRealLiquidacao() {
	return valorSubValorRealLiquidacao;
    }

    public void setValorSubValorRealLiquidacao(String valorSubValorRealLiquidacao) {
	this.valorSubValorRealLiquidacao = valorSubValorRealLiquidacao;
    }

    public String getValorSubTipoTaxaTransacao() {
	return valorSubTipoTaxaTransacao;
    }

    public void setValorSubTipoTaxaTransacao(String valorSubTipoTaxaTransacao) {
	this.valorSubTipoTaxaTransacao = valorSubTipoTaxaTransacao;
    }

    public String getValorSubValorRealTaxaTransacao() {
	return valorSubValorRealTaxaTransacao;
    }

    public void setValorSubValorRealTaxaTransacao(String valorSubValorRealTaxaTransacao) {
	this.valorSubValorRealTaxaTransacao = valorSubValorRealTaxaTransacao;
    }

    public String getValorSubTipoTaxaLiquidacao() {
	return valorSubTipoTaxaLiquidacao;
    }

    public void setValorSubTipoTaxaLiquidacao(String valorSubTipoTaxaLiquidacao) {
	this.valorSubTipoTaxaLiquidacao = valorSubTipoTaxaLiquidacao;
    }

    public String getCodigoInstituicaoReceptora() {
	return codigoInstituicaoReceptora;
    }

    public void setCodigoInstituicaoReceptora(String codigoInstituicaoReceptora) {
	this.codigoInstituicaoReceptora = codigoInstituicaoReceptora;
    }

    public String getDadosTransacoesEspecificas3() {
	return dadosTransacoesEspecificas3;
    }

    public void setDadosTransacoesEspecificas3(String dadosTransacoesEspecificas3) {
	this.dadosTransacoesEspecificas3 = dadosTransacoesEspecificas3;
    }

    public String getNumeroIdentificadorMarketplaceSubcredenciador() {
	return numeroIdentificadorMarketplaceSubcredenciador;
    }

    public void setNumeroIdentificadorMarketplaceSubcredenciador(String numeroIdentificadorMarketplaceSubcredenciador) {
	this.numeroIdentificadorMarketplaceSubcredenciador = numeroIdentificadorMarketplaceSubcredenciador;
    }

    public String getDadosTransacoesEspecificas2() {
	return dadosTransacoesEspecificas2;
    }

    public void setDadosTransacoesEspecificas2(String dadosTransacoesEspecificas2) {
	this.dadosTransacoesEspecificas2 = dadosTransacoesEspecificas2;
    }

    public String getDadosTransacionais() {
	return dadosTransacionais;
    }

    public void setDadosTransacionais(String dadosTransacionais) {
	this.dadosTransacionais = dadosTransacionais;
    }

    public String getDigitosPAN() {
	return digitosPAN;
    }

    public void setDigitosPAN(String digitosPAN) {
	this.digitosPAN = digitosPAN;
    }

    public String getCarteiraDigital() {
	return carteiraDigital;
    }

    public void setCarteiraDigital(String carteiraDigital) {
	this.carteiraDigital = carteiraDigital;
    }

    public String getPan() {
	return pan;
    }

    public void setPan(String pan) {
	this.pan = pan;
    }

    public String getToken() {
	return token;
    }

    public void setToken(String token) {
	this.token = token;
    }

    public String getExpiracaoToken() {
	return expiracaoToken;
    }

    public void setExpiracaoToken(String expiracaoToken) {
	this.expiracaoToken = expiracaoToken;
    }

    public String getSituacaoToken() {
	return situacaoToken;
    }

    public void setSituacaoToken(String situacaoToken) {
	this.situacaoToken = situacaoToken;
    }

    public String getVerificacaoCriptogramaToken() {
	return verificacaoCriptogramaToken;
    }

    public void setVerificacaoCriptogramaToken(String verificacaoCriptogramaToken) {
	this.verificacaoCriptogramaToken = verificacaoCriptogramaToken;
    }

    public String getVerificacaoEMVToken() {
	return verificacaoEMVToken;
    }

    public void setVerificacaoEMVToken(String verificacaoEMVToken) {
	this.verificacaoEMVToken = verificacaoEMVToken;
    }

    public String getVerificacaoRestricaoToken() {
	return verificacaoRestricaoToken;
    }

    public void setVerificacaoRestricaoToken(String verificacaoRestricaoToken) {
	this.verificacaoRestricaoToken = verificacaoRestricaoToken;
    }

    public String getRestricaoDataTransacao() {
	return restricaoDataTransacao;
    }

    public void setRestricaoDataTransacao(String restricaoDataTransacao) {
	this.restricaoDataTransacao = restricaoDataTransacao;
    }

    public String getRestricaoValorTransacao() {
	return restricaoValorTransacao;
    }

    public void setRestricaoValorTransacao(String restricaoValorTransacao) {
	this.restricaoValorTransacao = restricaoValorTransacao;
    }

    public String getRestricao() {
	return restricao;
    }

    public void setRestricao(String restricao) {
	this.restricao = restricao;
    }

    public String getContadorToken() {
	return contadorToken;
    }

    public void setContadorToken(String contadorToken) {
	this.contadorToken = contadorToken;
    }

    public String getVerificacaoCVEToken() {
	return verificacaoCVEToken;
    }

    public void setVerificacaoCVEToken(String verificacaoCVEToken) {
	this.verificacaoCVEToken = verificacaoCVEToken;
    }

    public String getRestricaoMCC() {
	return restricaoMCC;
    }

    public void setRestricaoMCC(String restricaoMCC) {
	this.restricaoMCC = restricaoMCC;
    }

    public String getResultadoTarjaToken() {
	return resultadoTarjaToken;
    }

    public void setResultadoTarjaToken(String resultadoTarjaToken) {
	this.resultadoTarjaToken = resultadoTarjaToken;
    }

    public String getResultadoCVV2() {
	return resultadoCVV2;
    }

    public void setResultadoCVV2(String resultadoCVV2) {
	this.resultadoCVV2 = resultadoCVV2;
    }

    public String getNumeroIdentificacaoRedeOriginal() {
	return numeroIdentificacaoRedeOriginal;
    }

    public void setNumeroIdentificacaoRedeOriginal(String numeroIdentificacaoRedeOriginal) {
	this.numeroIdentificacaoRedeOriginal = numeroIdentificacaoRedeOriginal;
    }

    public String getValorTransacaoOriginal() {
	return valorTransacaoOriginal;
    }

    public void setValorTransacaoOriginal(String valorTransacaoOriginal) {
	this.valorTransacaoOriginal = valorTransacaoOriginal;
    }

    public String getDadosTransferenciaFundos() {
	return dadosTransferenciaFundos;
    }

    public void setDadosTransferenciaFundos(String dadosTransferenciaFundos) {
	this.dadosTransferenciaFundos = dadosTransferenciaFundos;
    }

    public String getTipoPagamento() {
	return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
	this.tipoPagamento = tipoPagamento;
    }

    public String getNumeroUnicoReferencia() {
	return numeroUnicoReferencia;
    }

    public void setNumeroUnicoReferencia(String numeroUnicoReferencia) {
	this.numeroUnicoReferencia = numeroUnicoReferencia;
    }

    public String getNomeRemetente() {
	return nomeRemetente;
    }

    public void setNomeRemetente(String nomeRemetente) {
	this.nomeRemetente = nomeRemetente;
    }

    public String getEnderecoRemetente() {
	return enderecoRemetente;
    }

    public void setEnderecoRemetente(String enderecoRemetente) {
	this.enderecoRemetente = enderecoRemetente;
    }

    public String getCidadeRemetente() {
	return cidadeRemetente;
    }

    public void setCidadeRemetente(String cidadeRemetente) {
	this.cidadeRemetente = cidadeRemetente;
    }

    public String getPaisRemetente() {
	return paisRemetente;
    }

    public void setPaisRemetente(String paisRemetente) {
	this.paisRemetente = paisRemetente;
    }

    public String getCepRemetente() {
	return cepRemetente;
    }

    public void setCepRemetente(String cepRemetente) {
	this.cepRemetente = cepRemetente;
    }

    public String getNumeroConta() {
	return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
	this.numeroConta = numeroConta;
    }

    public String getOrigemFundos() {
	return origemFundos;
    }

    public void setOrigemFundos(String origemFundos) {
	this.origemFundos = origemFundos;
    }

    public String getDataNascimentoRemetente() {
	return dataNascimentoRemetente;
    }

    public void setDataNascimentoRemetente(String dataNascimentoRemetente) {
	this.dataNascimentoRemetente = dataNascimentoRemetente;
    }

    public String getNomeDestinatario() {
	return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
	this.nomeDestinatario = nomeDestinatario;
    }

    public String getDadosAdicionaisTransferencia() {
	return dadosAdicionaisTransferencia;
    }

    public void setDadosAdicionaisTransferencia(String dadosAdicionaisTransferencia) {
	this.dadosAdicionaisTransferencia = dadosAdicionaisTransferencia;
    }

    public String getDestinatario() {
	return destinatario;
    }

    public void setDestinatario(String destinatario) {
	this.destinatario = destinatario;
    }

    public String getDeviceID() {
	return deviceID;
    }

    public void setDeviceID(String deviceID) {
	this.deviceID = deviceID;
    }

    public String getDadosAdicionaisAutenticacao() {
	return dadosAdicionaisAutenticacao;
    }

    public void setDadosAdicionaisAutenticacao(String dadosAdicionaisAutenticacao) {
	this.dadosAdicionaisAutenticacao = dadosAdicionaisAutenticacao;
    }

    public String getCampoPromocional() {
	return campoPromocional;
    }

    public void setCampoPromocional(String campoPromocional) {
	this.campoPromocional = campoPromocional;
    }

    public String getQualificadorTransacoes() {
	return qualificadorTransacoes;
    }

    public void setQualificadorTransacoes(String qualificadorTransacoes) {
	this.qualificadorTransacoes = qualificadorTransacoes;
    }

    public String getCampoUsoPersonalizado() {
	return campoUsoPersonalizado;
    }

    public void setCampoUsoPersonalizado(String campoUsoPersonalizado) {
	this.campoUsoPersonalizado = campoUsoPersonalizado;
    }

    public String getIdentificacaoCartaoCVE2() {
	return identificacaoCartaoCVE2;
    }

    public void setIdentificacaoCartaoCVE2(String identificacaoCartaoCVE2) {
	this.identificacaoCartaoCVE2 = identificacaoCartaoCVE2;
    }

    public String getInformacaoCVE2() {
	return informacaoCVE2;
    }

    public void setInformacaoCVE2(String informacaoCVE2) {
	this.informacaoCVE2 = informacaoCVE2;
    }

    public String getIndicadorVersao() {
	return indicadorVersao;
    }

    public void setIndicadorVersao(String indicadorVersao) {
	this.indicadorVersao = indicadorVersao;
    }

}

