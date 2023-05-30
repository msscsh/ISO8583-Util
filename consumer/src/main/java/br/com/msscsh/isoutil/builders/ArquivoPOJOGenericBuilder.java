package br.com.msscsh.isoutil.builders;

import br.com.msscsh.isoutil.enumeradores.TamanhoDeCamposISO8583;
import br.com.msscsh.isoutil.pojos.ArquivoPOJO;

abstract class ArquivoPOJOGenericBuilder<B extends ArquivoPOJOGenericBuilder<B>> {

	protected ArquivoPOJO arquivoPOJO;
	private String mensagemKafka;
	private int ponteiroDeCampo;
	
	protected ArquivoPOJOGenericBuilder(String mensagemKafka) {
		this.mensagemKafka = mensagemKafka;
		this.arquivoPOJO = new ArquivoPOJO();
		this.ponteiroDeCampo = 0;
	}

    public B setBit53() {
    	arquivoPOJO.setNomeDoEstabelecimento(getCampoNaMensagemKafka(TamanhoDeCamposISO8583.BIT53_NOMEDOESTABELECIMENTO.size));
    	arquivoPOJO.setNomeDaCidade(getCampoNaMensagemKafka(TamanhoDeCamposISO8583.BIT53_NOMEDACIDADE.size));
    	arquivoPOJO.setCodigoDoPaisOuEstado(getCampoNaMensagemKafka(TamanhoDeCamposISO8583.BIT53_CODIGODOPAISOUESTADO.size));
    	return self();
    }
    
    protected String getCampoNaMensagemKafka(int campoSize) {
		String campo = this.mensagemKafka.substring(ponteiroDeCampo, ponteiroDeCampo+campoSize);
		this.ponteiroDeCampo = this.ponteiroDeCampo+campoSize;
    	return campo;
	}

	public ArquivoPOJO build() {
		return arquivoPOJO;
	}
    
    @SuppressWarnings("unchecked")
    final B self() {
        return (B) this;
    }
    
}