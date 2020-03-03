package com.zhou.dao;

import com.zhou.domain.User;

public interface UserDao {

    public User findByUserName (String userName);

    public void saveUser (User user);
}
