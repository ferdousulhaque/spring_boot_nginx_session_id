package com.nginx.session_id;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarterApplication {
	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);
	}

}

//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan