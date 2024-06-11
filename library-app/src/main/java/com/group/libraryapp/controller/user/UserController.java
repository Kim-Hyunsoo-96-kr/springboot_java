package com.group.libraryapp.controller.user;

import com.group.libraryapp.domain.user.User;
import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.response.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private final List<User> users = new ArrayList<>();
    @PostMapping("/user")
    public void saveUser(@RequestBody UserCreateRequest request){
        users.add(new User(request.getName(), request.getAge()));
    }

    /** 유저 조회 API spec
     * HTTP Method : GET
     * HTTP Path : /user
     * 쿼리 : 없음
     * res json
     * [{
     *     "id": Long,
     *     "name": String (null 불가능),
     *     "age": Integer
     * }, ...]
     *
     * controller 에서 getter가 있는 인스턴스를 반환하면 json형태가 된다.
     */
    @GetMapping("/user")
    public List<UserResponse> getUsers(){
        List<UserResponse> responses = new ArrayList<>();
        for(int i=0; i< users.size(); i++){
            responses.add(new UserResponse(i+1, users.get(i)));
        }
        return responses;
    }
}

