package br.com.msscsh.isoutil.builders;

import br.com.msscsh.isoutil.enumeradores.TamanhoDeCamposVISA;
import br.com.msscsh.isoutil.pojos.ArquivoPOJO;
import br.com.msscsh.isoutil.pojos.ArquivoPOJOVISA;

public class ArquivoPOJOVisaBuilder extends ArquivoPOJOBuilder<ArquivoPOJOVisaBuilder, ArquivoPOJOVISA> {
	
	public ArquivoPOJOVisaBuilder(String mensagemKafka) {
		super(mensagemKafka, new ArquivoPOJOVISA());
	}

	@Override
    public ArquivoPOJOVisaBuilder setBit53() {
    	arquivoPOJO.setNomeDoEstabelecimento(getCampoNaMensagemKafka(TamanhoDeCamposVISA.BIT53_NOMEDOESTABELECIMENTO.size));
    	getCampoNaMensagemKafka(1);
    	arquivoPOJO.setNomeDaCidade(getCampoNaMensagemKafka(TamanhoDeCamposVISA.BIT53_NOMEDACIDADE.size));
    	getCampoNaMensagemKafka(1);
    	arquivoPOJO.setCodigoDoPaisOuEstado(getCampoNaMensagemKafka(TamanhoDeCamposVISA.BIT53_CODIGODOPAISOUESTADO.size));
    	
    	arquivoPOJO.setAtributoEspecificoDaVisa("UM ATRIBUTO ESPECIFICO DA VISA ENTROU AQUI");
    	
    	return self();
    }
    
    public static void main(String[] args) {
    	ArquivoPOJO builded = new ArquivoPOJOVisaBuilder("1111122222333334444455 6666677777888 999")
//    		.setBit1()
//    		...
    		.setBit53()
//    		...
//    		.setBit127()
    		.build();
    	
    	System.out.println(builded);
    	
	}
    
}
