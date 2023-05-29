package br.com.msscsh.isoutil.producer;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import br.com.msscsh.isoutil.model.MensagemCobol;
import io.smallrye.mutiny.Multi;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/mensagemcobol")
public class MensagemCobolProducer {

    @Channel("mensagem-cobol")
    Emitter<String> mensagemCobolEmitter;

    @Channel("quotes")
    Multi<MensagemCobol> mensagensCobol;

    @POST
    @Path("/request")
    @Produces(MediaType.TEXT_PLAIN)
    public String createRequest(String iSOExemplo) {
    	
    	System.out.println("ISO ENTRADA >>>>>>>>>>> " + iSOExemplo);
    	MensagemCobol mensagem = new MensagemCobol(iSOExemplo);
        mensagemCobolEmitter.send(mensagem.toString());
        
        return iSOExemplo;
    }

    @GET
    @Produces(MediaType.SERVER_SENT_EVENTS)
    public Multi<MensagemCobol> stream() {
        return mensagensCobol.log();
    }
}
