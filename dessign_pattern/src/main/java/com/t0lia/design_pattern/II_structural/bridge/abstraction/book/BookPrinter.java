package com.t0lia.design_pattern.II_structural.bridge.abstraction.book;

import com.t0lia.design_pattern.II_structural.bridge.abstraction.Formatter;
import com.t0lia.design_pattern.II_structural.bridge.abstraction.Printer;

import java.util.Map;

public class BookPrinter extends Printer<Book> {

    public BookPrinter(Formatter formatter) {
        super(formatter);
    }

    @Override
    public String print(Book book) {
        Map<String, String> details = Map.of(
                "title", book.getTitle(),
                "author", book.getAuthor(),
                "description", book.getDescription(),
                "publish date", book.getPublishDate()
        );
        return formatter.format("book", book.getId(), details);
    }
}
