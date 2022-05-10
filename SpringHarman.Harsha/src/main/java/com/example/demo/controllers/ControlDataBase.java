package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Model;

@RestController
public class ControlDataBase {
	
	@Autowired
	ServiceDataBase db;
	
	@RequestMapping(method=RequestMethod.POST,value="/assign")
	public void PostPersons(@RequestBody Model body) {
		db.addPersons(body);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/get")
	public List<Model> getAllPersons() {
		return db.getPersons();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/get/{id}")
	public Model getOnePerson(@PathVariable int id) {
		return db.getOnePerson(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="assign/{id}")
	public void updatePersons(@RequestBody Model body, @PathVariable int id) {
		db.updatePersons(body,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/delete/{id}")
	public void deletePersons(@PathVariable int id) {
		db.deletePersons(id);
	}
	
	
	
	
}
