package br.com.msscsh.isoutil.builders;

import br.com.msscsh.isoutil.pojos.ArquivoElo;

public class ArquivoEloBuilder {

    private static ArquivoElo arquivoFinal;
    private static String mensagemKafka;
    private static int ponteiroDeCampo = 0;
    private static ArquivoEloBuilder instance;

    public ArquivoEloBuilder() {
    }

    public static ArquivoEloBuilder setMensagemKafka(String mensagemKafkaOut) {

	mensagemKafka = mensagemKafkaOut;
	arquivoFinal = new ArquivoElo();
	instance = new ArquivoEloBuilder(); // ponteiroDeCampo = 0
	return instance;

    }

    public static ArquivoEloBuilder getCodigoMensagemTransacao() {
	arquivoFinal.setCodigoMensagemTransacao(genericoGetCampo(4));
	return instance;

    }

    public static ArquivoEloBuilder getPrimeiroMapaBits() {
	arquivoFinal.setPrimeiroMapaBits(genericoGetCampo(64));
	return instance;

    }

    public static ArquivoEloBuilder getSegundoMapaBits() {
	arquivoFinal.setSegundoMapaBits(genericoGetCampo(64));
	return instance;

    }

    public static ArquivoEloBuilder getNumeroCartao() {
	arquivoFinal.setNumeroCartao(genericoGetCampo(19));
	return instance;

    }

    public static ArquivoEloBuilder getCodigoTipoTransacao() {
	arquivoFinal.setCodigoTipoTransacao(genericoGetCampo(2));
	return instance;

    }

    public static ArquivoEloBuilder getTipoContaOrigem() {
	arquivoFinal.setTipoContaOrigem(genericoGetCampo(2));
	return instance;

    }

    public static ArquivoEloBuilder getTipoContaDestino() {
	arquivoFinal.setTipoContaDestino(genericoGetCampo(2));
	return instance;

    }

    public static ArquivoEloBuilder getValorTransacaoMoedaLocal() {
	arquivoFinal.setValorTransacaoMoedaLocal(genericoGetCampo(12));
	return instance;

    }

    public static ArquivoEloBuilder getValorTransacaoFaturaPortador() {
	arquivoFinal.setValorTransacaoFaturaPortador(genericoGetCampo(12));
	return instance;

    }

    public static ArquivoEloBuilder getDataHorarioTransmissao() {
	arquivoFinal.setDataHorarioTransmissao(genericoGetCampo(10));
	return instance;

    }

    public static ArquivoEloBuilder getTaxaValorFaturaPortador() {
	arquivoFinal.setTaxaValorFaturaPortador(genericoGetCampo(8));
	return instance;

    }

    public static ArquivoEloBuilder getTaxaConversaoMoedaLocalParaLiquidacao() {
	arquivoFinal.setTaxaConversaoMoedaLocalParaLiquidacao(genericoGetCampo(8));
	return instance;

    }

    public static ArquivoEloBuilder getTaxaConversaoFaturaPortador() {
	arquivoFinal.setTaxaConversaoFaturaPortador(genericoGetCampo(8));
	return instance;

    }

    public static ArquivoEloBuilder getIdentificadorTransacao() {
	arquivoFinal.setIdentificadorTransacao(genericoGetCampo(6));
	return instance;

    }

    public static ArquivoEloBuilder getHoraLocalTransacao() {
	arquivoFinal.setHoraLocalTransacao(genericoGetCampo(6));
	return instance;

    }

    public static ArquivoEloBuilder getDataLocalTransacao() {
	arquivoFinal.setDataLocalTransacao(genericoGetCampo(4));
	return instance;

    }

    public static ArquivoEloBuilder getDataValidadeCartao() {
	arquivoFinal.setDataValidadeCartao(genericoGetCampo(4));
	return instance;

    }

    public static ArquivoEloBuilder getDataLiquidacao() {
	arquivoFinal.setDataLiquidacao(genericoGetCampo(4));
	return instance;

    }

    public static ArquivoEloBuilder getDataConversao() {
	arquivoFinal.setDataConversao(genericoGetCampo(4));
	return instance;

    }

    public static ArquivoEloBuilder getCodigoAtividade() {
	arquivoFinal.setCodigoAtividade(genericoGetCampo(4));
	return instance;

    }

