package com.example.practice02.dto;

public class SearchParam {

    private String id;
    private String password;
    private String number;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "SearchParam{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", number=" + number +
                '}';
    }
}
