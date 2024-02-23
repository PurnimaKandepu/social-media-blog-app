package com.rta.socialmediablogapp.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table (name="Posts")
@Data

// create fields , constructors(@NoArgsConstructor ), getters(@Getter) , setters(@Setter)

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title ;

    @Column
    private String description;

    @Column
    private String content;
}
