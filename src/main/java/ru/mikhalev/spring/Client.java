package ru.mikhalev.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.mikhalev.spring.components.Rifle;

public class Client {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
//
//        Rifle mosinRifle = context.getBean("mosinRifle", Rifle.class);
//        mosinRifle.doShot();
//        context.close();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MosinRifleConfig.class);

        Rifle mosinRifle = context.getBean("mosinRifle", Rifle.class);
        mosinRifle.doShot();

        context.close();
    }
}
