package com.rta.socialmediablogapp;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SocialMediaBlogAppApplication {

	/*@Bean
	//public ModelMapper ModelMapperBean(){
		return new ModelMapper();
	}*/
	public static void main(String[] args) {


		SpringApplication.run(SocialMediaBlogAppApplication.class, args);

	//	ApplicationContext context
	//			= new AnnotationConfigApplicationContext(
	//			SocialMediaBlogAppConfiguration.class);

	}

}
