package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {
    private String name;
    private Integer age; // Integer 은 null 가능, int는 null 불가능

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
