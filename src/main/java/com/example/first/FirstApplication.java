package com.example.first;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		var app = new SpringApplication(FirstApplication.class);
		app.setDefaultProperties(Collections.singletonMap("spring.profiles.active", "test"));
		var ctx = app.run(args);
		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());
		System.out.println(myFirstService.getCustomPropertyFromAnotherFile());
		System.out.println(myFirstService.getCustomString());
		System.out.println(myFirstService.getCustomInteger());

	}

}
