package com.lanou.springbootssm.service;

import com.lanou.springbootssm.bean.User;

import java.util.List;

public interface userService {

List<User>  userAll();
List<User>  userBycondition(User user);
}
