package Harsha.SpringBoot.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Harsha.SpringBoot.backend.model.User;


@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("api/")
public class UserController {
	
	@Autowired
	private Harsha.SpringBoot.backend.repositry.userRepositry userRepositry;
	
	@GetMapping("users")
	public List<User> getUsers(){
		return this.userRepositry.findAll();
	}

}
