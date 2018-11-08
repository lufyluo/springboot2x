package com.lufy.webappthemlef.controller;

import com.lufy.webappthemlef.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/{id}")
    public String  getUser(@PathVariable Integer id, Model model) {

        model.addAttribute("user",new User(id,"张三",20,"中国广州"));
        return "/user/detail";
    }
    @RequestMapping("/index")
    public ModelAndView index(ModelAndView mv){
        mv.setViewName("/index");
        mv.addObject("welcome","hi! welcome here 1");
        return mv;
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String  listUser(ModelMap model) {
        List<User> userList = new ArrayList<User>();
        for (int i = 0; i <10; i++) {
            userList.add(new User(i,"张三"+i,20+i,"中国广州"));
        }

        model.put("users", userList);
        return "/user/list";
    }
}
