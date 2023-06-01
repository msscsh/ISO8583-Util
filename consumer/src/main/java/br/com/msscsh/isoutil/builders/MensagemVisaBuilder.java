package br.com.msscsh.isoutil.builders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.msscsh.isoutil.enumeradores.CampoVISA;
import br.com.msscsh.isoutil.model.MensagemISO8583;
import br.com.msscsh.isoutil.model.MensagemVISA;

public class MensagemVisaBuilder extends MensagemISOBuilder<MensagemVisaBuilder, MensagemVISA> {
	
	public MensagemVisaBuilder(String mensagemKafka) {
		super(mensagemKafka, new MensagemVISA());
	}

	@Override
    public MensagemVisaBuilder setBit53() {
		
		CampoVISA.buscarPorCampo(53)
				.forEach(atributoEnum ->
					{
						arquivoPOJO.adicionarAtributo(atributoEnum.nomeDoAtributo, getCampoNaMensagemKafka(atributoEnum.tamanhoDoAtributo));
						getCampoNaMensagemKafka(atributoEnum.tamanhoASerIgnoradoPosLeituraDoAtributo);
					});
		
    	return self();
    }
    
    public static void main(String[] args) throws JsonProcessingException {
    	MensagemISO8583 builded = new MensagemVisaBuilder("1111122222333334444455 6666677777888 999")
    		.setBit53()
    		.build();
    	
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(builded.getAtributosDoJson());
    	
    	System.out.println(json);
	}
    
}
