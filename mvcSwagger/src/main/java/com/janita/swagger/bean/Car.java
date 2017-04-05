package com.janita.swagger.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Janita on 2017-04-05 19:42
 */
@Data
public class Car implements Serializable {
    private String carId;

    private String name;
}
