package life.majiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//允许这个类接受前端的请求
public class HelloController {
    @GetMapping("/hello")
    //@RequestParam是请求参数
    public String hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name", name);//把浏览器当中传递过来的值放到model里面
        return "hello";//返回hello的模板，从templates里面寻找

    }
}
