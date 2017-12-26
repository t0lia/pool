package com.t0lia.design_pattern.II_structural.flyweight;

public class Book implements Flyweight {
    private final String title;
    private final String author;
    private final String isbn;
    private final int pageCount;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPageCount() {
        return pageCount;
    }

    public Book(String title, String author, String isbn, int pageCount) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pageCount = pageCount;
    }
}
