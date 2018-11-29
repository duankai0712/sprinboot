package com.znsd.springboot.entitys;

/**
 * Created by Administrator on 2018/11/28.
 */
public class Claszz {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Claszz{" +
                "name='" + name + '\'' +
                '}';
    }
}
