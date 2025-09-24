package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    // java 8버전은 못 쓰니까 추상클래스로 구현로직을 옮겨야할 수도 있음
    void sendEmailTo(String email, Ship ship);

    Ship createShip();

    // 자바9에서는 인터페이스에 private를 쓸 수 있다
    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

}
