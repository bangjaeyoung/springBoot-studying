package com.example.practice.controller;

import com.example.practice.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {


    // @RequestMapping(method = RequestMethod.POST, path = "/postMethod")
    @PostMapping(value = "/post_method")
    public SearchParam postMethod(@RequestBody SearchParam searchParam) {
        System.out.println(searchParam.toString());

        return searchParam;
    }

    @PutMapping("/put_method")
    public void put() {

    }

    @PatchMapping("/patch_method")
    public void patch() {

    }


}
