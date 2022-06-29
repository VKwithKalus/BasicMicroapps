package com.dailycodebuffer.userService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.userService.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	User findByUserId(Long userId);



}
