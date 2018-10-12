package com.luo.Controllers;

import com.luo.Entity.Student;
import com.luo.Service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName StudentController
 * @Description TODO
 * @Author luoyan
 * @Date 2018/9/30 下午5:59
 * @Version 1.0
 **/
@SuppressWarnings("ALL")
@RestController
@RequestMapping("/api/Student")
public class StudentController {

    @Autowired
    private IStudentService service;

    @GetMapping()
    public String Get(){
        List<Student> students = service.selectByCondition(new Student());
        String jsonResult = com.alibaba.fastjson.JSON.toJSONString(students);
        System.out.print("====" + jsonResult + "=====");
        return jsonResult;
//          return "hello ";
    }


}
