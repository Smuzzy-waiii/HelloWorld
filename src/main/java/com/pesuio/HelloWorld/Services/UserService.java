package com.pesuio.HelloWorld.Services;

import com.pesuio.HelloWorld.Models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> userList = new ArrayList<>();

    public List<User> getUsers() {
        return userList;
    }

    public void addUser(User user) {
        userList.add(user);
    }
}
