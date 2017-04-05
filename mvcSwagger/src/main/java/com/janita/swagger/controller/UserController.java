package com.janita.swagger.controller;

import com.janita.swagger.bean.User;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
