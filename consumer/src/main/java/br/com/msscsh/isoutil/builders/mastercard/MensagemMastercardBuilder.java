package br.com.msscsh.isoutil.builders.mastercard;

import java.util.Arrays;
import java.util.stream.Collectors;

import br.com.msscsh.isoutil.builders.MensagemBuilder;
import br.com.msscsh.isoutil.enumeradores.ParteMensagemCOBOL;
import br.com.msscsh.isoutil.enumeradores.mastercard.CampoMastercard;
import br.com.msscsh.isoutil.model.MensagemMastercard;

public class MensagemMastercardBuilder extends MensagemBuilder<MensagemMastercardBuilder, MensagemMastercard> {
	
	private AcaoAtributoMastercard acaoParaEsteAtributo = atributoEnum -> { execucaoPadraoDoAtributoDaBandeira(atributoEnum); };
	
	public MensagemMastercardBuilder(String mensagemKafka) {
		super(mensagemKafka, new MensagemMastercard());
	}

    public MensagemMastercardBuilder setBits() {
    	Arrays.stream(ParteMensagemCOBOL.values())
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
