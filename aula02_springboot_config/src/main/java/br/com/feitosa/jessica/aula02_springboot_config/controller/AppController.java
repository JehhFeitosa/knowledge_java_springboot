package br.com.feitosa.jessica.aula02_springboot_config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	//injetar informacoes com o app.menssage
	@Value("${app.message}")
	private String appMessage;
	
	//Exibicao da mensage no browser
	@GetMapping("/")
	public String getAppMessage() {
		return appMessage;
	}
	
//	@GetMapping
//    public String welcome() {
//        return appMessage;
//    }
	
}
