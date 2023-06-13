package br.com.msscsh.isoutil.builders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.msscsh.isoutil.builders.mastercard.MensagemMastercardBuilder;
import br.com.msscsh.isoutil.model.MensagemISO8583;

public abstract class MensagemBuilder<B extends MensagemBuilder<B, T>, T extends MensagemISO8583> {

	protected T arquivoPOJO;
	private String mensagemKafka;
	private int ponteiroDeCampo;

	protected MensagemBuilder(String mensagemKafka, T arquivoPOJOt) {
		this.mensagemKafka = mensagemKafka;
		this.arquivoPOJO = arquivoPOJOt;	
		this.ponteiroDeCampo = 0;
	}
    
    protected String getCampoNaMensagemKafka(int campoSize) {
		String campo = this.mensagemKafka.substring(ponteiroDeCampo, ponteiroDeCampo+campoSize);
		this.ponteiroDeCampo = this.ponteiroDeCampo+campoSize;
    	return campo;
	}

    public abstract B setBits();
	
	public T build() {
		return (T) arquivoPOJO;
	}
    
    @SuppressWarnings("unchecked")
    protected final B self() {
        return (B) this;
    }
    
	@Deprecated
    public static void main(String[] args) throws JsonProcessingException {
		
//		String cemCaracteres = " ".repeat(100);
//    	System.out.println("0000"+"1111122222333334444455 6666677777888 999");
//    	
    	MensagemISO8583 builded;
        ObjectMapper objectMapper = new ObjectMapper();
//    	
//    	builded = new MensagemEloBuilder("333001100010000000000002233222322222222222200110001000000000000223322232222222222220011000100000000000022332223222222222222")
//				    		.setBits()
//				    		.build();
//    	
//    	builded.adicionarAtributo("lista", "");
//    	Map<String, Object> atributosDoJson = new LinkedHashMap<>();
//    	Map<String, String> listinha = new LinkedHashMap<>();
//    	listinha.put("A", "1");
//    	listinha.put("B", "2");
//    	atributosDoJson.put("lista", listinha);
    	
//    	System.out.println("ELO: " + objectMapper.writeValueAsString(atributosDoJson));
    	
    	builded = new MensagemMastercardBuilder("333001100010000000000002233222322222222222200110001000000000000223322232222222222220011000100000000000022332223222222222222")
			        		.setBits()
			        		.build();
    	System.out.println("MASTER: " + objectMapper.writeValueAsString(builded.getAtributosDoJson()));
//    	
//    	builded = new MensagemVISABuilder(cemCaracteres+cemCaracteres+"1111122222333334444455 6666677777888 999")
//			        		.setBits()
//			        		.build();
//    	System.out.println("VISA: " + objectMapper.writeValueAsString(builded.getAtributosDoJson()));
	}

}