package br.com.msscsh.isoutil.builders;

import br.com.msscsh.isoutil.enumeradores.CampoVISA;
import br.com.msscsh.isoutil.enumeradores.ParteMensagemCobol;
import br.com.msscsh.isoutil.model.MensagemVISA;

public class MensagemVISABuilder extends MensagemBuilder<MensagemVISABuilder, MensagemVISA> {

	protected AcaoAtributoVISA acaoParaEsteAtributo = atributoEnum -> { execucaoPadraoDoAtributoDaBandeira(atributoEnum); };
	
	public MensagemVISABuilder(String mensagemKafka) {
		super(mensagemKafka, new MensagemVISA());
	}

	@Override
    public MensagemVISABuilder setBit2(boolean pularBit, ParteMensagemCobol parteMensagemCobol) {
		return executarAcaoDeContrucaoDeCampoPadrao(pularBit, parteMensagemCobol);
	}
	
	@Override
    public MensagemVISABuilder setBit3(boolean pularBit, ParteMensagemCobol parteMensagemCobol) {
		return executarAcaoDeContrucaoDeCampoPadrao(pularBit, parteMensagemCobol);
	}
	
	@Override
    public MensagemVISABuilder setBit53(boolean pularBit, ParteMensagemCobol parteMensagemCobol) {
		return executarAcaoDeContrucaoDeCampoPadrao(pularBit, parteMensagemCobol);
    }

    protected MensagemVISABuilder executarAcaoDeContrucaoDeCampoPadrao(boolean pularBit, ParteMensagemCobol parteMensagemCobol) {
		if(!executarAcaoPularParteMensagem(pularBit, parteMensagemCobol)) {
    		CampoVISA
    			.buscarAtributosPorNumeroDaParteDaMensagemCobol(parteMensagemCobol)
    			.forEach(acaoParaEsteAtributo::executar);
		}
    	return self();
	}

	private void execucaoPadraoDoAtributoDaBandeira(CampoVISA atributoEnum) {
		arquivoPOJO.adicionarAtributo(atributoEnum.nomeDoAtributo, getCampoNaMensagemKafka(atributoEnum.tamanhoDoAtributo));
	    getCampoNaMensagemKafka(atributoEnum.tamanhoASerIgnoradoPosLeituraDoAtributo);
	}
    
}
