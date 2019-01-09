package com.potekole.komisyon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan({"com.potekole.komisyon"})
//@EnableJpaRepositories({"com.potekole.komisyon.model"})
////@EntityScan(("com.matt"))
@EntityScan(("com.potekole.komisyon"))
@RestController
@SpringBootApplication(scanBasePackages="com.potekole.komisyon")
public class KomisyonHTApp {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(KomisyonHTApp.class, args);
		
	}
	
	@RequestMapping("/")
	String home() {
	    return "Hello World!";
	}

	
}
