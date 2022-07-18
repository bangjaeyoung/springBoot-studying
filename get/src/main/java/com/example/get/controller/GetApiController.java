package com.example.get.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")    // http://localhost:9090/api/get/hello로, value 값이 아닌 명시적으로 path 값 지정
    public String getHello() {

        return "get Hello";
    }

    //@RequestMapping("/hi")  // RequestMapping 하면 get / post / put / delete 모든 기능 가능
    @RequestMapping(path = "/hi", method = RequestMethod.GET)   // get 기능만 쓰겠다고 선언, http://localhost:9090/api/get/hi
    public String hi() {

        return "hi";
    }

    @GetMapping("/path-variable/{name}")    // http://localhost:9090/api/get/path-variable/{name}
    public String pathVariable(@PathVariable(name = "name") String pathName) {

        System.out.println("PathVariable : " + pathName);
        return pathName;
    }

    // http://localhost:9090/api/get/query-param?user=bang&email=bang@gmail.com&age=20
    @GetMapping(path = "/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach( entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    @GetMapping("/query-param02")
    public String queryParam02(
            @RequestParam String name,      // 명시적으로 key 값을 RequestParam Annotation을 통해 변수로 지정하고 시작할 수 있다.
            @RequestParam String email,
            @RequestParam int age
    ) {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name + " " + email + " " + age;
    }

    @GetMapping("/query-param03")
    public String queryParam03(UserRequest userRequest) {   // 현업에서 제일 많이 쓰는 방식, UserRequest라는 클래스를 생성해서 객체로 넣어버림

        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}
