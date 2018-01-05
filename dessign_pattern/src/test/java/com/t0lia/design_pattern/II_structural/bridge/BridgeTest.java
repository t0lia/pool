package com.t0lia.design_pattern.II_structural.bridge;

import com.t0lia.design_pattern.II_structural.bridge.abstraction.Printer;
import com.t0lia.design_pattern.II_structural.bridge.abstraction.book.Book;
import com.t0lia.design_pattern.II_structural.bridge.abstraction.book.BookPrinter;
import com.t0lia.design_pattern.II_structural.bridge.abstraction.movie.Movie;
import com.t0lia.design_pattern.II_structural.bridge.abstraction.movie.MoviePrinter;
import com.t0lia.design_pattern.II_structural.bridge.implementation.JsonFormatter;
import com.t0lia.design_pattern.II_structural.bridge.implementation.XmlFormatter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class BridgeTest {
    private List<Book> books;
    private List<Movie> movies;


    @BeforeMethod
    public void setUp() throws Exception {
        books = Arrays.asList(
                new Book("bk101", "Gambardella, Matthew", "XML Developer's Guide", "2000-10-01", "An in-depth look at creating applications with XML."),
                new Book("bk102", "Ralls, Kim", "Midnight Rain", "2000-12-16", "A former architect battles corporate zombies, an evil sorceress, and her own childhood to become queen of the world."),
                new Book("bk103", "Corets, Eva", "Maeve Ascendant", " 2000-11-17 ", "After the collapse of a nanotechnology society in England, the young survivors lay the foundation for a new society."),
                new Book("bk104", "Corets, Eva", "Oberon's Legacy", " 2001-03-10", " In post-apocalypse England, the mysterious agent known only as Oberon helps to create a new life for the inhabitants of London. Sequel to Maeve Ascendant."),
                new Book("bk105", "Corets, Eva", "The Sundered Grail", "2001-09-10", "The two daughters of Maeve, half-sisters, battle one another for control of England. Sequel to Oberon's Legacy.")
        );
        movies = Arrays.asList(
                new Movie("tt0112384", "Apollo 13", " Ron Howard", "1995-06-30", 140),
                new Movie("tt0307479", "Solaris", "Steven Soderbergh", "2002-11-27", 99),
                new Movie("tt1731141", "Ender's Game", " Gavin Hood", "2013-11-01", 114),
                new Movie("tt0816692", "Interstellar", " Christopher Nolan", "2014-11-07", 169),
                new Movie("tt3659388", " The Martian", " Ridley Scott", "2015-10-02", 144)
        );
    }

    @DataProvider(name = "BookPrinters")
    public static Object[][] BookPrinters() {
        return new Object[][]{
                {new BookPrinter(new XmlFormatter())},
                {new BookPrinter(new JsonFormatter())},
        };
    }

    @Test(dataProvider = "BookPrinters")
    public void testBridgeI(Printer<Book> printer) {
        books.stream().map(printer::print).forEach(System.out::println);
    }

    @DataProvider(name = "MoviePrinters")
    public static Object[][] MoviePrinters() {
        return new Object[][]{
                {new MoviePrinter(new XmlFormatter())},
                {new MoviePrinter(new JsonFormatter())},
        };
    }

    @Test(dataProvider = "MoviePrinters")
    public void testBridgeII(Printer<Movie> printer) {
        movies.stream().map(printer::print).forEach(System.out::println);
    }
}