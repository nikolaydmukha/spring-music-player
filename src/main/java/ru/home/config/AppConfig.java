package ru.home.config;

import org.springframework.context.annotation.*;
import ru.home.music.ClassicalMusic;
import ru.home.music.PopMusic;
import ru.home.music.RockMusic;

@Configuration
public class AppConfig {

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
