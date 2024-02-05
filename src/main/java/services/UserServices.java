package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.User;
import repositories.UserRepository;

@Service
public class UserServices {

	@Autowired
	private UserRepository userRepository;
	
	public User getUserById(long userId){
		
		return userRepository.findById(userId).orElse(null);
	}
	
	public List<User> findAllUsersByIds(List<Long>  userIds){
		return userRepository.findAllById(userIds);
	}
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
}
