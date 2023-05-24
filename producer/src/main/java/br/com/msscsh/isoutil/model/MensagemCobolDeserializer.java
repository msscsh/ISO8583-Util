package br.com.msscsh.isoutil.model;

import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class MensagemCobolDeserializer extends ObjectMapperDeserializer<MensagemCobol> {
    public MensagemCobolDeserializer() {
        super(MensagemCobol.class);
    }
}
