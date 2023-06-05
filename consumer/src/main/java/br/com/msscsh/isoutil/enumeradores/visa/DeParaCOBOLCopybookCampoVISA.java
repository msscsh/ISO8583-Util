package br.com.msscsh.isoutil.enumeradores.visa;

import static br.com.msscsh.isoutil.enumeradores.ParteMensagemCOBOL.BIT_043_CARD_ACCEPTOR_NAME_LOCATION;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import br.com.msscsh.isoutil.enumeradores.ParteMensagemCOBOL;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum DeParaCOBOLCopybookCampoVISA {
	
//	TAMANHO100_01(ParteMensagemCOBOL.IDENTIFICADO_DO_TIPO_DE_MENSAGEM.getNumeroDeOrdem(), "campo100-01", 1, 100, 0),
//	TAMANHO100_02(ParteMensagemCOBOL.MAPA_DE_BITS_EXTENDIDO.getNumeroDeOrdem(), "campo100-02", 1, 100, 0),
	
	//BIT 43
	BIT43_NOMEDOESTABELECIMENTO(BIT_043_CARD_ACCEPTOR_NAME_LOCATION.getNumeroDaParte(), "NOMEDOESTABELECIMENTO", 1, 22, 1),
	BIT43_NOMEDACIDADE(BIT_043_CARD_ACCEPTOR_NAME_LOCATION.getNumeroDaParte(), "NOMEDACIDADE", 2, 13, 1),
	BIT43_CODIGODOPAISOUESTADO(BIT_043_CARD_ACCEPTOR_NAME_LOCATION.getNumeroDaParte(), "CODIGODOPAISOUESTADO", 3, 3, 0);

	/**
	 * Representa a numeracao de ordem do campo.
	 * Ex: Campo 1, Campo 2... Campo 127.
	 */
	public int numeroDeOrdemDaParteDaMensagemCobol;
	public String nomeDoAtributo;
	/**
	 * Representa a numeracao de ordem do atributo dentro de um campo.
	 * Ex: No Campo 53, temos: Atributo 1= nomeDoEstabelecimento; Atributo 2= nomeDaCidade; Atributo 3= codigoDoPAisOuEstado;
	 */
	public int ordemDoAtributo;
	public int tamanhoDoAtributo;
	/**
	 * Informacoes podem ser distanciadas por trails, desta maneira
	 * cada atributo deve informar qual o espacamento entre ele e a proxima informação.
	 */
	public int tamanhoASerIgnoradoPosLeituraDoAtributo;
	
	public static List<DeParaCOBOLCopybookCampoVISA> buscarAtributosPorNumeroDaParteDaMensagemCobol(ParteMensagemCOBOL parteDaMensagemCobol) {
	    return Arrays.stream(DeParaCOBOLCopybookCampoVISA.values())
	            .filter(entrada -> entrada.numeroDeOrdemDaParteDaMensagemCobol == parteDaMensagemCobol.getNumeroDaParte())
	            .collect(Collectors.toList());
	}
	
}
