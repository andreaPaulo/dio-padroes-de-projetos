package one.digitalinovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.digitalinovation.gof.model.Endereco;
/**
 * Cliente http, criado via <b>OpenFeign</b>, para consumo de API do
 * 
 * <b> ViaCep</b>
 * 
 * @author Andréa
 *
 */

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
	
	@GetMapping("/{cep}/json/")
	Endereco consultarCep(@PathVariable("cep")String cep);

}
