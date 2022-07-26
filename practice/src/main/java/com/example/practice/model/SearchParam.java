package com.example.practice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor // 모든 매개변수를 받는 생성자 생성
public class SearchParam {

    private String account;
    private String email;
    private int page;
}