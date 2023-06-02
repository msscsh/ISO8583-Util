package br.com.msscsh.isoutil.enumeradores;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ParteMensagemCobol {

	IDENTIFICADO_DO_TIPO_DE_MENSAGEM("IDENTIFICADOR DO TIPO DE MENSAGEM", 1, 100),
	MAPA_DE_BITS_EXTENDIDO("MAPA DE BITS EXTENDIDO", 2, 100),
//	MAPA_DE_BITS_DA_MENSAGEM("MAPA DE BITS DA MENSAGEM", 3, 100),
//	MAPA_DE_BITS_PRIMARIO("MAPA DE BITS PRIMARIO", 4, 100),
//	MAPA_DE_BITS_SECUNDARIO("MAPA DE BITS SECUNDARIO", 5, 100),
//	BIT_002_NUMERO_DO_CARTAO("Primary Account Number, PAN", 6, 100),
//	BIT_003_CODIGO_PROCESSAMENTO("Processing Code", 7, 100),
	BIT_053_INFORMACAO_DE_CONTROLE_RELACIONADA_A_SEGURANCA("Security Related Control Information", 8, 100);
	
	String nomeDaParte;
	int numeroDeOrdem;
	int tamanhoTotal;
	
}
