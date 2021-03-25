package ru.home;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.home.model.Genre;
import ru.home.model.Song;
import ru.home.music.ClassicalMusic;
import ru.home.music.PopMusic;
import ru.home.music.RockMusic;
import ru.home.musicPlayer.MusicPlayer;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.home");

        final PopMusic popMusic = context.getBean("popMusic", PopMusic.class);
        final ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        final RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);

        addPopSong(popMusic);
        addClassicalSong(classicalMusic);
        addRockSong(rockMusic);


        List<List<Song>> playList = Arrays.asList(popMusic.getSongs(), classicalMusic.getSongs(), rockMusic.getSongs());

        MusicPlayer musicPlayer = new MusicPlayer(playList);
        musicPlayer.play();

    }

    private static void addPopSong(PopMusic popMusic) {
        popMusic.addSong(Genre.POP_MUSIC, "The business");
        popMusic.addSong(Genre.POP_MUSIC, "Let`s go");
    }

    private static void addRockSong(RockMusic rockMusic) {
        rockMusic.addSong(Genre.ROCK_MUSIC, "Californication");
        rockMusic.addSong(Genre.ROCK_MUSIC, "Scar tissue");
    }

    private static void addClassicalSong(ClassicalMusic classicalMusic) {
        classicalMusic.addSong(Genre.CLASSICAL_MUSIC, "Moon sonata");
        classicalMusic.addSong(Genre.CLASSICAL_MUSIC, "Bee");
    }
}
