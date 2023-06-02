package br.com.msscsh.isoutil.builders;

import java.util.Arrays;
import java.util.stream.Collectors;

import br.com.msscsh.isoutil.enumeradores.CampoElo;
import br.com.msscsh.isoutil.enumeradores.ParteMensagemCobol;
import br.com.msscsh.isoutil.model.MensagemElo;

public class MensagemEloBuilder extends MensagemBuilder<MensagemEloBuilder, MensagemElo> {

	private AcaoAtributoElo acaoParaEsteAtributo = atributoEnum -> { execucaoPadraoDoAtributoDaBandeira(atributoEnum); };
	
	protected MensagemEloBuilder(String mensagemKafka) {
		super(mensagemKafka, new MensagemElo());
	}

    public MensagemEloBuilder setBits() {
    	Arrays.stream(ParteMensagemCobol.values())
        .collect(Collectors.toList())
        .forEach(
        		parteCobol -> {
        			CampoElo
						.buscarAtributosPorNumeroDaParteDaMensagemCobol(parteCobol)
						.stream()
						.sorted((o1, o2) -> Integer.compare(o1.ordemDoAtributo, o2.ordemDoAtributo))
					    .forEach(acaoParaEsteAtributo::executar);
        		});
    	
    	return self();
    }

	private void execucaoPadraoDoAtributoDaBandeira(CampoElo atributoEnum) {
		arquivoPOJO.adicionarAtributo(atributoEnum.nomeDoAtributo, getCampoNaMensagemKafka(atributoEnum.tamanhoDoAtributo));
	    getCampoNaMensagemKafka(atributoEnum.tamanhoASerIgnoradoPosLeituraDoAtributo);
	}
}
