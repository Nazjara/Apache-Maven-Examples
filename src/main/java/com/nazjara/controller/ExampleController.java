package com.nazjara.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ExampleController {

    @GetMapping("/")
    public Map<String, Object> getIndex() {
        Map<String, Object> map = new HashMap<>();
        map.put("Hello", "World");
        return map;
    }
}
