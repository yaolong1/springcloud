package com.yaolong.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yaoLong
 * @date 2019/8/29  16:19
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
//        return new RoundRobinRule(); //Ribbon默认是轮询，我自定义为随机
        return new RandomRule_YYL();   //我自定义为每个机器被访问5次
    }
}