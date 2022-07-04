package com.fzg.controller;

import com.fzg.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/index")
public class HelloHandler {

    @RequestMapping("/hello")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("name","张三");
        return modelAndView;
    }

    @GetMapping("/if")
    public ModelAndView ifTest(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        modelAndView.addObject("test",88);
        return modelAndView;
    }

    @GetMapping("/unless")
    public ModelAndView UnlessTest(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        modelAndView.addObject("score",88);
        return modelAndView;
    }
    @GetMapping("/switch")
    public ModelAndView SwitchTest(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        modelAndView.addObject("studentId",1);
        return modelAndView;
    }

    @GetMapping("/redirect/{url}")
    public String redirect(@PathVariable("url") String url, Model model){
        model.addAttribute("url","/index/login");
        return url;
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(){
        return "login";
    }

    @GetMapping("/each")
    public ModelAndView each(){
        List<User> list = Arrays.asList(
                new User(1,"张三"),
                new User(2,"李四"),
                new User(3,"王五"));
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        modelAndView.addObject("list",list);
        return modelAndView;
    }

    @GetMapping("/value")
    public ModelAndView value(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        modelAndView.addObject("value","Spring Boot");
        return modelAndView;
    }

    @GetMapping("/src")
    public ModelAndView src(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
//        modelAndView.addObject("src","/1.png");
        return modelAndView;
    }

    @GetMapping("/href")
    public ModelAndView href(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test");
        modelAndView.addObject("href","https://www.baidu.com");
        return modelAndView;
    }
}
