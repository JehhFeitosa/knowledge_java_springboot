package br.com.feitosa.jessica.aula02_springboot_config_yaml.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Getter;
import lombok.Setter;

/*
 * Mapeando as configuracoes
 * de cada ambiente
 */

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {
	
	private String driverClassName;
	private String url;
	private String username;
	private String password;
	
	//Método responsável pelo mapeamento 
	//do BD do ambiente de Dev
	@Profile("dev")
	@Bean
	public String testDatabaseConnection() {
		System.out.println("DB connection for DEV - H2");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB Connecion to H2_TEST - Test instance";
	}
	
	
	//Método responsável pelo mapeamento 
	//do BD do ambiente de Prod
	@Profile("prod")
	@Bean
	public String productionDatabaseConnection() {
		System.out.println("DB connection for Production - MySQL");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB Connection to MYSQL_PROD - Production instance";
	}

}
