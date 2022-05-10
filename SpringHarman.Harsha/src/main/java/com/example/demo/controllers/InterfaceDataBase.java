package com.example.demo.controllers;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Model;

public interface InterfaceDataBase extends CrudRepository<Model, Integer>{

}
