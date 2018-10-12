package com.luo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RequestTestController
 * @Description TODO
 * @Author luoyan
 * @Date 2018/9/28 下午3:01
 * @Version 1.0
 **/

@RestController
@RequestMapping("api/RequestTest")
public class RequestTestController {

    @GetMapping()
    public String TestString(){
        return "this is test";
    }
}
