package fr.training.spring.library.domaine;

import javax.persistence.*;


public class Book {


   private Long id;


   private String isbn;


   private String title;


    private int numberOfPage;


   private String author;


    private LiteraryGenre literaryGenre;

    private Book(){}

    public Book(String isbn, String title, int numberOfPage, String author, LiteraryGenre literaryGenre) {
        this.isbn = isbn;
        this.title = title;
        this.numberOfPage = numberOfPage;
        this.author = author;
        this.literaryGenre = literaryGenre;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public LiteraryGenre getLiteraryGenre() {
        return literaryGenre;
    }
}
