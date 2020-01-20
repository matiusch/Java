package br.org.generation.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerTeste {
	
	@GetMapping("Hello")
	public String sayHello() {
		return "<marquee style=\"color:red;\">HelloWorld</marquee>";
	}
	
	@GetMapping("/tchau")
	public String Tchau() {
		return "<marquee style=\"color:red;font-size:28px\">Tchau, vamos almoçar</marquee>";
	}
	

}
