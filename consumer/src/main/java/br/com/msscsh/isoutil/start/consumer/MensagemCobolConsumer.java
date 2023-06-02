package br.com.msscsh.isoutil.start.consumer;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import br.com.msscsh.isoutil.model.MensagemCobol;
import io.smallrye.reactive.messaging.annotations.Blocking;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MensagemCobolConsumer {

    @Incoming("requests")
    @Outgoing("quotes")
    @Blocking
    public MensagemCobol process(MensagemCobol mensagemCobol) throws InterruptedException {
        System.out.println("ISO CONSUMIDA NA FILA >>>>>>> " + mensagemCobol);
        return mensagemCobol;
    }
}