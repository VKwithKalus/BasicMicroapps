package com.dailycodebuffer.userService.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dailycodebuffer.userService.Entity.User;
import com.dailycodebuffer.userService.Repository.UserRepo;
import com.dailycodebuffer.userService.VO.Department;
import com.dailycodebuffer.userService.VO.ResponseTemplateVO;

@Service
public class UserService {

	@Autowired
	private UserRepo udao;
	
	@Autowired
	private RestTemplate resttemplate;
	
	public User saveUser(User user) {
		return udao.save(user);
	}
	
	public Optional<User> getByUserId(Long UserId) {
		return udao.findById(UserId);
	}
	
	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = udao.findByUserId(userId);
		Department department = resttemplate.getForObject("http://DEPARTMENTSERVICE/getByID/"+ user.getDepartmentId(), Department.class);
	
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}
}
