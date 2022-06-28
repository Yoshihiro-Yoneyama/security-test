package com.designtest.webserver.presentation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MapController {

    @GetMapping("api/map")
    public String get (){
        Map<String, String> map1 = new HashMap<>();
        map1.put("cat", "mike");
        map1.put("cat", "tom");
        return map1.get("cat");


//        map.put("犬", "伸之助"); // → "犬" に "伸之助" を対応付ける

//        String name = map.put("猫", "ニャジラ"); // → このMapの"猫"に対応付けられたものを"ニャジラ"に変える
//        System.out.println(name); // → "マイケル"、入れ替える前の値
    }
}
