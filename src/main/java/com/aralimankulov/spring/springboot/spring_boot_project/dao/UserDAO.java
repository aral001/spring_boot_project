package com.aralimankulov.spring.springboot.spring_boot_project.dao;

import com.aralimankulov.spring.springboot.spring_boot_project.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
