package com.rta.socialmediablogapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String emailId;
    @Column
    private String name;

    @Column
    private String body;

    @ManyToOne
    @JoinColumn(name="post_id", nullable=false)
    private Post post;
}
