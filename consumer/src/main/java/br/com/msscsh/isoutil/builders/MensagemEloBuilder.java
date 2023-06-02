package br.com.msscsh.isoutil.builders;

import br.com.msscsh.isoutil.enumeradores.CampoElo;
import br.com.msscsh.isoutil.enumeradores.ParteMensagemCobol;
import br.com.msscsh.isoutil.model.MensagemElo;

public class MensagemEloBuilder extends MensagemBuilder<MensagemEloBuilder, MensagemElo> {

	private AcaoAtributoElo acaoParaEsteAtributo = atributoEnum -> { execucaoPadraoDoAtributoDaBandeira(atributoEnum); };
	
	protected MensagemEloBuilder(String mensagemKafka) {
		super(mensagemKafka, new MensagemElo());
	}

	@Override
	public MensagemEloBuilder setBit2(boolean pularBit, ParteMensagemCobol parteMensagemCobol) {
		return executarAcaoDeContrucaoDeCampoPadrao(pularBit, parteMensagemCobol);
	}

	@Override
	public MensagemEloBuilder setBit3(boolean pularBit, ParteMensagemCobol parteMensagemCobol) {
		return executarAcaoDeContrucaoDeCampoPadrao(pularBit, parteMensagemCobol);
	}

	@Override
	public MensagemEloBuilder setBit53(boolean pularBit, ParteMensagemCobol parteMensagemCobol) {
		return executarAcaoDeContrucaoDeCampoPadrao(pularBit, parteMensagemCobol);
	}

    protected MensagemEloBuilder executarAcaoDeContrucaoDeCampoPadrao(boolean pularBit, ParteMensagemCobol parteMensagemCobol) {
		if(!executarAcaoPularParteMensagem(pularBit, parteMensagemCobol)) {
    		CampoElo
    			.buscarAtributosPorNumeroDaParteDaMensagemCobol(parteMensagemCobol)
    			.forEach(acaoParaEsteAtributo::executar);
		}
    	return self();
	}

	private void execucaoPadraoDoAtributoDaBandeira(CampoElo atributoEnum) {
		arquivoPOJO.adicionarAtributo(atributoEnum.nomeDoAtributo, getCampoNaMensagemKafka(atributoEnum.tamanhoDoAtributo));
	    getCampoNaMensagemKafka(atributoEnum.tamanhoASerIgnoradoPosLeituraDoAtributo);
	}
}
