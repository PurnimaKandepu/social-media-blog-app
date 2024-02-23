package com.rta.socialmediablogapp.repository;

import com.rta.socialmediablogapp.entity.Post;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // SpringDataJPA
public interface PostRepoitory extends JpaRepository<Post,Long>{
}
