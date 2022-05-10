package Harsha.SpringBoot.backend.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Harsha.SpringBoot.backend.model.User;

public interface userRepositry extends JpaRepository<User, Long> {

	

}
