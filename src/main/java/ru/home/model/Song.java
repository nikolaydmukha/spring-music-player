package ru.home.model;

public class Song {
    private String name;
    private Genre genre;

    public Song(Genre genre, String name) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }
}
