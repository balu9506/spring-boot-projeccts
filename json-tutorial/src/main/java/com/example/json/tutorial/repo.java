package com.example.json.tutorial;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repo extends JpaRepository<User,Long> {
	User findByUsername(String Username);

}
