package com.java.code.study.Helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author zouw
 * @date 20:48 2019/1/2
 */
@Controller
public class HellowodWorldController {

    @RequestMapping(value = "/?/hello.do")
    public String hello() {
        return "success";
    }

    @RequestMapping(value = "/*/hello01.do")
    public String hello01() {
        return "success";
    }

    @RequestMapping(value = "/**/hello02.do")
    public String hello02() {
        return "success";
    }

    @RequestMapping(value = "/hello04/{id}")
    public String hello04(@PathVariable("id") Integer userId) {
        System.out.println("id" + userId);
        return "success";
    }

    @RequestMapping(value = "/hello05")
    public String hello05(@RequestParam(value = "userName", required = false, defaultValue = "zouwei") String name) {
        System.out.println("name:" + name);
        return "success";
    }
    @RequestMapping(value = "/hello06")
    public String hello06(@RequestHeader(value = "Accept-Language") String lange) {
        System.out.println("::"+lange);
        return "success";
    }

}
