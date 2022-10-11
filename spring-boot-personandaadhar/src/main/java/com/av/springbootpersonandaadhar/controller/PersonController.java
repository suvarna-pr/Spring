package com.av.springbootpersonandaadhar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.av.springbootpersonandaadhar.dto.Person;
import com.av.springbootpersonandaadhar.dto.ResponseStructure;
import com.av.springbootpersonandaadhar.service.PersonService;



@RestController
public class PersonController {
@Autowired
	PersonService personService;

	@PostMapping("/person")
	public ResponseStructure<Person> savePerson(@RequestBody Person person)
	{
		return personService.savePerson(person);

		
	}
	
	
	
	@GetMapping("/person")
	public ResponseStructure<List<Person>> getAllPerson(){
		return personService.getAllPerson();
	}
	
	@GetMapping("/person/{id}")
	public ResponseStructure<Person> getPersonById(@PathVariable int id){
		return personService.getPersonById(id);
	}
	
	@DeleteMapping("/person/{id}")
	public ResponseStructure<String> deletePerson(@PathVariable int id){
		return personService.deletePerson(id);
	}
	
	@PutMapping("/person")
	public ResponseStructure<Person> updatePerson(@RequestBody Person person){
		return personService.updatePerson(person);
	}
}

