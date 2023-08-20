package com.kob.backend.controller.pk;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/pk/")
public class returnInfo {

    @RequestMapping("index")
public String index1() {
    return "ERROR : the url should end with '/'";
}

    @RequestMapping("info/")
    public Map<String, String> getInfo() {
        Map<String, String> mp = new HashMap<>();
        mp.put("姓名", "钟永龙");
        mp.put("身高", "175cm");
        mp.put("性别","男");
        mp.put("学校", "湖南大学");
        mp.put("mail", "zhongyl@hnu.edu.cn");
        return mp;
    }
}