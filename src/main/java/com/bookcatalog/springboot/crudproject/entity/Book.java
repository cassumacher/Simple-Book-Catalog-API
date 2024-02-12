package com.bookcatalog.springboot.crudproject.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "bookid")
    private int bookId;

    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "summary")
    private String summary;
    @Column(name = "year_of_publication")
    private Integer yearOfPublication; //Year of Publication

    @Column(name = "genre")
    private String genre;

    public Book(int bookId, String title, String author, String summary, Integer yearOfPublication, String genre) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.summary = summary;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
    }

    public Book() {

    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int bookId;
//    private String title;
//
//    public Book(int bookId, String title, Author author, Genre genre, String summary, int yearOfPublication) {
//        this.bookId = bookId;
//        this.title = title;
//        this.author = author;
//        this.genre = genre;
//        this.summary = summary;
//        this.yearOfPublication = yearOfPublication;
//    }
//
//    @ManyToOne(cascade=CascadeType.ALL)
//    @JoinColumn(name = "authorID")
//    private Author author;
//
//    @ManyToOne(cascade=CascadeType.ALL)
//    @JoinColumn(name = "genreID")
//    private Genre genre;
//
//    private String summary;
//    private int yearOfPublication;
//
//    public Book() {
//
//    }
//
//    public int getBookId() {
//        return bookId;
//    }
//
//    public void setBookId(int bookId) {
//        this.bookId = bookId;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }
//
//    public Genre getGenre() {
//        return genre;
//    }
//
//    public void setGenre(Genre genre) {
//        this.genre = genre;
//    }
//
//    public String getSummary() {
//        return summary;
//    }
//
//    public void setSummary(String summary) {
//        this.summary = summary;
//    }
//
//    public int getYearOfPublication() {
//        return yearOfPublication;
//    }
//
//    public void setYearOfPublication(int yearOfPublication) {
//        this.yearOfPublication = yearOfPublication;
//    }
}
