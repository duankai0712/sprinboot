package com.znsd.springboot.controller;


import com.znsd.springboot.Service.StudentServiceImpl;
import com.znsd.springboot.entitys.Grede;
import com.znsd.springboot.entitys.Student;
import com.znsd.springboot.entitys.StudentService;
import com.znsd.springboot.error.MyException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    private DataSource dataSource;     //数据源
    private Logger logger = LogManager.getLogger(HeeloController.class.getName());     //log4j 日志
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

        Date tade = new Date();
        SimpleDateFormat simp = new SimpleDateFormat();
        String time = simp.format(tade);
        logger.error("这是一条错误时间:s"+time);
        return "demo";
    }

}
