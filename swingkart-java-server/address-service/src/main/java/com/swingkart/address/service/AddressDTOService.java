package com.swingkart.address.service;


import com.swingkart.address.entity.AddressEntity;
import com.swingkart.common.dtos.request.RegisterAddressRequest;

public interface AddressDTOService {

    AddressEntity getAddressEntity(RegisterAddressRequest registerAddressRequest);
}
