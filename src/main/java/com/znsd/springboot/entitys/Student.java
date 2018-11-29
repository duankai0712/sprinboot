package com.znsd.springboot.entitys;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/11/28.
 */
@ConfigurationProperties(prefix = "student")
@Component
public class Student {
    private String name;
    private Integer age;
    private Claszz claszz;
    private String[] array;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setClaszz(Claszz claszz) {
        this.claszz = claszz;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", claszz=" + claszz +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
