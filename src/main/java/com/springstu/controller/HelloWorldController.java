package com.springstu.controller;

import com.springstu.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //@RestController的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了！
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/hello/{name}")
    public String helloName(@PathVariable String name) {
        return "hello "+name;
    }

    /**
     * {"userName":"小明","passWord":"xxxx"}
     * @return
     */
    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setUserName("小明");
        user.setPassWord("xxxx");
        return user;
    }
}
