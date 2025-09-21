package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.io.*;

public class App {

    public static void main(String[] args) {
        Settings1 settings = Settings1.getInstance();
        Settings1 settings1 = Settings1.getInstance();

        System.out.println(settings == settings1);
    }

}
