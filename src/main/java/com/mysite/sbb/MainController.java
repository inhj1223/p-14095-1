package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/s")
    public void index(){
        System.out.println("index");
    }

    @GetMapping("/hello")
    public void hello(){
        System.out.println("hello() 메서드 호출됨!");
    }
}
