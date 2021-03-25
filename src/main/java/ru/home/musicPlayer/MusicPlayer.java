package ru.home.musicPlayer;

import ru.home.model.Song;

import java.util.List;

public class MusicPlayer {

    private List<List<Song>> musicList;
    private int volume;

    public MusicPlayer(List<List<Song>> musicList) {
        this.musicList = musicList;
        volume = 30;
    }

    public List<List<Song>> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<List<Song>> musicList) {
        this.musicList = musicList;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void play() {
        for (List<Song> genres : musicList) {
            for (Song song : genres) {
                try {
                    Thread.sleep(3000);
                    playSong(song);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    private void playSong(Song song) {
        System.out.println("Playing song: genre " + song.getGenre() + " name " + song.getName());
    }
}
