package com.chidi.joblisting;


import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JoblistingApplication {

	@Bean
	public GroupedOpenApi publicApi() {
		return GroupedOpenApi.builder()
				.group("springshop-public")
				.pathsToMatch("/**")
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(JoblistingApplication.class, args);
	}
}
