package com.coll.OnlineCollaborate.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coll.OnlineCollaborate.Dao.IUserDao;
//import com.coll.OnlineCollaborate.dao.IUserDao;
import com.coll.OnlineCollaborate.model.User;
import com.coll.OnlineCollaborate.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	@Autowired
	IUserDao userDao;

	@Override
	public List<User> userListbyStatus(String status) {
	
		return userDao.userListbyStatus(status);
	}

	@Override
	public List<User> getAllUsers() {
		
		return userDao.getAllUsers();
	}

	@Override
	public User getUserById(int UserId) {
		
		return userDao.getUserById(UserId);
	}

	@Override
	public User getUserByUserName(String Username) {
		
		return userDao.getUserByUserName(Username);
	}

	@Override
	public User validateUser(User user) {
		
		return userDao.validateUser(user);
	}

	@Override
	public boolean addUser(User user) {
		
		return userDao.addUser(user);
	}

	@Override
	public boolean updateUser(User user) {
		
		return userDao.updateUser(user);
	}

	@Override
	public boolean deleteUser(int userId) {
		
		return userDao.deleteUser(userId);
	}

	@Override
	public boolean deactiveUser(int userId) {
		
		return userDao.deactiveUser(userId);
	}

	@Override
	public boolean updateUserProfile(String file, Integer userId) {
		
		return userDao.updateUserProfile(file, userId);
	}
	@Override
	public boolean activeUser(int userId) {
		
		return userDao.activeUser(userId);
	}


	@Override
	public List<User> getAllDeactiveUser() {
		
		return userDao.getAllDeactiveUser();
	}

	

}
