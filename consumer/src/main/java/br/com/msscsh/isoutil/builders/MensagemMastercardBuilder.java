package br.com.msscsh.isoutil.builders;

import java.util.Arrays;
import java.util.stream.Collectors;

import br.com.msscsh.isoutil.enumeradores.CampoMastercard;
import br.com.msscsh.isoutil.enumeradores.ParteMensagemCobol;
import br.com.msscsh.isoutil.model.MensagemMastercard;

public class MensagemMastercardBuilder extends MensagemBuilder<MensagemMastercardBuilder, MensagemMastercard> {
	
	private AcaoAtributoMastercard acaoParaEsteAtributo = atributoEnum -> { execucaoPadraoDoAtributoDaBandeira(atributoEnum); };
	
	protected MensagemMastercardBuilder(String mensagemKafka) {
		super(mensagemKafka, new MensagemMastercard());
	}

    public MensagemMastercardBuilder setBits() {
    	Arrays.stream(ParteMensagemCobol.values())
        .collect(Collectors.toList())
        .forEach(
        		parteCobol -> {
        			CampoMastercard
						.buscarAtributosPorNumeroDaParteDaMensagemCobol(parteCobol)
						.stream()
						.sorted((o1, o2) -> Integer.compare(o1.ordemDoAtributo, o2.ordemDoAtributo))
					    .forEach(acaoParaEsteAtributo::executar);
        		});
    	
    	return self();
    }

	private void execucaoPadraoDoAtributoDaBandeira(CampoMastercard atributoEnum) {
		arquivoPOJO.adicionarAtributo(atributoEnum.nomeDoAtributo, getCampoNaMensagemKafka(atributoEnum.tamanhoDoAtributo));
	    getCampoNaMensagemKafka(atributoEnum.tamanhoASerIgnoradoPosLeituraDoAtributo);
	}

}
