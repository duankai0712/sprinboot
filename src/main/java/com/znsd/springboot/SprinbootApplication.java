package com.znsd.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.znsd.springboot.dao") //扫描com.znsd.springboot.dao下的mapper
@SpringBootApplication()
public class SprinbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinbootApplication.class, args);
	}

}
