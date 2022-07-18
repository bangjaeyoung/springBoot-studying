package com.example.delete.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account) {

        System.out.println(userId);
        System.out.println(account);

        // delete -> 리소스 삭제, 이미 리소스가 없는 상태이더라도 error가 아닌 '200' OK를 항상 리턴한다.
    }
}
