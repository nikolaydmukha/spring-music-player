package ru.home.music;

import ru.home.model.Genre;

public interface Music {

    public void playSong();

    public void addSong(Genre genre, String name);

}
