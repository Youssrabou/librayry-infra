package fr.training.spring.library.exposition;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.training.spring.library.domaine.Type;
import java.util.List;

public class LibraryDto {

    @JsonProperty
    final Type type;

    @JsonProperty
    final AddressDto addressDTO;

    @JsonProperty
    final DirectorDto directorDTO;

    @JsonProperty
    final List<BookDto> bookDtoList;


    public LibraryDto(Type type, AddressDto addressDTO, DirectorDto directorDTO, List<BookDto> bookDtoList) {
        this.type = type;
        this.addressDTO = addressDTO;
        this.directorDTO = directorDTO;
        this.bookDtoList = bookDtoList;
    }



}
