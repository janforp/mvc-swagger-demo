package com.janita.swagger.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Janita on 2017-04-05 19:15
 */
@Data
public class User implements Serializable {

    private Integer userId;
    private String username;

}
