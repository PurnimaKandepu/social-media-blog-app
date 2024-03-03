package com.rta.socialmediablogapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


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

    @OneToMany(mappedBy = "post",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Comments> comments = new HashSet<>();
}
