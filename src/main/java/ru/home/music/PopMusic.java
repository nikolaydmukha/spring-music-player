package ru.home.music;

import ru.home.model.Genre;
import ru.home.model.Song;

import java.util.ArrayList;
import java.util.List;

public class PopMusic implements Music {

    private List<Song> songs = new ArrayList<>();

    public List<Song> getSongs() {
        return songs;
    }

    @Override
    public void addSong(Genre genre, String name) {
        this.songs.add(new Song(genre, name));
    }

    @Override
    public void playSong() {
        System.out.println("Playing pop song: The business");
    }
}
