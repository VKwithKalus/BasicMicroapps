package com.dailycodebuffer.userService.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.userService.Entity.User;
import com.dailycodebuffer.userService.Service.UserService;
import com.dailycodebuffer.userService.VO.ResponseTemplateVO;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService uservice;
	
	@PostMapping("/saveUserData")
	public User saveUser(@RequestBody User user) {
		return uservice.saveUser(user);
	}
	
	@GetMapping("/{UserId}")
	public Optional<User> getByUserId(@PathVariable Long UserId) {
		return uservice.getByUserId(UserId);
	}
	
	@GetMapping("/getUserWithDepartment/{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
		return uservice.getUserWithDepartment(userId);
	}
}
