package com.cy.service.serviceImpl;

import com.cy.bean.User;
import com.cy.mapper.UserMapper;
import com.cy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser(String acc, String pwd) {
        return userMapper.findUser(acc, pwd);
    }

    @Override
    public User findSameUser(String acc) {
        return userMapper.findSameUser(acc);
    }

    @Override
    public int insertUser(String acc, String pwd, String picture, String idCard,long roleId) {
        int i = userMapper.insertUser(acc, pwd, picture, idCard,roleId);
        return i;
    }

    @Override
    public List<User> findUserList() {
        return userMapper.findUserList();
    }

    @Override
    public int delUser(long id) {
        return userMapper.delUser(id);
    }

    @Override
    public List<User> echoUser(long id) {
        return userMapper.echoUser(id);
    }

    @Override
    public int updUser(String acc, String pwd, String idCard, long id) {
        return userMapper.updUser(acc, pwd, idCard, id);
    }
}
