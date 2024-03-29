package com.aralimankulov.spring.springboot.spring_boot_project.service;

import com.aralimankulov.spring.springboot.spring_boot_project.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
