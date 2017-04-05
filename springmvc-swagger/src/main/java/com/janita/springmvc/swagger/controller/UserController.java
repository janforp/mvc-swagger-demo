package com.janita.springmvc.swagger.controller;

import com.janita.springmvc.swagger.bean.User;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Janita on 2017-04-05 15:17
 */
@Controller
@Api(description = "user",value = "/user")
public class UserController {

    @ResponseBody
    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    @ApiOperation(value = "根据id查询用户", notes = "根据id查询用户")
    public User getUser(String userId){
        User user = new User();
        user.setUserId(userId);
        user.setUsername("Janita");
        return user;
    }

//    @ResponseBody
//    @RequestMapping(value = "/add",method = RequestMethod.POST)
//    @ApiOperation(value = "添加用户",notes = "添加用户")
//    public User addUser(@RequestBody User user){
//        return user;
//    }
}
