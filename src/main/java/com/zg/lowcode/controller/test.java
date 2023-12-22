package com.zg.lowcode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("/tt")
    public String tt() {
        return "hello121231233";
    }
}
