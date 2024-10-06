package com.swingkart.address.entity;


import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class AddressEntity {
    @Id
    private String id;
    @Field
    private String ownerId;
    @Field
    @Length(min = 1, max = 50)
    private String houseNumber;
    @Field
    @Length(min = 1, max = 50)
    private String street;
    @Field
    @Length(min = 1, max = 50)
    private String city;
    @Field
    @Length(min = 1, max = 50)
    private String state;
    @Field
    @Length(min = 1, max = 50)
    private String postalCode;
    @Field
    @Length(min = 1, max = 50)
    private String landmark;
    @Field
    @Length(min = 10,max = 10)
    private String phoneNumber;
    @Field
    @Length(min = 10, max = 10)
    private String alternatePhoneNumber;
}
