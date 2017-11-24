package io.github.haoding0713.service.impl;

import io.github.haoding0713.UserDAO;
import io.github.haoding0713.service.MessageService;

public class MessageServiceImpl extends MessageService {

    private String prefix;

    private String suffix;

    private UserDAO userDAO;


    @Override
    public String greeting(String name) {
        final StringBuilder sb = new StringBuilder("[").append(userDAO.getUserById(0L)).append("] ").append(prefix).append(userDAO.getUserByName(name)).append(suffix);
        return sb.toString();
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
