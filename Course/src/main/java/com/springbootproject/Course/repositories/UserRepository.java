package com.springbootproject.Course.repositories;

import com.springbootproject.Course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
