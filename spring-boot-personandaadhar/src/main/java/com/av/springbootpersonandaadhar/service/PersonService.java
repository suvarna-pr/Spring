package com.av.springbootpersonandaadhar.service;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.av.springbootpersonandaadhar.dao.PersonDao;
import com.av.springbootpersonandaadhar.dto.Person;
import com.av.springbootpersonandaadhar.dto.ResponseStructure;
import com.av.springbootpersonandaadhar.exception.NoIdFoundExecption;

@Service
public class PersonService {
	@Autowired
	PersonDao personDao;
	
	public ResponseStructure<Person> savePerson(Person person)
	{
		ResponseStructure<Person> responseStructure=new ResponseStructure<>();//with the help of responsestructure we can change the structure of input
		Person person2=personDao.savePerson(person);
				if(person2!=null)
				{
					responseStructure.setStatuscode(HttpStatus.CREATED.value());
					responseStructure.setMsg("Person data saved");
					responseStructure.setData(person2);
				}
		return responseStructure;
		
	}
	public ResponseStructure<List<Person>> getAllPerson() {
		ResponseStructure<List<Person>> responseStracture = new ResponseStructure<List<Person>>();
		List<Person> list = personDao.getAllPerson();

		if (list.isEmpty()) {
			responseStracture.setStatuscode(HttpStatus.NOT_FOUND.value());
			responseStracture.setMsg("Person data is not found");
			responseStracture.setData(null);
		} else {
			responseStracture.setStatuscode(HttpStatus.FOUND.value());
			responseStracture.setMsg("Person Details");
			responseStracture.setData(list);
		}
		return responseStracture;
	}

	public ResponseStructure<Person> getPersonById(int id) {
		ResponseStructure<Person> responseStracture = new ResponseStructure<Person>();
		Person person = personDao.getPersonById(id);
		if (person != null) {
			responseStracture.setStatuscode(HttpStatus.FOUND.value());
			responseStracture.setMsg("Person Detail");
			responseStracture.setData(person);
		} else {
			throw new NoIdFoundExecption("No Id "+id+ " Does not found");
		}
		return responseStracture;
	}

	public ResponseStructure<String> deletePerson(int id) {
		ResponseStructure<String> responseStracture = new ResponseStructure<String>();

		Person person = personDao.getPersonById(id);
		if (person != null) {
			responseStracture.setStatuscode(HttpStatus.FOUND.value());
			responseStracture.setMsg("Person Data is deleted");
			responseStracture.setData(personDao.deletePerson(id));
		} else {
			throw new NoIdFoundExecption("No Id "+id+ " Does not found");
		}
		return responseStracture;
	}

	public ResponseStructure<Person> updatePerson(Person person) {
		ResponseStructure<Person> responseStructure = new ResponseStructure<Person>();

		Person person2 = personDao.getPersonById(person.getId());
		if (person2 != null) {
			responseStructure.setStatuscode(HttpStatus.FOUND.value());
			responseStructure.setMsg("Person Data is updated");
			responseStructure.setData(personDao.updatePerson(person));
		} else {
			throw new NoIdFoundExecption("No Id "+person.getId()+ " Does not found");
		}
		return responseStructure;
	}
}
	

