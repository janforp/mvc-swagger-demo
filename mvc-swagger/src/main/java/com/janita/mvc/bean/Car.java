package com.janita.mvc.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Janita on 2017-04-05 18:06
 */
@Data
public class Car implements Serializable {

    private Long carId;

    private String carName;
}
