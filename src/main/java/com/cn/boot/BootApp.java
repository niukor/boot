package com.cn.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class BootApp {
    private Logger logger = LoggerFactory.getLogger(BootApp.class);
    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(BootApp.class, args);
    }

    @GetMapping(value = "/hello")
    @ResponseBody
    public String sayHello(@RequestParam String name){
        logger.info(environment.getProperty("user.name"));
        return "Hello "+ name;
    }
}
