package com.mk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.bean.Params;
import com.mk.bean.User;
import com.mk.dao.IUserMapper;
import com.mk.service.IUserService;

@Service
public class UserServiceImpl implements IUserService  {
	
	@Autowired
	public IUserMapper userDao;

	public List<User> findUsers(Params params) {
		return userDao.findUsers(params);
	}

	public User getUser(Integer id) {
		return null;
	}

	public int saveUser(User user) {
		return 0;
	}

	public int updateUser(User user) {
		return 0;
	}

	public int deleteUser(Integer id) {
		return 0;
	}	
}
