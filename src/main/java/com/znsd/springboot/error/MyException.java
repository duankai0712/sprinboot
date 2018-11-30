package com.znsd.springboot.error;

/**
 * 自定义错误类 MyException
 * Created by Administrator on 2018/11/30.
 */

public class MyException extends RuntimeException {
    public MyException(){
        super("自定义异常信息 七友");
    }
}
