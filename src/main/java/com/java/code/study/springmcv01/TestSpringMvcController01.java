package com.java.code.study.springmcv01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;
@SessionAttributes(value={"user"}, types={String.class})
@Controller
public class TestSpringMvcController01 {

    @RequestMapping("/addUser")
    public String addUser(User user) {
        System.out.println(user);
        return "success";
    }
    @ModelAttribute
    public String testModelAttribute(@RequestParam(value = "id",required = false) Integer id,Map<String,Object> map) {
        System.out.println(id);
        map.put("key1","value1");
        return "success";
    }
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(@RequestParam(value = "user",required = false) User user) {
        ModelAndView modelAndView = new ModelAndView("success");
        modelAndView.addObject("time",new Date());
        return modelAndView;
    }

    @RequestMapping("/testMap")
    public String testModelAndView(Map<String,Object> map) {
        System.out.println("map:"+map.getClass());
        map.put("time",new Date());
        return "success";
    }
    @RequestMapping("/testRedirect")
    public String testRedirect() {
        return "redirect:/index.jsp";
    }

    @RequestMapping("/testBaseType")
    public String testBaseType(Integer id,HttpServletRequest request) {
        return "success";
    }
}
