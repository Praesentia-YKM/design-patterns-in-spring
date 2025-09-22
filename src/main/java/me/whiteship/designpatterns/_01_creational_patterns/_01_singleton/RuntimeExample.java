package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

public class RuntimeExample {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime(); // 자바 어플리캐이션이 실행되고 있는 문맥정보(메모리...) -> 싱글톤적용되어있음
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
    }
}
