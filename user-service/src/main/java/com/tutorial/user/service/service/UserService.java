package com.tutorial.user.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.user.service.entity.User;
import com.tutorial.user.service.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public List<User> getAll(){
		return userRepository.findAll();
	}
	
	public User getUsuarioById(int id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public User save(User user) {
		return userRepository.save(user);
	}
}
