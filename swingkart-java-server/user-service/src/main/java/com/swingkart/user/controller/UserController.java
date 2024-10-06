package com.swingkart.user.controller;


import com.swingkart.common.dtos.request.RegisterUserRequest;
import com.swingkart.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void saveUser(@RequestBody RegisterUserRequest registerUserRequest ) {
        userService.saveUser(registerUserRequest);
    }
}
