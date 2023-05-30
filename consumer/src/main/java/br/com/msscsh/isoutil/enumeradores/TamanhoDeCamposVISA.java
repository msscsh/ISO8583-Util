package br.com.msscsh.isoutil.enumeradores;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TamanhoDeCamposVISA {

	BIT53_NOMEDOESTABELECIMENTO(22),
	BIT53_NOMEDACIDADE(13),
	BIT53_CODIGODOPAISOUESTADO(3);
	
	public int size;
	
}
