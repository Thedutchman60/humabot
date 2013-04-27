package com.jiguancheng.humabot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiguancheng.humabot.entity.UserBean;
import com.jiguancheng.humabot.service.UserService;

@Controller("user-controller")
@RequestMapping(value="/usermanage")
public class UserController {
	@Autowired
	private UserService userService;
	
    @RequestMapping(value = "queryUsers.ajax", method = RequestMethod.POST)
    public @ResponseBody List<UserBean> read() {
        return this.userService.queryAllUsers();
    }
}
