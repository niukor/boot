package com.cn.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class BootBuild {

    @Autowired
    private Environment environment;

    private Logger logger = LoggerFactory.getLogger(BootBuild.class);

    public static void main(String[] args) {
        new SpringApplicationBuilder(BootBuild.class).properties("spring.config.location=classpath:/config/application-prod.yml").run(args);
    }

    @GetMapping(value = "hi")
    @ResponseBody
    public String hi(){
        logger.info(environment.getProperty("test.user.name"));
        return environment.getProperty("test.user.name");
    }
}
