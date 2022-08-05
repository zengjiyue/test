package com.cy.service;

import com.cy.bean.User;

import java.util.List;

public interface UserService {
    public User findUser(String acc, String pwd);
    public User findSameUser(String acc);
    public int insertUser(String acc, String pwd, String picture, String idCard,long roleId);
    public List<User> findUserList();
    public int delUser(long id);
    public List<User> echoUser(long id);
    public int updUser(String acc, String pwd, String idCard, long id);
}
