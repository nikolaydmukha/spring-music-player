package ru.home.musicPlayer;

import org.springframework.stereotype.Component;
import ru.home.model.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private List<List<Song>> playList;
    private int volume;

//    public MusicPlayer(List<List<Song>> musicList) {
//        this.musicList = musicList;
//        volume = 30;
//    }

    public List<List<Song>> getPlayList() {
        return playList;
    }

    public void setPlayList(List<List<Song>> playList) {
        this.playList = playList;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void play() {
        for (List<Song> genres : playList) {
            for (Song song : genres) {
                playSong(song);
            }
        }
    }

    public void playShuffle() {
        List<Song> allSongs = new ArrayList<>();
        for (List<Song> genres : playList) {
            for (Song song : genres) {
                allSongs.add(song);
            }
        }
        Random random = new Random();
        for (int i = 0; i < allSongs.size(); i++) {
            int randomNum = random.nextInt((allSongs.size() - 0) + 0);
            playSong(allSongs.get(randomNum));
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
