package br.com.msscsh.isoutil.start.consumer;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import br.com.msscsh.isoutil.model.MensagemCOBOL;
import io.smallrye.reactive.messaging.annotations.Blocking;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MensagemCOBOLConsumer {

    @Incoming("requests")
    @Outgoing("quotes")
    @Blocking
    public MensagemCOBOL process(MensagemCOBOL mensagemCobol) throws InterruptedException {
        System.out.println("ISO CONSUMIDA NA FILA >>>>>>> " + mensagemCobol);
        return mensagemCobol;
    }
}