    public static ArquivoEloBuilder getCodigoPaisAdquirente() {
	arquivoFinal.setCodigoPaisAdquirente(genericoGetCampo(3));
	return instance;

    }

    public static ArquivoEloBuilder getModoEntradaPan() {
	arquivoFinal.setModoEntradaPan(genericoGetCampo(2));
	return instance;

    }

    public static ArquivoEloBuilder getCapacidadeEntradaPan() {
	arquivoFinal.setCapacidadeEntradaPan(genericoGetCampo(1));
	return instance;

    }

    public static ArquivoEloBuilder getNumeroSequencialCartao() {
	arquivoFinal.setNumeroSequencialCartao(genericoGetCampo(3));
	return instance;

    }

    public static ArquivoEloBuilder getCodigoFuncao() {
	arquivoFinal.setCodigoFuncao(genericoGetCampo(3));
	return instance;

    }

    public static ArquivoEloBuilder getCodigoMotivoMensagem() {
	arquivoFinal.setCodigoMotivoMensagem(genericoGetCampo(2));
	return instance;

    }

    public static ArquivoEloBuilder getCodigoCapturaPinNoPos() {
	arquivoFinal.setCodigoCapturaPinNoPos(genericoGetCampo(2));
	return instance;

    }

    public static ArquivoEloBuilder getValorTaxaTransacao() {
	arquivoFinal.setValorTaxaTransacao(genericoGetCampo(9));
	return instance;

    }

    public static ArquivoEloBuilder getValorTaxaMoedaLiquidacao() {
	arquivoFinal.setValorTaxaMoedaLiquidacao(genericoGetCampo(9));
	return instance;

    }

    public static ArquivoEloBuilder getCodigoIdentificacaoRedeCaptura() {
	arquivoFinal.setCodigoIdentificacaoRedeCaptura(genericoGetCampo(11));
	return instance;

    }

    public static ArquivoEloBuilder getCodigoIdentificacaoInstituicaoRepasse() {
	arquivoFinal.setCodigoIdentificacaoInstituicaoRepasse(genericoGetCampo(11));
	return instance;

    }

    public static ArquivoEloBuilder getTrilha2() {
	arquivoFinal.setTrilha2(genericoGetCampo(37));
	return instance;

    }

    public static ArquivoEloBuilder getTrilha3() {
	arquivoFinal.setTrilha3(genericoGetCampo(104));
	return instance;

    }

    public static ArquivoEloBuilder getNsuRedeCaptura() {
	arquivoFinal.setNsuRedeCaptura(genericoGetCampo(12));
	return instance;

    }

    public static ArquivoEloBuilder getCodigoAutorizacao() {
	arquivoFinal.setCodigoAutorizacao(genericoGetCampo(6));
	return instance;

    }

    public static ArquivoEloBuilder getCodigoResposta() {
	arquivoFinal.setCodigoResposta(genericoGetCampo(2));
	return instance;

    }

    public static ArquivoEloBuilder getIdentificacaoTerminalEstabelecimentoComercial() {
	arquivoFinal.setIdentificacaoTerminalEstabelecimentoComercial(genericoGetCampo(8));
	return instance;

    }

    public static ArquivoEloBuilder getCodigoIdentificacaoEstabelecimento() {
	arquivoFinal.setCodigoIdentificacaoEstabelecimento(genericoGetCampo(15));
	return instance;

    }

    public static ArquivoEloBuilder getNomeEstabelecimento() {
	arquivoFinal.setNomeEstabelecimento(genericoGetCampo(22));
	return instance;

    }

    // ESPAÇO (1 campo)

    public static ArquivoEloBuilder getNomeCidade() {
	arquivoFinal.setNomeCidade(genericoGetCampo(13));
	return instance;

    }

    // ESPAÇO (1 campo)

    public static ArquivoEloBuilder getCodigoPaisEstado() {
	arquivoFinal.setCodigoPaisEstado(genericoGetCampo(3));
	return instance;

    }

    public static ArquivoEloBuilder getTrilha1() {
	arquivoFinal.setTrilha1(genericoGetCampo(45));
	return instance;

    }

    public static ArquivoEloBuilder getInformacoesAdicionaisResposta() {
	arquivoFinal.setInformacoesAdicionaisResposta(genericoGetCampo(0 /* Sem valor na tabela */));
	return instance;

    }

