package com.course.labs.lab1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created on 10/20/17.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/")
    public @ResponseBody String getHello() {
        return "hello";
    }

    @GetMapping("/{name}")
    public String getHelloWithName(Map<String, String> model, @PathVariable String name) {
        model.put("name", name);
        return "hello";
    }
}
