package com.fioli.configclent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.tools.ForwardingFileObject;

@SpringBootApplication
@RestController
public class ConfigClentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClentApplication.class, args);
    }

    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/hi")
    public String hi() {
        return foo;
    }

}

