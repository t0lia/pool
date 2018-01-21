package com.t0lia.design_pattern.II_structural.flyweight;

import java.util.Map;
import java.util.Optional;

import static java.util.Arrays.stream;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

public class Library {
    private final Map<String, Book> pool;

    Library(Book... books) {
        pool = stream(books).collect(toMap(Book::getTitle, identity()));
    }

    public Optional<Book> getByTitle(String title) {
        return Optional.ofNullable(pool.get(title));
    }

}
