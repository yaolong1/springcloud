package com.yaolong.order_system.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yaoLong
 * @date 2019/9/3  15:43
 */
@Data
public class Menu implements Serializable {
    private Long id;
    private String name;
    private Double price;

    private String flavor;

    private Type type;
}
