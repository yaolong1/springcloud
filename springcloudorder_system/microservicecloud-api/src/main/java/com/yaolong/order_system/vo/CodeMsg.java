package com.yaolong.order_system.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yaoLong
 * @date 2019/9/4  20:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CodeMsg {
    private int code;
    private String msg;
    private int count;
}
