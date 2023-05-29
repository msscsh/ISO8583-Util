package br.com.msscsh.isoutil.builders;

import br.com.msscsh.isoutil.pojos.ArquivoPOJO;

public class ArquivoPOJOVisaBuilder extends ArquivoPOJOGenericBuilder<ArquivoPOJOVisaBuilder> {
	
	public ArquivoPOJOVisaBuilder(String mensagemKafka) {
		super(mensagemKafka);
	}

	@Override
    public ArquivoPOJOVisaBuilder setCampoA(int tamanho) {
    	arquivoPOJO.setCampoA(getCampoNaMensagemKafka(tamanho));
    	return self();
    }

	@Override
    public ArquivoPOJOVisaBuilder setCampoB(int tamanho) {
    	arquivoPOJO.setCampoB(getCampoNaMensagemKafka(tamanho));
    	return self();
    }
    
    public static void main(String[] args) {
    	ArquivoPOJO builded = new ArquivoPOJOVisaBuilder("AAAAABBBBBBBBBBcccccccccccccccccccc")
    		.setCampoA(10)
    		.setCampoB(5)
    		.build();
    	
    	System.out.println(builded);
    	
	}
    
}
