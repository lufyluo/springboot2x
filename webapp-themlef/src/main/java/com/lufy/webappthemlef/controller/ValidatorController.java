package com.lufy.webappthemlef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vali")
public class ValidatorController {
    @GetMapping("page")
    public String page(){
        return "vali/page";
    }
}
