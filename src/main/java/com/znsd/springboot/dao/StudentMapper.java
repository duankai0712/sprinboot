package com.znsd.springboot.dao;

import com.znsd.springboot.entitys.Grede;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/11/30.
 *
 * @ClassName StudentMapper
 * @Author Administrator
 * @DATE 2018/11/30 16:40StudentMapper
 */
@Repository
public interface StudentMapper {
    @Transactional
    List<Grede> findStudent();
}
