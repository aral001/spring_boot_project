package com.aralimankulov.spring.springboot.spring_boot_project.service;

import com.aralimankulov.spring.springboot.spring_boot_project.dao.UserDAO;
import com.aralimankulov.spring.springboot.spring_boot_project.model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
