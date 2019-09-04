package com.yaolong.ordersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;

import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yaoLong
 * @date 2019/9/4  16:31
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulGateway_App {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway_App.class,args);
    }
//    @Bean
//    public CorsFilter corsFilter() {
//        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        final CorsConfiguration corsConfiguration = new CorsConfiguration();
////        corsConfiguration.setAllowCredentials(true);
//        corsConfiguration.addAllowedHeader("*");
//        corsConfiguration.addAllowedOrigin("*");
//        corsConfiguration.addAllowedMethod("*");
//        source.registerCorsConfiguration("/**", corsConfiguration);
//        return new CorsFilter(source);
//    }
@Bean
public CorsFilter corsFilter() {
    final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    final CorsConfiguration config = new CorsConfiguration();
    config.setAllowCredentials(true);
    List<String> origins = new ArrayList<>();
    origins.add("*");
    config.addAllowedOrigin(String.valueOf(origins));
    List<String> headers = new ArrayList<>();
    headers.add("*");
    config.addAllowedHeader(String.valueOf(headers));
    List<String> methods = new ArrayList<>();
    methods.add("OPTIONS");
    methods.add("GET");
    methods.add("POST");
    config.addAllowedMethod(String.valueOf(methods));
    source.registerCorsConfiguration("/**", config);
    return new CorsFilter(source);
}
}
