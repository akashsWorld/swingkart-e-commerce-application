package com.swingkart.common.dtos.request;


import jakarta.validation.constraints.Email;
import org.hibernate.validator.constraints.Length;

public record RegisterUserRequest(
        @Email
        String email,
        @Length(min = 1, max = 10)
        String countryCode,
        String phoneNumber,
        @Length(min = 8, max = 15)
        String password
) {
}
