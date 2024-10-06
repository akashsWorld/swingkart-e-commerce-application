package com.swingkart.address.service.impl;


import com.swingkart.address.entity.AddressEntity;
import com.swingkart.address.repository.AddressRepository;
import com.swingkart.address.service.AddressDTOService;
import com.swingkart.address.service.AddressService;
import com.swingkart.common.dtos.request.RegisterAddressRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    private final AddressDTOService addressDTOService;


    @Override
    public void registerAddress(RegisterAddressRequest registerAddressRequest) {
        AddressEntity address = addressDTOService.getAddressEntity(registerAddressRequest);
        addressRepository.save(address);
    }
}
