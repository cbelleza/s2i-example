package com.s2i;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "Hello World";
    }
}