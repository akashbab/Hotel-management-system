package com.service;
import com.bean.User;
import com.dao.UserDao;
public class UserService {
	private UserDao userDAO = new UserDao();

    public boolean registerUser(User user) {
        return userDAO.registerUser(user);
    }
    
    public User loginUser(String username, String password) {
        return userDAO.loginUser(username, password);
    }
}
