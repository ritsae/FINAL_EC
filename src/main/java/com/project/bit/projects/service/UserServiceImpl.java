package com.project.bit.projects.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bit.projects.domain.Users;
import com.project.bit.projects.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	public UserServiceImpl() {
		
	}

	@Override
	public Optional<Users> selectUserById(String USER_ID) {
		return userMapper.selectUserById(USER_ID);
	}

	@Override
	public void insertUser(Users user) {
		userMapper.insertUser(user);
		
	}

}
