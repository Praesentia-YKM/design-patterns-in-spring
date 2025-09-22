package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

/**
 * Enum을 사용해서 싱글톤 만들기
 * 상속을 쓰지 못한다.
 * 직렬화 역직렬화 시 객체 동일성보장
 * lazy initialization이 안된다
 */
public enum Settings5 {

    INSTANCE;

}
