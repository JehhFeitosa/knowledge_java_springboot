package br.com.feitosa.jessica.aula02_springboot_config_yaml.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	//injetar informacoes com o app.menssage
	@Value("${app.message}")
	private String appMessage;
	
	@Value("${ENV_DB_URL:NENHUMA}")
	private String dbEnvironmentVariable;
	
	//Exibicao da mensage no browser
	@GetMapping("/")
	public String getAppMessage() {
		return appMessage;
	}
	
	@GetMapping ("/envVariable")
	public String getEnvironmentVariable() {
		return "A seguinte variável de ambiente foi passada: " + dbEnvironmentVariable;
	}
	
}
