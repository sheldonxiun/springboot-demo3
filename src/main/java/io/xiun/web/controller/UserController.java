package io.xiun.web.controller;


import io.xiun.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;
    //Logger logger = Logger.getLogger(MutiDatasourceController.class);

    @RequestMapping("register")
    @ResponseBody
    public String register(String username, String password) {
        //logger.info("===:username:" + username + " password:" + password);
        userService.save(username, password);
        return "success";
    }

    @RequestMapping("login")
    public String login(String username, String password) {
        return "user/list";
    }

}
