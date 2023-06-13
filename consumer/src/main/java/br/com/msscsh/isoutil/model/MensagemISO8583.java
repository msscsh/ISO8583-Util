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

    private Map<String, Object> atributosDoJson;

    public MensagemISO8583() {
    	atributosDoJson = new LinkedHashMap<>();
    }
    
    public void adicionarAtributo(String nomeDoAtributo, String valorDoAtributo, String nomeDaListagemComindiceDoElementoAlvo) {
    	
    	if(nomeDaListagemComindiceDoElementoAlvo != null) {
    		
        	int lastIndexOf = nomeDaListagemComindiceDoElementoAlvo.lastIndexOf("-");
			String nomeDaListaOndeOElementoSeEncontra = nomeDaListagemComindiceDoElementoAlvo.substring(0, lastIndexOf);
			String chaveDoElementoAReceberUmNovoAtributo = nomeDaListagemComindiceDoElementoAlvo.substring(lastIndexOf+1);

			Map<String, Object> mapObjectDaListaComTodosOsElementos = resgatarLinkedMapDaListagem(nomeDaListaOndeOElementoSeEncontra, atributosDoJson);
			Map mapObjectDosAtributosDoElemento = resgatarLinkedMapDaListagem(chaveDoElementoAReceberUmNovoAtributo, mapObjectDaListaComTodosOsElementos);
    		mapObjectDosAtributosDoElemento.put(nomeDoAtributo, valorDoAtributo);
    		mapObjectDaListaComTodosOsElementos.put(chaveDoElementoAReceberUmNovoAtributo, mapObjectDosAtributosDoElemento);
    		atributosDoJson.put(nomeDaListaOndeOElementoSeEncontra, mapObjectDaListaComTodosOsElementos);
    		
    	}
    	else {
    		atributosDoJson.put(nomeDoAtributo, valorDoAtributo);
    	}
	}

	private Map<String, Object> resgatarLinkedMapDaListagem(String chaveDoElemento, Map<String, Object> mapPossuidor) {
		Object objectHospedado = mapPossuidor.get(chaveDoElemento);
		return objectHospedado != null ? (LinkedHashMap<String, Object>)objectHospedado : new LinkedHashMap<>();
	}
}
