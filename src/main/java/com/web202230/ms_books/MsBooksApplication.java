package com.web202230.ms_books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class MsBooksApplication  {

	public static void main(String[] args) {
		SpringApplication.run(MsBooksApplication.class, args);
	}
	


}
