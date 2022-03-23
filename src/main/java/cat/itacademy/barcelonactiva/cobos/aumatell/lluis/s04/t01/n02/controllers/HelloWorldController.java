package cat.itacademy.barcelonactiva.cobos.aumatell.lluis.s04.t01.n02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path="HelloWorld")
	public String saluda(@RequestParam(name="nom", required=false, defaultValue="UNKNOWN")String nom) {
		return String.format("Hola, %s. Estàs executant un projecte Gradle", nom);
	}
	
	@GetMapping(path={"HelloWorld2/{nom}", "HelloWorld2"})
	public String saluda2(@PathVariable(name="nom", required=false) String nom) {
		return String.format("Hola, %s. Estàs executant un projecte Gradle", nom);
	}
}