    public static ArquivoEloBuilder getResultadoAvs() {
	arquivoFinal.setResultadoAvs(genericoGetCampo(1));
	return instance;

    }

    public static ArquivoEloBuilder getResultadoCve2() {
	arquivoFinal.setResultadoCve2(genericoGetCampo(1));
	return instance;

    }

    public static ArquivoEloBuilder getFonteAutorizacao() {
	arquivoFinal.setFonteAutorizacao(genericoGetCampo(1));
	return instance;

    }

    public static ArquivoEloBuilder getMudancaEndereco() {
	arquivoFinal.setMudancaEndereco(genericoGetCampo(3));
	return instance;

    }

    public static ArquivoEloBuilder getResultadoCVVDCVVICVV() {
	arquivoFinal.setResultadoCVVDCVVICVV(genericoGetCampo(1));
	return instance;

    }

    public static ArquivoEloBuilder getResultadoCriptograma() {
	arquivoFinal.setResultadoCriptograma(genericoGetCampo(1));
	return instance;

    }

    public static ArquivoEloBuilder getResultadoTVR() {
	arquivoFinal.setResultadoTVR(genericoGetCampo(1));
	return instance;

    }

    public static ArquivoEloBuilder getResultadoCVR() {
	arquivoFinal.setResultadoCVR(genericoGetCampo(1));
	return instance;

    }

    public static ArquivoEloBuilder getCodigoRepostaCAVV() {
	arquivoFinal.setCodigoRepostaCAVV(genericoGetCampo(1));
	return instance;

    }

    public static ArquivoEloBuilder getDadosAdicionaisNacionais() {
	arquivoFinal.setDadosAdicionaisNacionais(genericoGetCampo(999));
	return instance;

    }

    public static ArquivoEloBuilder getIdentificacaoPedido() {
	arquivoFinal.setIdentificacaoPedido(genericoGetCampo(20));
	return instance;

    }

    public static ArquivoEloBuilder getParcelas() {
	arquivoFinal.setParcelas(genericoGetCampo(3));
	return instance;

    }

    public static ArquivoEloBuilder getPeriodicidadeAmortizacao() {
	arquivoFinal.setPeriodicidadeAmortizacao(genericoGetCampo(2));
	return instance;

    }

    public static ArquivoEloBuilder getTaxaJuros() {
	arquivoFinal.setTaxaJuros(genericoGetCampo(20));
	return instance;

    }

    public static ArquivoEloBuilder getParcelasCarencia() {
	arquivoFinal.setParcelasCarencia(genericoGetCampo(3));
	return instance;

    }

    public static ArquivoEloBuilder getPeriodicidadeCarencia() {
	arquivoFinal.setPeriodicidadeCarencia(genericoGetCampo(2));
	return instance;

    }

    public static ArquivoEloBuilder getTaxaJurosCarencia() {
	arquivoFinal.setTaxaJurosCarencia(genericoGetCampo(20));
	return instance;

    }

    public static ArquivoEloBuilder getInformacoesAdicionais() {
	arquivoFinal.setInformacoesAdicionais(genericoGetCampo(999));
	return instance;

    }

    public static ArquivoEloBuilder getCpnjEstabelecimento() {
	arquivoFinal.setCpnjEstabelecimento(genericoGetCampo(21));
	return instance;

    }

    public static ArquivoEloBuilder getCompraParceladaVPS() {
	arquivoFinal.setCompraParceladaVPS(genericoGetCampo(10));
	return instance;

    }

    public static ArquivoEloBuilder getCompraParceladaVPR() {
	arquivoFinal.setCompraParceladaVPR(genericoGetCampo(78));
	return instance;

    }

    public static ArquivoEloBuilder getCompraParceladaVPP() {
	arquivoFinal.setCompraParceladaVPP(genericoGetCampo(26));
	return instance;

    }

    public static ArquivoEloBuilder getCompraParceladaSVA() {
	arquivoFinal.setCompraParceladaSVA(genericoGetCampo(78));
	return instance;

    }

    public static ArquivoEloBuilder getCompraParceladaSPA() {
	arquivoFinal.setCompraParceladaSPA(genericoGetCampo(26));
	return instance;

    }

