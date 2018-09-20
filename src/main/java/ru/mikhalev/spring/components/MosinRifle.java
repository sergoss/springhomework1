package ru.mikhalev.spring.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MosinRifle implements Rifle {
    private Bullet mosinBullet;

    public Bullet getMosinBullet() {
        return mosinBullet;
    }

    @Autowired
    @Qualifier("mosinBullet")
    public void setMosinBullet(Bullet mosinBullet) {
        this.mosinBullet = mosinBullet;
    }

    public MosinRifle() {

    }

    @Override
    public void doShot() {
        mosinBullet.doCharging();
    }
}
