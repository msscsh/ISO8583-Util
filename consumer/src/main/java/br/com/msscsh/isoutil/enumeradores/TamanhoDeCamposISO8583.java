package br.com.msscsh.isoutil.enumeradores;

public enum TamanhoDeCamposISO8583 {

	BIT53_NOMEDOESTABELECIMENTO(25),
	BIT53_NOMEDACIDADE(13),
	BIT53_CODIGODOPAISOUESTADO(2);
	
	public int size;
	
	private TamanhoDeCamposISO8583(int size) {
	}
	
}
