package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.io.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    // serializable을 정의하여 직렬화 역직렬화 가능한 객체로 만든 후 file화 시켜서 생성
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Settings5 settings = Settings5.INSTANCE;

        Settings5 settings1 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings5) in.readObject();
        }

        System.out.println(settings == settings1);
    }

}
