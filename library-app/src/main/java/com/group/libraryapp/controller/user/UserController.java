package com.group.libraryapp.controller.user;

import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.request.UserUpdateRequest;
import com.group.libraryapp.dto.user.response.UserResponse;
import com.group.libraryapp.service.user.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/user")
    public void saveUser(@RequestBody UserCreateRequest request){
        userService.saveUser(request);
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
        return userService.getUser();
    }

    /** 유저 정보 update API spec
     * HTTP Method : PUT
     * HTTP Path : /user
     * HTTP Body (JSON)
     * {
     *     "id": Long,
     *     "name": String
     * }
     * 결과 반환 x (HTTP 상태 200 OK 이면 충분하다)
     */
    @PutMapping("/user")
    public void updateUser(@RequestBody UserUpdateRequest request){
        userService.updateUser(request);
    }

    /** 유저 정보 삭제 API spec
     * HTTP Method : DELETE
     * HTTP Path : /user
     * 쿼리 사용 : 문자열 name(삭제되어야 하는 사용자 이름)
     * 결과 반환x (HTTP 상태 200 OK 이면 충분하다)
     */

    @DeleteMapping("/user")
    public void deleteUser(@RequestParam String name){
        userService.deleteUser(name);
    }

}

