package com.t0lia.design_pattern.II_structural.bridge.abstraction.movie;

public class Movie {
    private final String id;
    private final String title;
    private final String director;
    private final String releaseDate;
    private final int runningTime;

    public Movie(String id, String title, String director, String releaseDate, int runningTime) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.runningTime = runningTime;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getRunningTime() {
        return runningTime;
    }
}
