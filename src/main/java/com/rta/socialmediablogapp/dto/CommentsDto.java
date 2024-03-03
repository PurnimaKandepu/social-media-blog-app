package com.rta.socialmediablogapp.dto;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CommentsDto {
    private Long id;

    private String emailId;

    private String name;


    private String body;

}
