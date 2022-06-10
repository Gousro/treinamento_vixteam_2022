package com.treinamento_vixteam_2022.rodrigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class RodrigoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RodrigoApplication.class, args);
	}

}
