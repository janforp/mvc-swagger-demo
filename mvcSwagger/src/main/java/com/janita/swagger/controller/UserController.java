package com.janita.swagger.controller;

import com.janita.swagger.bean.User;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Janita on 2017-04-05 19:30
 */
@Api(value = "/user",description = "用户接口")
@Controller
public class UserController {

    @ApiOperation(value = "添加用户",notes = "新增用户")
    @RequestMapping(value = "/user/add",method = RequestMethod.PUT)
    @ResponseBody
    public User addUser(@ApiParam(required = true,value = "用户数据") @RequestBody User user){
        return user;
    }

    @ApiOperation(value = "查询用户接口", notes = "根据用户ID查询用户")
    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@ApiParam(name = "id", value = "用户ID", required = true) @PathVariable("id") Integer userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUsername("user例子");
        return user;
    }

    @ApiOperation(value = "更新用户接口", notes = "更新用户")
    @RequestMapping(value = "user", method = RequestMethod.POST)
    @ResponseBody
    public User updateUser(@ApiParam(required = true, value = "用户数据") @RequestBody User user) {
        return user;
    }

    @ApiOperation(value = "删除用户接口", notes = "删除用户")
    @RequestMapping(value = "user/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public User deleteUser(@ApiParam(name = "id", value = "用户ID", required = true) @PathVariable("id") Integer userId) {
        User user = new User();
        user.setUserId(userId);
        return user;
    }
}
