package com.av.springbootpersonandaadhar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.av.springbootpersonandaadhar.dto.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
