package br.com.msscsh.isoutil.builders;

import java.util.Optional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.msscsh.isoutil.enumeradores.CampoElo;
import br.com.msscsh.isoutil.enumeradores.CampoMastercard;
import br.com.msscsh.isoutil.enumeradores.CampoVISA;
import br.com.msscsh.isoutil.enumeradores.ParteMensagemCobol;
import br.com.msscsh.isoutil.model.MensagemISO8583;

abstract class MensagemBuilder<B extends MensagemBuilder<B, T>, T extends MensagemISO8583> {

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
    
    protected boolean executarAcaoPularParteMensagem(boolean pularBit, ParteMensagemCobol parteMensagemCobol) {
		Optional.of(pularBit)
		.filter(Boolean::booleanValue)
	        .ifPresent(c -> {
	        	getCampoNaMensagemKafka(parteMensagemCobol.getTamanhoTotal());
	        });
		return pularBit;
	}

    public B setBits(ParteMensagemCobol parteMensagemCobol) {
    	
    	//TODO parei aqui
    	
    	return self();
    }
    
    public abstract B setBit2(boolean pularBit, ParteMensagemCobol parteMensagemCobol);
    public abstract B setBit3(boolean pularBit, ParteMensagemCobol parteMensagemCobol);
    public abstract B setBit53(boolean pularBit, ParteMensagemCobol parteMensagemCobol);
	
	public T build() {
		return (T) arquivoPOJO;
	}
    
    @SuppressWarnings("unchecked")
    final B self() {
        return (B) this;
    }
    
	@Deprecated
    public static void main(String[] args) throws JsonProcessingException {
    	
		String cemCaracteres = " ".repeat(100);

    	System.out.println(cemCaracteres+cemCaracteres+"1111122222333334444455 6666677777888 999");
    	
    	MensagemISO8583 builded;
        ObjectMapper objectMapper = new ObjectMapper();
    	
    	builded = new MensagemEloBuilder(cemCaracteres+cemCaracteres+"1111122222333334444455 6666677777888 999")
    		.setBit2(true, ParteMensagemCobol.BIT_002_NUMERO_DO_CARTAO)
    		.setBit3(true, ParteMensagemCobol.BIT_003_CODIGO_PROCESSAMENTO)
    		.setBit53(false, ParteMensagemCobol.BIT_053_INFORMACAO_DE_CONTROLE_RELACIONADA_A_SEGURANCA)
    		.build();
    	
    	System.out.println("ELO: " + objectMapper.writeValueAsString(builded.getAtributosDoJson()));
    	
    	builded = new MensagemMastercardBuilder(cemCaracteres+cemCaracteres+"1111122222333334444455 6666677777888 999")
        		.setBit2(true, ParteMensagemCobol.BIT_002_NUMERO_DO_CARTAO)
        		.setBit3(true, ParteMensagemCobol.BIT_003_CODIGO_PROCESSAMENTO)
        		.setBit53(false, ParteMensagemCobol.BIT_053_INFORMACAO_DE_CONTROLE_RELACIONADA_A_SEGURANCA)
        		.build();

    	System.out.println("MASTER: " + objectMapper.writeValueAsString(builded.getAtributosDoJson()));
    	
    	builded = new MensagemVISABuilder(cemCaracteres+cemCaracteres+"1111122222333334444455 6666677777888 999")
        		.setBit2(true, ParteMensagemCobol.BIT_002_NUMERO_DO_CARTAO)
        		.setBit3(true, ParteMensagemCobol.BIT_003_CODIGO_PROCESSAMENTO)
        		.setBit53(false, ParteMensagemCobol.BIT_053_INFORMACAO_DE_CONTROLE_RELACIONADA_A_SEGURANCA)
        		.build();
    	
    	System.out.println("VISA: " + objectMapper.writeValueAsString(builded.getAtributosDoJson()));
	}

}