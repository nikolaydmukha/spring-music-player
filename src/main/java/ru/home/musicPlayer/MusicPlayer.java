package ru.home.musicPlayer;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.home.model.Genre;
import ru.home.model.Song;
import ru.home.music.Music;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;
    private Music music3;
    private int volume;

    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("popMusic") Music music2, @Qualifier("rockMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
        this.volume = 30;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void play(Genre genre) {
        Random random = new Random();
        switch (genre) {
            case CLASSICAL_MUSIC:
                playSong(music1.getSongs().get(random.nextInt((music1.getSongs().size() - 0) + 0)));
                break;
            case POP_MUSIC:
                playSong(music2.getSongs().get(random.nextInt((music2.getSongs().size() - 0) + 0)));
                break;
            case ROCK_MUSIC:
                playSong(music3.getSongs().get(random.nextInt((music3.getSongs().size() - 0) + 0)));
                break;
        }
    }

    private void playSong(Song song) {
        try {
            Thread.sleep(1000);
            System.out.println("Playing song: genre " + song.getGenre() + " name " + song.getName());
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
