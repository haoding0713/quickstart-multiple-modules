package com.yixin.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HelloWorldController {

    public static final int DEFAULT_SPITTLES_PER_PAGE = 25;

    @RequestMapping({"/","/index"})
    public String index(Map<String, Object> model) {

        return "index";
    }
}
