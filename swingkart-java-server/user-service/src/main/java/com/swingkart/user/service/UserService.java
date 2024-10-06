package com.swingkart.user.service;


import com.swingkart.common.dtos.request.RegisterUserRequest;

public interface UserService {
    void saveUser(RegisterUserRequest registerUserRequest);
}
