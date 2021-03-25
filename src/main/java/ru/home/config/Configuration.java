package ru.home.config;

import org.springframework.context.annotation.Bean;
import ru.home.music.ClassicalMusic;
import ru.home.music.PopMusic;
import ru.home.music.RockMusic;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

}
