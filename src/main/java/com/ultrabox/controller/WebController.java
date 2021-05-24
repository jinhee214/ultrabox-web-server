package com.ultrabox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHelloStr() {
        return "index.html";
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String getWelcomeStr() {
        return "welcome.html";
    }

}
