package com.xue.springlearning.controller;

import com.xue.springlearning.dao.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(Model model) {

        Person single=new Person("aa",11);
        List<Person> people=new ArrayList<Person>();
        Person p1=new Person("xx",11);
        Person p2=new Person("yy",22);
        Person p3=new Person("zz",33);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("SinglePerson",single);
        model.addAttribute("people",people);

        return "index";

    }

    @RequestMapping(value = "/greeting")
    public ModelAndView test(ModelAndView mv) {
        mv.setViewName("/greeting");
        mv.addObject("title","欢迎使用Thymeleaf!");
        return mv;
    }
}




