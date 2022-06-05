package com.pesuio.HelloWorld.Controllers;

import com.pesuio.HelloWorld.Models.User;
import com.pesuio.HelloWorld.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class HelloWorldController {

    @Autowired
    UserService userService = new UserService();

    @RequestMapping("/helloworld")
    public static String helloWorld() {
        return "Hello World, My Name is Smaran";
    }

    @RequestMapping("/users")
    public List<User> users() {
        return userService.getUsers();
    }

    @PostMapping( "/add")
    public String addUser(int userId, String username) {
        userService.addUser(new User(userId, username));
        return "User successfully added!";
    }
}
