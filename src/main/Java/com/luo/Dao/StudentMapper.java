package com.luo.Dao;

import com.luo.Entity.Student;
import org.codehaus.plexus.component.annotations.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {

    int deleteByPrimaryKey(byte[] uid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(byte[] uid);

    List<Student> selectByCondition(Student record);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}