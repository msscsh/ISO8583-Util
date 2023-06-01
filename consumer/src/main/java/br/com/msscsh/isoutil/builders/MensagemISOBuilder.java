package br.com.msscsh.isoutil.builders;

import br.com.msscsh.isoutil.model.MensagemISO8583;

abstract class MensagemISOBuilder<B extends MensagemISOBuilder<B, T>, T extends MensagemISO8583> {

	protected T arquivoPOJO;
	private String mensagemKafka;
	private int ponteiroDeCampo;
	
	protected MensagemISOBuilder(String mensagemKafka, T arquivoPOJOt) {
		this.mensagemKafka = mensagemKafka;
		this.arquivoPOJO = arquivoPOJOt;
		this.ponteiroDeCampo = 0;
	}

    public abstract B setBit53();
    
    protected String getCampoNaMensagemKafka(int campoSize) {
		String campo = this.mensagemKafka.substring(ponteiroDeCampo, ponteiroDeCampo+campoSize);
		this.ponteiroDeCampo = this.ponteiroDeCampo+campoSize;
    	return campo;
	}

	public T build() {
		return (T) arquivoPOJO;
	}
    
    @SuppressWarnings("unchecked")
    final B self() {
        return (B) this;
    }
    
}