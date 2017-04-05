package com.janita.springmvc.swagger.bean;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by Janita on 2017-04-05 15:14
 */
@Data
@ApiModel(description = "用户")
public class User implements Serializable {

    @ApiModelProperty("用户ID")
    private String userId;
    @ApiModelProperty("用户名")
    private String username;
}
