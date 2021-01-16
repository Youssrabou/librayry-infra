package fr.training.spring.library.exposition;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressDto {

    @JsonProperty
    final int number;
    @JsonProperty
    final String street;
    @JsonProperty
    final int postalCode;
    @JsonProperty
    final String city;




    public AddressDto(int number, String street, int postalCode, String city) {
        this.number = number;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
    }
}

