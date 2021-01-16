package fr.training.spring.library.infra;

import fr.training.spring.library.domaine.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "BOOK")
public class BookJPA {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "TITLE")
    private String title;


    @Column(name = "NUMBER_OF_PAGE")
    private int numberOfPage;

    @Column(name = "AUTHOR")
    private String author;


    @Enumerated(EnumType.STRING)
    @Column(name = "LITERARY_GENRE")
    private LiteraryGenre literaryGenre;

    public BookJPA(String s, String don_quixote, int i, String victor, LiteraryGenre tragedy) {

    }

    public BookJPA(final Book book) {
        isbn = book.getIsbn();
        title = book.getTitle();
        numberOfPage = book.getNumberOfPage();
        author = book.getAuthor();

        literaryGenre = book.getLiteraryGenre();
    }


    public Long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public LiteraryGenre getLiteraryGenre() {
        return literaryGenre;
    }
}


