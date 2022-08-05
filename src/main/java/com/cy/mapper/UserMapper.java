package com.cy.mapper;

import com.cy.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    public User findUser(@Param("acc") String acc, @Param("pwd") String pwd);
    public User findSameUser(@Param("acc") String acc);
    public int insertUser(@Param("acc") String acc, @Param("pwd") String pwd, @Param("picture") String picture, @Param("idCard") String idCard,@Param("roleId")long roleId);
    public List<User> findUserList();
    public int delUser(@Param("id")long id);
    public List<User> echoUser(@Param("id") long id);
    public int updUser(@Param("acc")String acc,
                       @Param("pwd")String pwd,
                       @Param("idCard")String idCard,
                       @Param("id")long id
                       );
}
