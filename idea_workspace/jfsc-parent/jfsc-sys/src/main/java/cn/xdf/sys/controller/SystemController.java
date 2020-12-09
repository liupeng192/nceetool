package cn.xdf.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liupeng
 * @date 2020/12/9-14:14
 **/
@Controller
@RequestMapping("/sys")
public class SystemController {
    @RequestMapping("view")
    public String sysView(){
        return "loginView";
    }
}
