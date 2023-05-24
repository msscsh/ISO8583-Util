import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class SendMessageApplication implements QuarkusApplication {

    // @Inject
    // @Channel("fila-principal")
    // Emitter<String> emissor


    @Override
    public int run(String... args) throws Exception {   
        // Arrays.stream(args).forEach(emissor::send)  
        return 0;
    }

}