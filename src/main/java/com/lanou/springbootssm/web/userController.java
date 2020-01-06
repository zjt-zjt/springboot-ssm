package com.lanou.springbootssm.web;

import com.lanou.springbootssm.bean.User;
import com.lanou.springbootssm.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class userController {

    @Autowired
    private userService userservice;

    @RequestMapping("/userlist")
    public String userlist(Model model) {
        List<User> user =userservice.userAll();
       model.addAttribute("users",user);
        return "userlist";
    }
}
