package com.guppy.web.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by guppy.kang on 2018. 7. 9.
 * email : guppy.kang@kakaocorp.com
 */

@Controller
public class HomeController {

    @GetMapping("/")
    public String home () {
        return "index";
    }

}
