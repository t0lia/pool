package com.t0lia.design_pattern.II_structural.bridge.abstraction.book;

public class Book {
    private final String id;

    private final String author;
    private final String title;
    private final String publishDate;
    private final String description;

    public Book(String id, String author, String title, String publishDate, String description) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.publishDate = publishDate;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public String getDescription() {
        return description;
    }
}
