package com.znsd.springboot.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 自定义错误类 MyException
 * Created by Administrator on 2018/11/30.
 */
@ControllerAdvice
public class MyExceptionHandler {
            @ExceptionHandler(MyException.class)
            public String handleException(Exception e, HttpServletRequest request){
                Map<String,Object> map = new HashMap<>();
             //传入我们自己的错误状态码 4xx 5xx，否则就不会进入定制错误页面的解析流程
                // Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
                request.setAttribute("javax.servlet.error.status_code",500);
                map.put("code","user.notexist");
                map.put("message",e.getMessage());
          //转发到/error
                return "forward:/error";
            }
}
