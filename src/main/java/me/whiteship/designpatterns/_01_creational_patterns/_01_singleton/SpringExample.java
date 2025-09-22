package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {

    public static void main(String[] args) {
        // 싱글톤 적용 되어 있음(등록한 bean을 꺼낼 때 항상 같은 타입의 bean을 꺼내준다.)
        // 싱글톤 패턴이라기보단 싱글톤scope이라고 일컷는다.
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello = applicationContext.getBean("hello", String.class);
        String hello2 = applicationContext.getBean("hello", String.class);
        System.out.println(hello == hello2);
    }

}
