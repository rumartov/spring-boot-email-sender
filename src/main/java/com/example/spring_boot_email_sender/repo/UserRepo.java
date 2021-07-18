package com.example.spring_boot_email_sender.repo;


import com.example.spring_boot_email_sender.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
    User findByUsername(String username);
    Page<User> findByUsername(String username, Pageable page);
    User findByEmail(String email);
    Page<User> findAll(Pageable page);
}