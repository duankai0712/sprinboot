package com.znsd.springboot.controller;


import com.znsd.springboot.Service.StudentServiceImpl;
import com.znsd.springboot.entitys.Grede;
import com.znsd.springboot.entitys.Student;
import com.znsd.springboot.entitys.StudentService;
import com.znsd.springboot.error.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;


/**
* @Author duankai
* @Date 2018/11/30  16:14
*/
@Controller
public class HeeloController {

    @Autowired
    private Student studen;
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentServiceImpl studentServiceImpl;
    @Resource
    private DataSource dataSource;
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        System.out.println(studen);
        System.out.println(studentService);
        List list = new ArrayList();
        return studen.toString();
    }

    @RequestMapping("/student")
    public String longing() {
        System.out.println("该有");
        return "hello";
    }

    @RequestMapping("demo/{id}")
    public String demo(@PathVariable("id") Integer id, HttpServletRequest request)throws Exception {
        if (id == 5) {
            throw new MyException();
        }
        List<Grede> list =  studentServiceImpl.findStudent();
        request.setAttribute("grede",list);
        //输出连接池是否连接成功
        System.out.println(this.dataSource.getConnection());
        return "demo";
    }

}
