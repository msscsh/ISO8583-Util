package br.com.msscsh.isoutil.builders;

import br.com.msscsh.isoutil.enumeradores.CampoMastercard;
import br.com.msscsh.isoutil.enumeradores.ParteMensagemCobol;
import br.com.msscsh.isoutil.model.MensagemMastercard;

public class MensagemMastercardBuilder extends MensagemBuilder<MensagemMastercardBuilder, MensagemMastercard> {
	
	private AcaoAtributoMastercard acaoParaEsteAtributo = atributoEnum -> { execucaoPadraoDoAtributoDaBandeira(atributoEnum); };
	
	protected MensagemMastercardBuilder(String mensagemKafka) {
		super(mensagemKafka, new MensagemMastercard());
	}

	@Override
	public MensagemMastercardBuilder setBit2(boolean pularBit, ParteMensagemCobol parteMensagemCobol) {
		return executarAcaoDeContrucaoDeCampoPadrao(pularBit, parteMensagemCobol);
	}

	@Override
	public MensagemMastercardBuilder setBit3(boolean pularBit, ParteMensagemCobol parteMensagemCobol) {
		return executarAcaoDeContrucaoDeCampoPadrao(pularBit, parteMensagemCobol);
	}

	@Override
	public MensagemMastercardBuilder setBit53(boolean pularBit, ParteMensagemCobol parteMensagemCobol) {
		return executarAcaoDeContrucaoDeCampoPadrao(pularBit, parteMensagemCobol);
	}

    protected MensagemMastercardBuilder executarAcaoDeContrucaoDeCampoPadrao(boolean pularBit, ParteMensagemCobol parteMensagemCobol) {
		if(!executarAcaoPularParteMensagem(pularBit, parteMensagemCobol)) {
    		CampoMastercard
    			.buscarAtributosPorNumeroDaParteDaMensagemCobol(parteMensagemCobol)
    			.forEach(acaoParaEsteAtributo::executar);
		}
    	return self();
	}

	private void execucaoPadraoDoAtributoDaBandeira(CampoMastercard atributoEnum) {
		arquivoPOJO.adicionarAtributo(atributoEnum.nomeDoAtributo, getCampoNaMensagemKafka(atributoEnum.tamanhoDoAtributo));
	    getCampoNaMensagemKafka(atributoEnum.tamanhoASerIgnoradoPosLeituraDoAtributo);
	}

}
