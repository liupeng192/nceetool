package cn.xdf.fixed.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liupeng
 * @date 2021/3/16-14:01
 **/
@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("view")
    public String toLogin(){
        return "login";
    }
}
