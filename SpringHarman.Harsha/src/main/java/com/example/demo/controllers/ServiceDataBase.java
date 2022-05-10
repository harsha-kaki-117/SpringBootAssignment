package com.example.demo.controllers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Model;

@Service
public class ServiceDataBase {
	
	@Autowired
	InterfaceDataBase dblst;
	
	public void addPersons(Model body) {
		dblst.save(body);
	}

	public List<Model> getPersons() {
		List<Model> dblist = new ArrayList<>();
		for(Model p : dblst.findAll()) {
			dblist.add(p);
		}
		return dblist;
	}

	public void updatePersons(Model body, int id) {
		
		dblst.deleteById(id);
		dblst.save(body);
		
		 
	}

	public void deletePersons(int id) {
		dblst.deleteById(id);
		
	}

	public Model getOnePerson(int id) {
		return dblst.findById(id).get();
	}

	

}
