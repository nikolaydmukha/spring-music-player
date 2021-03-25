package ru.home.music;

import ru.home.model.Genre;
import ru.home.model.Song;

import java.util.List;

public interface Music {

    void addSong(Genre genre, String name);

    List<Song> getSongs();

}
