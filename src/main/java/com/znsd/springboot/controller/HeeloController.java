package com.znsd.springboot.controller;


import com.znsd.springboot.entitys.Student;
import com.znsd.springboot.entitys.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2018/11/28.
 */
@Controller
public class HeeloController {

    @Autowired
    private Student studen;
    @Autowired
    public StudentService studentService;
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        System.out.println(studen);
        System.out.println(studentService);
        List list = new ArrayList();
        return  studen.toString();
    }

    @RequestMapping("/student")
    public String longing(){
        System.out.println("该有");
        return "hello";
    }
}
