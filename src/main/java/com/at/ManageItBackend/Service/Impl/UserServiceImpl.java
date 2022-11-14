package com.at.ManageItBackend.Service.Impl;

import com.at.ManageItBackend.Entity.Users.User;
import com.at.ManageItBackend.Repository.UserRepository;
import com.at.ManageItBackend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public User addOrUpdateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User deleteUser(int userId) {
        User deletedUser = null;
        try{
            deletedUser = userRepository.findById(userId).orElse(null);
            if (deletedUser == null) {
                throw new Exception("User not found.");
            } else{
                userRepository.delete(deletedUser);
            }
        } catch(Exception ex){
            System.err.println(ex.getMessage());
        }
        return deletedUser;
    }
}
