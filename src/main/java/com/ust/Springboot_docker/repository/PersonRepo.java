package com.ust.Springboot_docker.repository;

import com.ust.Springboot_docker.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Integer>{
}
