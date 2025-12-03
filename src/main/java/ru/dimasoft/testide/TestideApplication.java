package ru.dimasoft.testide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestideApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestideApplication.class, args);
        System.out.println("первое приложение в idea 25");
        System.out.println("Второй коммит из Git");
    }
}