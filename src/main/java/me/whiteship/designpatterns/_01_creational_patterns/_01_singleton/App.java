package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.io.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 기존 방식으로 싱글톤 인스턴스 가져오기
        Settings4 settings = Settings4.getInstance();

        // 리플렉션을 사용하여 private 생성자에 접근
        Constructor<Settings4> constructor = Settings4.class.getDeclaredConstructor();
        constructor.setAccessible(true); // private 접근 제한 무시 설정

        // private 생성자를 통해 새로운 인스턴스 강제 생성
        Settings4 settings1 = constructor.newInstance();

        // 두 인스턴스가 다른 객체인지 확인 (결과: false)
        System.out.println(settings == settings1);
    }
}
