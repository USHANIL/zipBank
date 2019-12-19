package com.finance.zipBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication()
public class ZipBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipBankApplication.class, args);
	}

}
