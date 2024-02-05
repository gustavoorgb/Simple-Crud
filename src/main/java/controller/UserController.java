package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.User;
import services.UserServices;




@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserServices service;
	
	@GetMapping("/{userId}")
	public User getUserById(@PathVariable long userId) {
		return service.getUserById(userId);}
		
	@GetMapping("/byIds")
	public List<User> getAllUsersByIds(List<Long> usersIds){
		return service.findAllUsersByIds(usersIds);
	}
	
	@PostMapping("/create")
	public User createUser(@RequestBody User entity) {
		
		return service.createUser(entity);
	}
	
	
	


}
