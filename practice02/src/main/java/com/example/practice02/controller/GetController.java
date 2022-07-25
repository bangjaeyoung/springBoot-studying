package com.example.practice02.controller;

import com.example.practice02.dto.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // http://localhost:8080/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/get") // http://localhost:8080/api/get
    public String getController() {

        return "Hi, it's me.";
    }

    @GetMapping("/get_parameter") // http://localhost:8080/api/get_parameter?name=bang&number=09
    public String getParam(@RequestParam String name, @RequestParam(name = "number") String num) {

        System.out.println(name);
        System.out.println(num);

        return name + num;
    }

    @GetMapping("/get_multi_param") // http://localhost:8080/api/get_multi_parameter?id=bang&password=091&number=09
    public SearchParam getMultiParam(SearchParam searchParam) {

        System.out.println(searchParam.getId());
        System.out.println(searchParam.getPassword());
        System.out.println(searchParam.getNumber());

        return searchParam;
    }
}
