package com.yaolong.order_system.service;

import com.yaolong.order_system.entities.Menu;
import feign.hystrix.FallbackFactory;

import java.util.List;

/**
 * @author yaoLong
 * @date 2019/9/3  23:01
 */
public class FeginServiceConsumerFallbackFactory implements FallbackFactory<FeginServiceConsumer> {
    @Override
    public FeginServiceConsumer create(Throwable cause) {
        return new FeginServiceConsumer() {
            @Override
            public List<Menu> findAll(int index, int limit) {
                return null;
            }

//            @Override
//            public int count() {
//                return 0;
//            }
//
//            @Override
//            public Menu findById(Long id) {
//                return null;
//            }
//
//            @Override
//            public void save(Menu menu) {
//
//            }
//
//            @Override
//            public void update(Menu menu) {
//
//            }
//
//            @Override
//            public void deleteById(Long id) {
//
//            }
        };
    }
}
