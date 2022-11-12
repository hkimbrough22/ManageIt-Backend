package com.at.ManageItBackend.Controller;

import com.at.ManageItBackend.Entity.User;
import com.at.ManageItBackend.Service.Impl.UserServiceImpl;
import com.at.ManageItBackend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = null;
        try{
            users = userService.getAllUsers();
        } catch(Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    @GetMapping("/getById/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id){
        User user = null;
        try{
            user = userService.getUserById(id);
        } catch(Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user){

        try{
            user = userService.addOrUpdateUser(user);
        } catch(Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<User> addUser(@PathVariable int id){

        User user = null;

        try{
            user = userService.deleteUser(id);
        } catch(Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
