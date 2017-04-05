package com.janita.swagger.controller;

import com.janita.swagger.bean.Car;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Janita on 2017-04-05 19:42
 */
@Api(value = "/car",description = "用户接口")
@Controller
@RequestMapping("/car")
public class CarController {


    @ApiOperation(value = "添加汽车",notes = "新增car")
    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public Car addUser(@RequestBody Car car){
        return car;
    }

    @ApiOperation(value = "查询car接口", notes = "根据car ID查询car")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Car getUser(@ApiParam(name = "id", value = "用户ID", required = true) String carId) {
        Car car = new Car();
        car.setCarId(carId);
        car.setName("car例子");
        return car;
    }

    @ApiOperation(value = "更新Car接口", notes = "更新Car")
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Car updateUser(@ApiParam(required = true, value = "用户数据") @RequestBody Car car) {
        return car;
    }

    @ApiOperation(value = "删除Car接口", notes = "删除Car")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Car deleteUser(@ApiParam(name = "id", value = "用户ID", required = true) @PathVariable("id") String carId) {
        Car car = new Car();
        car.setCarId(carId);
        return car;
    }
}
