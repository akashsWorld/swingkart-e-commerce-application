package com.swingkart.address.service;


import com.swingkart.common.dtos.request.RegisterAddressRequest;


public interface AddressService {
    void registerAddress(RegisterAddressRequest registerAddressRequest);
}
