package com.kob.backend.controller.pk;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pk/")
public class returnInfo {

    @RequestMapping("index")
    public String index1() {
        return "ERROR : the url should end with '/'";
    }
}