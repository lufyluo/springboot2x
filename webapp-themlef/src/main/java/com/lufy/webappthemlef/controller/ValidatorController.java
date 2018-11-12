package com.lufy.webappthemlef.controller;

import com.lufy.webappthemlef.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("vali")
public class ValidatorController {
    @GetMapping("page")
    public String page(){
        return "vali/page";
    }
    @ResponseBody
    @PostMapping("validate")
    public Map<String,Object> validate(@Valid @RequestBody User user, Errors errors){
        Map<String,Object> errmap = new HashMap<>();
        List<ObjectError> oes = errors.getAllErrors();
        for(ObjectError oe:oes){
            String key =null;
            String msg = null;
            if(oe instanceof FieldError){
                key=((FieldError) oe).getField();
            }else {
                key = oe.getObjectName();
            }
            msg = oe.getDefaultMessage();
            errmap.put(key,msg);
        }
        return errmap;
    }
}
