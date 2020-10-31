package client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClienteProyectoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteProyectoAppApplication.class, args);
	}

}
