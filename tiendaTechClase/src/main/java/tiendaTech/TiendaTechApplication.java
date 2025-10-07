package tiendaTech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class TiendaTechApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(TiendaTechApplication.class);

        // Cambiar el puerto si es necesario 
        Map<String, Object> props = new HashMap<>();
        props.put("server.port", 9090);
        app.setDefaultProperties(props);

        app.run(args);
    }
}