    public static ArquivoEloBuilder getCompraParceladaSVB() {
	arquivoFinal.setCompraParceladaSVB(genericoGetCampo(78));
	return instance;

    }

    public static ArquivoEloBuilder getCompraParceladaSPB() {
	arquivoFinal.setCompraParceladaSPB(genericoGetCampo(26));
	return instance;

    }

    public static ArquivoEloBuilder getCincoDigitosTrilha1() {
	arquivoFinal.setCincoDigitosTrilha1(genericoGetCampo(14));
	return instance;

    }

    public static ArquivoEloBuilder getCodigoCertificadoDigital() {
	arquivoFinal.setCodigoCertificadoDigital(genericoGetCampo(27));
	return instance;

    }

    public static ArquivoEloBuilder getAgroBNDES() {
	arquivoFinal.setAgroBNDES(genericoGetCampo(33));
	return instance;

    }

    public static ArquivoEloBuilder getIndicadorIncrementoPreAutorizacao() {
	arquivoFinal.setIndicadorIncrementoPreAutorizacao(genericoGetCampo(1));
	return instance;

    }

    public static ArquivoEloBuilder getInformacoesBandeira() {
	arquivoFinal.setInformacoesBandeira(genericoGetCampo(36));
	return instance;

    }

    public static ArquivoEloBuilder getProduto() {
	arquivoFinal.setProduto(genericoGetCampo(10));
	return instance;

    }

    public static ArquivoEloBuilder getIdentificacaoCarteiraDigital() {
	arquivoFinal.setIdentificacaoCarteiraDigital(genericoGetCampo(11));
	return instance;

    }

    public static ArquivoEloBuilder getCodigoMoeda() {
	arquivoFinal.setCodigoMoeda(genericoGetCampo(3));
	return instance;

    }

    public static ArquivoEloBuilder getCodigoMoedaliquidacao() {
	arquivoFinal.setCodigoMoedaliquidacao(genericoGetCampo(3));
	return instance;

    }

    public static ArquivoEloBuilder getCodigoMoedaFaturaPortador() {
	arquivoFinal.setCodigoMoedaFaturaPortador(genericoGetCampo(3));
	return instance;

    }

    public static ArquivoEloBuilder getDadosPIN() {
	arquivoFinal.setDadosPIN(genericoGetCampo(8));
	return instance;

    }

    public static ArquivoEloBuilder getInformacaoControleSeguranca() {
	arquivoFinal.setInformacaoControleSeguranca(genericoGetCampo(16));
	return instance;

    }

    public static ArquivoEloBuilder getValoresAdicionais() {
	arquivoFinal.setValoresAdicionais(genericoGetCampo(120));
	return instance;

    }

    public static ArquivoEloBuilder getTipoContaValorAdicional() {
	arquivoFinal.setTipoContaValorAdicional(genericoGetCampo(2));
	return instance;

    }

    public static ArquivoEloBuilder getTipoValorAdicional() {
	arquivoFinal.setTipoValorAdicional(genericoGetCampo(2));
	return instance;

    }

    public static ArquivoEloBuilder getCodigoMoedaValorAdicional() {
	arquivoFinal.setCodigoMoedaValorAdicional(genericoGetCampo(3));
	return instance;

    }

    public static ArquivoEloBuilder getIndicadorCreditoDebito() {
	arquivoFinal.setIndicadorCreditoDebito(genericoGetCampo(1));
	return instance;

    }

    private static String genericoGetCampo(int campoSize) {

	String campo = mensagemKafka.substring(ponteiroDeCampo, ponteiroDeCampo + campoSize);
	ponteiroDeCampo = ponteiroDeCampo + campoSize;
	return campo;

    }

    public static ArquivoElo build() {
	return arquivoFinal;
    }

    public static void main(String[] args) {

	ArquivoElo builded = ArquivoEloBuilder

		.setMensagemKafka("AAAAABBBBBBBBBBcccccccccccccccccccc") // 0

		.getCodigoMensagemTransacao() // ponteiroDeCampo = 0+5;

		.getPrimeiroMapaBits() // ponteiroDeCampo = 5+10;

		.getSegundoMapaBits() // ponteiroDeCampo = 15+20;

		.build();

	System.out.println(builded);

    }
}
