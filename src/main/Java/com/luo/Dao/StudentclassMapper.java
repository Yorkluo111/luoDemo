package com.luo.Dao;

import com.luo.Entity.Student;
import com.luo.Entity.Studentclass;

import java.util.List;

public interface StudentclassMapper {
    int deleteByPrimaryKey(Integer classid);

    int insert(Studentclass record);

    int insertSelective(Studentclass record);

    Studentclass selectByPrimaryKey(Integer classid);

    List<Student> selectByCondition(Student record);

    int updateByPrimaryKeySelective(Studentclass record);

    int updateByPrimaryKey(Studentclass record);
}