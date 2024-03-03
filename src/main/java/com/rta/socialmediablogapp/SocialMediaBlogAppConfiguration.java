package com.rta.socialmediablogapp;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SocialMediaBlogAppConfiguration {

    @Bean
    public ModelMapper ModelMapperBean(){
        return new ModelMapper();
    }
}
