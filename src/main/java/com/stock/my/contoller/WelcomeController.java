package com.stock.my.contoller;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    private static ActiveXComponent activeXComponent;
    private static Dispatch dispatch;

    @RequestMapping("/welcome")
    public String welcome() {
        // activeX component name or clsId
        String clsId = "KHOpenAPI.ocx";
        activeXComponent = new ActiveXComponent("KHOpenAPI.ocx");


        return "welcome";
    }
}
