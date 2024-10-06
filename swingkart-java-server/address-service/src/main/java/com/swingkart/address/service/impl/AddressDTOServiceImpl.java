package com.swingkart.address.service.impl;

import com.swingkart.address.entity.AddressEntity;
import com.swingkart.address.service.AddressDTOService;
import com.swingkart.common.dtos.request.RegisterAddressRequest;
import org.springframework.stereotype.Service;

@Service
public class AddressDTOServiceImpl implements AddressDTOService {
    @Override
    public AddressEntity getAddressEntity(RegisterAddressRequest registerAddressRequest) {
        return AddressEntity.builder()
                .ownerId(registerAddressRequest.ownerId())
                .houseNumber(registerAddressRequest.houseNumber())
                .street(registerAddressRequest.street())
                .city(registerAddressRequest.city())
                .state(registerAddressRequest.state())
                .postalCode(registerAddressRequest.postalCode())
                .landmark(registerAddressRequest.landmark())
                .phoneNumber(registerAddressRequest.phoneNumber())
                .alternatePhoneNumber(registerAddressRequest.alternatePhoneNumber())
                .build();
    }
}
