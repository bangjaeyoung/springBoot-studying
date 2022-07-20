package com.example.post.controller;

import com.example.post.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")     // http://localhost:8080/api
public class PostApiController {

    @PostMapping("/post")   // http://localhost:8080/api/post
    public void post(@RequestBody Map<String, Object> requestData) {
        requestData.forEach((key, value) -> {
            System.out.println("key : " + key);
            System.out.println("value : " + value);
        });
    }

    @PostMapping("/post02")     // http://localhost:8080/api/post02
    public void post(@RequestBody PostRequestDto requestData) {

        System.out.println(requestData);
    }
}
