package com.rta.socialmediablogapp.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;


//@Data generates all the boilerplate that is normally associated with simple POJOs (Plain Old Java Objects)
// and beans @ToString , @EqualsAndHashCode , @Getter / @Setter and @RequiredArgsConstructor together:

@Data
public class PostDto {


    private Long id;


    private String title ;


    private String description;


    private String content;
}
