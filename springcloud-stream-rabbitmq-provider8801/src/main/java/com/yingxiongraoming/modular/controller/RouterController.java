 package com.yingxiongraoming.modular.controller;

 /**
 * @author ndcadmin
 * @date 2021/01/12
 */

//import com.sylinx.model.LoginUser;
//import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouterController {


    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }


}
