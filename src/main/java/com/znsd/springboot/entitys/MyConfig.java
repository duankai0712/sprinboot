package com.znsd.springboot.entitys;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018/11/28.
 */
@Configuration
public class MyConfig {
    @Bean
    public StudentService getstudentService(){
        return new StudentService();
    }
}
