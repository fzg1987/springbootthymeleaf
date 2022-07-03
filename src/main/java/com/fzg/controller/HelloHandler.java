package com.fzg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
}
