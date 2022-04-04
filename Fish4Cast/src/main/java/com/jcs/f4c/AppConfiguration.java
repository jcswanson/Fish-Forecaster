package com.jcs.f4c;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfiguration {

	 	@Bean
	    public RestTemplate restTemplate(RestTemplateBuilder builder) {
	        // Do any additional configuration here
	        return builder.build();
	    }



}
