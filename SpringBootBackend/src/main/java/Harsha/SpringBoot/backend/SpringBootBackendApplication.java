package Harsha.SpringBoot.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Harsha.SpringBoot.backend.model.User;
import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class SpringBootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}
	
	
	@Autowired
	private Harsha.SpringBoot.backend.repositry.userRepositry userRepositry;
	@Override
	public void run(String... args) throws Exception {
		
		this.userRepositry.save(new User("Harsha","vardhan","harsha@gmail.com"));
		this.userRepositry.save(new User("Hemanath","Reddy","hemanath@gmail.com"));
		this.userRepositry.save(new User("Jaswanth","Achari","Jaswanth@gmail.com"));
		System.out.println("CRUD Application");
		
		
	}

}
