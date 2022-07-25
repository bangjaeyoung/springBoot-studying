package com.example.practice02.controller;

import com.example.practice02.dto.SearchParam;
import org.apache.tomcat.util.http.Parameters;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    //@RequestMapping(method = RequestMethod.POST, path = "/post")
    @PostMapping(value = "/post_method")
    public SearchParam postController(@RequestBody SearchParam searchParam) {

        System.out.println(searchParam.toString());

        return searchParam;
    }
}
