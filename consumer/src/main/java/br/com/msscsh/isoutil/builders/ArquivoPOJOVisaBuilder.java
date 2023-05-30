package br.com.msscsh.isoutil.builders;

import br.com.msscsh.isoutil.enumeradores.TamanhoDeCamposVISA;
import br.com.msscsh.isoutil.pojos.ArquivoPOJO;

public class ArquivoPOJOVisaBuilder extends ArquivoPOJOGenericBuilder<ArquivoPOJOVisaBuilder> {
	
	public ArquivoPOJOVisaBuilder(String mensagemKafka) {
		super(mensagemKafka);
	}

	@Override
    public ArquivoPOJOVisaBuilder setBit53() {
    	arquivoPOJO.setNomeDoEstabelecimento(getCampoNaMensagemKafka(TamanhoDeCamposVISA.BIT53_NOMEDOESTABELECIMENTO.size));
    	getCampoNaMensagemKafka(1);
    	arquivoPOJO.setNomeDaCidade(getCampoNaMensagemKafka(TamanhoDeCamposVISA.BIT53_NOMEDACIDADE.size));
    	getCampoNaMensagemKafka(1);
    	arquivoPOJO.setCodigoDoPaisOuEstado(getCampoNaMensagemKafka(TamanhoDeCamposVISA.BIT53_CODIGODOPAISOUESTADO.size));
    	return self();
    }
    
    public static void main(String[] args) {
    	ArquivoPOJO builded = new ArquivoPOJOVisaBuilder("")
//    		.setBit1()
//    		...
    		.setBit53()
//    		...
//    		.setBit127()
    		.build();
    	
    	System.out.println(builded);
    	
	}
    
}
