package com.v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SbJavaJenkinTestProgApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbJavaJenkinTestProgApplication.class, args);
	}

}
