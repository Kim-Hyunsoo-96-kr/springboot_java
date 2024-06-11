package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/** @RestController의 역할
 * 어노테이션이 붙은 클래스를 API의 진입 지점으로 만들어준다.
 *
 * @GetMapping("/add")의 역할
 * HTTP Method GET을 사용하고, path로 "/add"를 사용하겠다는 뜻
 *
 * @RequestParam의 역할
 * 쿼리로 들어오는 정보를 사용하겠다는 뜻
 *
 * DTO(Data Transfer Object)의 사용 이유?
 *
 * @RequestBody의 역할
 * HTTP Body에 있는 JSON을 해당 객체로 파싱해주는 역할
 * */
@RestController
public class CalculatorController {
    @GetMapping("/add") // GET /add
    public int addTwoNumbers(CalculatorAddRequest request){
        return request.getNumber1() + request.getNumber2();
    }

    @PostMapping("/multiply") // POST /multiply
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request){
        return request.getNumber1() * request.getNumber2();
    }
}
