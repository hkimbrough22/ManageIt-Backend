package com.at.ManageItBackend.Service;

import com.at.ManageItBackend.Entity.Users.User;

import java.util.List;


public interface UserService {

    public List<User> getAllUsers();
    public User getUserById(int userId);
    public User addOrUpdateUser(User user);
    public User deleteUser(int userId) throws Exception;
}
