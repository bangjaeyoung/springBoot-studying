package com.example.practice.controller;

import com.example.practice.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")     //  http://localhost:8080/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/get_method")   //  http://localhost:8080/api/get_method
    public String getRequest() {
        return "Hi getMethod";

    }

    @GetMapping("/get_parameter")   // http://localhost:8080/api/get_parameter?id=1234&password=abcd
    public String getParamter(@RequestParam String id, @RequestParam(name = "password") String pass) {
        String password = "abcd";

        System.out.println("id : " + id);
        System.out.println("pass : " + pass);

        return id + pass;
    }

    @GetMapping("/get_multi_parameter")     //  http://localhost:8080/api/get_multi_parameter?account=abcd&email=abcd@gmail.com&page=10
    public SearchParam getMultiParameter(SearchParam searchParam) {
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        return searchParam;
    }
}
