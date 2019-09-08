package com.yaolong.order_system.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yaoLong
 * @date 2019/9/4  22:27
 */
@Data
public class Type implements Serializable {
    private long id;
    private String name;
}
