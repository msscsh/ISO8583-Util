package br.com.msscsh.isoutil.builders.visa;

import java.util.Arrays;
import java.util.stream.Collectors;

import br.com.msscsh.isoutil.builders.MensagemBuilder;
import br.com.msscsh.isoutil.enumeradores.ParteMensagemCOBOL;
import br.com.msscsh.isoutil.enumeradores.visa.DeParaCOBOLCopybookCampoVISA;
import br.com.msscsh.isoutil.model.MensagemVISA;

public class MensagemVISABuilder extends MensagemBuilder<MensagemVISABuilder, MensagemVISA> {

	protected AcaoAtributoVISA acaoParaEsteAtributo = atributoEnum -> { execucaoPadraoDoAtributoDaBandeira(atributoEnum); };

	public MensagemVISABuilder(String mensagemKafka) {
		super(mensagemKafka, new MensagemVISA());
	}
	
    public MensagemVISABuilder setBits() {
    	Arrays.stream(ParteMensagemCOBOL.values())
        .collect(Collectors.toList())
        .forEach(
        		parteCobol -> {
        			DeParaCOBOLCopybookCampoVISA
						.buscarAtributosPorNumeroDaParteDaMensagemCobol(parteCobol)
						.stream()
						.sorted((o1, o2) -> Integer.compare(o1.ordemDoAtributo, o2.ordemDoAtributo))
					    .forEach(acaoParaEsteAtributo::executar);
        		});
    	return self();
    }

	private void execucaoPadraoDoAtributoDaBandeira(DeParaCOBOLCopybookCampoVISA atributoEnum) {
		arquivoPOJO.adicionarAtributo(atributoEnum.nomeDoAtributo, getCampoNaMensagemKafka(atributoEnum.tamanhoDoAtributo), null);
	    getCampoNaMensagemKafka(atributoEnum.tamanhoASerIgnoradoPosLeituraDoAtributo);
	}
    
}
