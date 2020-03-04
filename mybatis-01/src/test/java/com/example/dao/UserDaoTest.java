package com.example.dao;

import com.example.pojo.User;
import com.example.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void getUsers(){
        SqlSession session= MyBatisUtil.getSqlSession();
        UserDao userDao=  session.getMapper(UserDao.class);
        List<User> users = userDao.getUserList();
        for(User u:users){
            System.out.println(u);
        }
        session.close();

    }

    @Test
    public void getUserById(){
        SqlSession session= MyBatisUtil.getSqlSession();
        UserDao userDao=  session.getMapper(UserDao.class);
        User user = userDao.getUserById(1);
        System.out.println(user);

        session.close();

    }
    @Test
    public void addUser(){
        SqlSession session= MyBatisUtil.getSqlSession();
        UserDao userDao=  session.getMapper(UserDao.class);
        User user = new User();
        user.setId(5);
        user.setName("ceshi1");
        user.setPwd("111");
        userDao.addUser(user);
        session.commit();
        session.close();

    }

    @Test
    public void updateUser(){
        SqlSession session= MyBatisUtil.getSqlSession();
        UserDao userDao=  session.getMapper(UserDao.class);
        User user = new User();
        user.setId(3);
        user.setName("李四");
        user.setPwd("123456");
        userDao.updateUser(user);
        session.commit();
        session.close();

    }

    @Test
    public void deleteUserById(){
        SqlSession session= MyBatisUtil.getSqlSession();
        UserDao userDao=  session.getMapper(UserDao.class);
        userDao.deleteUserById(5);
        session.commit();
        session.close();

    }

}
