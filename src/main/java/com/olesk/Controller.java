package com.olesk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private Environment environment;

    @GetMapping(value = "/value", produces = "application/json; charset=UTF-8")
    public String getValue() {
        return "service port " + environment.getProperty("local.server.port");
    }


}
