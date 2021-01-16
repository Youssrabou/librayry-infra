package fr.training.spring.library.exposition;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DirectorDto {

    @JsonProperty
    final String surname;
    @JsonProperty
    final String name;



    public DirectorDto(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }
}
