package br.com.msscsh.isoutil.builders.elo;

import java.util.Arrays;
import java.util.stream.Collectors;

import br.com.msscsh.isoutil.builders.MensagemBuilder;
import br.com.msscsh.isoutil.enumeradores.ParteMensagemCOBOL;
import br.com.msscsh.isoutil.enumeradores.elo.DeParaCOBOLCopybookCampoElo;
import br.com.msscsh.isoutil.model.MensagemElo;

public class MensagemEloBuilder extends MensagemBuilder<MensagemEloBuilder, MensagemElo> {

	private AcaoAtributoElo acaoParaEsteAtributo = atributoEnum -> { execucaoPadraoDoAtributoDaBandeira(atributoEnum); };
	
	public MensagemEloBuilder(String mensagemKafka) {
		super(mensagemKafka, new MensagemElo());
	}

    public MensagemEloBuilder setBits() {
    	Arrays.stream(ParteMensagemCOBOL.values())
        .collect(Collectors.toList())
        .forEach(
        		parteCobol -> {
        			DeParaCOBOLCopybookCampoElo
						.buscarAtributosPorNumeroDaParteDaMensagemCobol(parteCobol)
						.stream()
						.sorted((o1, o2) -> Integer.compare(o1.ordemDoAtributo, o2.ordemDoAtributo))
					    .forEach(acaoParaEsteAtributo::executar);
        		});
    	return self();
    }

	private void execucaoPadraoDoAtributoDaBandeira(DeParaCOBOLCopybookCampoElo atributoEnum) {
		arquivoPOJO.adicionarAtributo(atributoEnum.nomeDoAtributo, getCampoNaMensagemKafka(atributoEnum.tamanhoDoAtributo), null);
	    getCampoNaMensagemKafka(atributoEnum.tamanhoASerIgnoradoPosLeituraDoAtributo);
	}
}
