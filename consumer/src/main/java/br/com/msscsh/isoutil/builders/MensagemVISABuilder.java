package br.com.msscsh.isoutil.builders;

import java.util.Arrays;
import java.util.stream.Collectors;

import br.com.msscsh.isoutil.enumeradores.CampoVISA;
import br.com.msscsh.isoutil.enumeradores.ParteMensagemCobol;
import br.com.msscsh.isoutil.model.MensagemVISA;

public class MensagemVISABuilder extends MensagemBuilder<MensagemVISABuilder, MensagemVISA> {

	protected AcaoAtributoVISA acaoParaEsteAtributo = atributoEnum -> { execucaoPadraoDoAtributoDaBandeira(atributoEnum); };

	public MensagemVISABuilder(String mensagemKafka) {
		super(mensagemKafka, new MensagemVISA());
	}
	
    public MensagemVISABuilder setBits() {
    	Arrays.stream(ParteMensagemCobol.values())
        .collect(Collectors.toList())
        .forEach(
        		parteCobol -> {
        			CampoVISA
						.buscarAtributosPorNumeroDaParteDaMensagemCobol(parteCobol)
						.stream()
						.sorted((o1, o2) -> Integer.compare(o1.ordemDoAtributo, o2.ordemDoAtributo))
					    .forEach(acaoParaEsteAtributo::executar);
        		});
    	return self();
    }

	private void execucaoPadraoDoAtributoDaBandeira(CampoVISA atributoEnum) {
		arquivoPOJO.adicionarAtributo(atributoEnum.nomeDoAtributo, getCampoNaMensagemKafka(atributoEnum.tamanhoDoAtributo));
	    getCampoNaMensagemKafka(atributoEnum.tamanhoASerIgnoradoPosLeituraDoAtributo);
	}
    
}
