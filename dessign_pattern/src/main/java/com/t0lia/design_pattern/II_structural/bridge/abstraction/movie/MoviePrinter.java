package com.t0lia.design_pattern.II_structural.bridge.abstraction.movie;


import com.t0lia.design_pattern.II_structural.bridge.abstraction.Formatter;
import com.t0lia.design_pattern.II_structural.bridge.abstraction.Printer;

import java.util.Map;

public class MoviePrinter extends Printer<Movie> {

    public MoviePrinter(Formatter formatter) {
        super(formatter);
    }

    @Override
    public String print(Movie movie) {
        Map<String, String> details = Map.of(
                "title", movie.getTitle(),
                "director", movie.getDirector(),
                "running time", Integer.toString(movie.getRunningTime()),
                "release date", movie.getReleaseDate()
        );
        return formatter.format("movie", movie.getId(), details);
    }
}
