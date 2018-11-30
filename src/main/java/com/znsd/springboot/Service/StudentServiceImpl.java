package com.znsd.springboot.Service;

import com.znsd.springboot.dao.StudentMapper;
import com.znsd.springboot.entitys.Grede;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/11/30.
 *
 * @ClassName StudentService
 * @Author Administrator
 * @DATE 2018/11/30 17:15
 */
@Service
public class StudentServiceImpl {

    @Autowired
    private StudentMapper studentMapper;
    public List<Grede> findStudent(){
        return studentMapper.findStudent();
    }
}
