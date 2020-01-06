package com.lanou.springbootssm.service;



import com.lanou.springbootssm.bean.User;
import com.lanou.springbootssm.bean.UserExample;
import com.lanou.springbootssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class userServiceImpl implements userService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> userAll() {
        return userMapper.selectByExample(null);
    }

    @Override
    public List<User> userBycondition(User user) {
        UserExample condition = new UserExample();
        UserExample.Criteria criteria = condition.createCriteria();

        return userMapper.selectByExample(condition);
    }
}
