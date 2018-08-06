package com.zdhz.service;

import com.zdhz.bean.User;

public interface UserService {
    public void saveUser(User user);
    public void deleteUser(User user);
    public void deleteUserById(String id);
}
