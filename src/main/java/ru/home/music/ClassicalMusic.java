package ru.home.music;

import org.springframework.stereotype.Component;
import ru.home.model.Genre;
import ru.home.model.Song;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private List<Song> songs = new ArrayList<>();

    @Override
    public List<Song> getSongs() {
        return songs;
    }

    @Override
    public void addSong(Genre genre, String name) {
        this.songs.add(new Song(genre, name));
    }

}
