package fr.training.spring.library.exposition;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.training.spring.library.domaine.LiteraryGenre;

public class BookDto {

    @JsonProperty
    final String isbn;
    @JsonProperty
    final String title;
    @JsonProperty
    final String author;
    @JsonProperty
    final int numberOfPage;
    @JsonProperty
    final LiteraryGenre literaryGenre;



    public BookDto(String isbn, String title, String author, int numberOfPage, LiteraryGenre literaryGenre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.numberOfPage = numberOfPage;
        this.literaryGenre = literaryGenre;
    }
}
