package com.bababadboy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wangxiaobin
 */

@Controller
public class HelloController {

    @RequestMapping(value = "/hello",produces = "text/html")
    public String hello(ModelMap map){
        map.addAttribute("name","Wangxiaobin");
        return "hello";
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

}
