package com.micro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	

}
