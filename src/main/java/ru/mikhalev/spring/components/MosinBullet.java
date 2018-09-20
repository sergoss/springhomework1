package ru.mikhalev.spring.components;

import org.springframework.stereotype.Component;

@Component
public class MosinBullet implements Bullet {
    @Override
    public void doCharging() {
        System.out.println("One shot 7.62mm");
    }
}
