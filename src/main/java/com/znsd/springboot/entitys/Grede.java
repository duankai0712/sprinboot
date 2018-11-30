package com.znsd.springboot.entitys;/**
 * Created by Administrator on 2018/11/30.
 *
 * @ClassName Grede
 * @Author Administrator
 * @DATE 2018/11/30 20:04
 */

public class Grede {
    private Integer stuid;
    private String stuname;
    private String sex;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Grede{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
