package br.com.msscsh.isoutil.model;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public abstract class MensagemISO8583 {

    private Map<String, String> atributosDoJson;

    public MensagemISO8583() {
    	atributosDoJson = new LinkedHashMap<>();
    }
    
    public void adicionarAtributo(String nomeDoAtributo, String valorDoAtributo) {
    	atributosDoJson.put(nomeDoAtributo, valorDoAtributo);
	}
	
}