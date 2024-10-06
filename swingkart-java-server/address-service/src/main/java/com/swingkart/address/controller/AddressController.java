package com.swingkart.address.controller;


import com.swingkart.address.service.AddressService;
import com.swingkart.common.dtos.request.RegisterAddressRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/address")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void registerAddress(@RequestBody RegisterAddressRequest
                                registerAddressRequest) {
        addressService.registerAddress(registerAddressRequest);
    }

}
