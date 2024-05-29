package com.example.json.tutorial;

import org.springframework.data.jpa.repository.JpaRepository;

public interface rolerepo extends JpaRepository<role, Long> {

	role findByname(String name);
}
