package one.digitalinovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto spring boot gerado pelo initializr.
 * Modulos selecionados:
 * - Spring Data JPA
 * - H2 Database
 * - Spring Web 
 * - Open Feign
 * - Lombok
 * 
 * @author Andréa
 *
 */

@EnableFeignClients
@SpringBootApplication
public class LabProdroesProjetosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabProdroesProjetosSpringApplication.class, args);
	}

}
