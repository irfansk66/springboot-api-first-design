package com.lib.springbootapifirstdesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.ForwardedHeaderFilter;

@SpringBootApplication
public class SpringbootApiFirstDesignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApiFirstDesignApplication.class, args);
	}

}
