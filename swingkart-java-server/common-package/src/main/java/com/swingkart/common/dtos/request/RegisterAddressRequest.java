package com.swingkart.common.dtos.request;

import org.hibernate.validator.constraints.Length;

public record RegisterAddressRequest (
        String ownerId,
        @Length(min = 1, max = 50) String houseNumber,
        @Length(min = 1, max = 50) String street,
        @Length(min = 1, max = 50) String city,
        @Length(min = 1, max = 50) String state,
        @Length(min = 1, max = 50) String postalCode,
        @Length(min = 1, max = 50) String landmark,
        @Length(min = 10, max = 10) String phoneNumber,
        @Length(min = 10, max = 10) String alternatePhoneNumber
){
}
