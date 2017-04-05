package com.janita.mvc.controller;

import com.janita.mvc.bean.Car;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Janita on 2017-04-05 18:12
 */
@Api(description = "car")
@RequestMapping("/car")
@ResponseBody
@Controller
public class CarController {

    @RequestMapping(value = "/find",method = RequestMethod.GET)
    @ApiOperation(value = "查詢",notes = "查詢")
    public Car getCar(Long carId){
        Car car = new Car();
        car.setCarId(carId);
        car.setCarName("Car");
        return car;
    }
}
