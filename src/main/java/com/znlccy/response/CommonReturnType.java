package com.znlccy.response;

import lombok.Data;

/**
 * author: admin
 * date: 2018/12/29-12:04
 * version: 1.0.0
 * comment:
 */
@Data
public class CommonReturnType<T> {

    private Integer code;

    private String message;

    private T data;
}
