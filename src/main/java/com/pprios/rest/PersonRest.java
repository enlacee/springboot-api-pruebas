package com.pprios.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pprios.dao.PersonDAO;
import com.pprios.model.Person;
import java.util.List;


@RestController
@RequestMapping("v1/person")
public class PersonRest {

	@Autowired
	private PersonDAO personDAO;

	// METTOD HTTP
	// GET, POST, PUT, DELETE -> 200 - 500 - 404
	
	@PostMapping("/save")
	public void save(@RequestBody Person person) {
		personDAO.save(person);
	}
	
	//	@GetMapping("/list")
	@GetMapping("")
	public List<Person> list(){
		return personDAO.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		personDAO.deleteById(id);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Person person) {
		personDAO.save(person);
	}
	
}
