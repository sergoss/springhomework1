package ru.mikhalev.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.mikhalev.spring.components.Bullet;
import ru.mikhalev.spring.components.MosinBullet;
import ru.mikhalev.spring.components.MosinRifle;
import ru.mikhalev.spring.components.Rifle;

@Configuration
@ComponentScan("ru.mikhalev.spring.components")
public class MosinRifleConfig {
    @Bean(name = "bullet")
    public Bullet bullet() {
        return new MosinBullet();
    }
    @Bean(name = "mosinRifle")
    public Rifle mosinRifle(Bullet mosinBullet) {
        Rifle rifle = new MosinRifle();
        ((MosinRifle) rifle).setMosinBullet(mosinBullet);
        return rifle;
    }
}
