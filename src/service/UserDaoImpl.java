package service;

import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.User;

import javax.jws.soap.SOAPBinding;

public class UserDaoImpl implements UserDao  {
    @Autowired
    UserMapper userMapper;
    @Override
    public User Login(User user) {
        return userMapper.login(user);
    }
}
