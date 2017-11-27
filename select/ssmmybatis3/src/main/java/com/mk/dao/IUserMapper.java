package com.mk.dao;

import java.util.List;

import com.mk.bean.Params;
import com.mk.bean.User;

public interface IUserMapper {

	public List<User> findUsers(Params params);
	public User getUser(Integer id);
	public int saveUser(User user);
	public int updateUser(User user);
	public int deleteUser(Integer id);
}
