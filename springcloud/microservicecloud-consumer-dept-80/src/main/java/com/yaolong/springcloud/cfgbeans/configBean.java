package com.yaolong.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author yaoLong
 * @date 2019/8/25  15:08
 */
@Configuration
public class configBean {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
