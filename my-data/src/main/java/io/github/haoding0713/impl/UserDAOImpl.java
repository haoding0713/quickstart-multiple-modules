package io.github.haoding0713.impl;

import io.github.haoding0713.UserDAO;




public class UserDAOImpl implements UserDAO{

    @Override
    public String getUserById(Long id) {
        return "Root";
    }

    @Override
    public String getUserByName(String name) {
        return name;
    }
}
