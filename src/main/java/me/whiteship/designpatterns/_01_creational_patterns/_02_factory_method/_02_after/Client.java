package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteshipFactory(), "whiteship", "kwonmo@mail.com");
        client.print(new BlackshipFactory(), "blackship", "kwonmo@mail.com");
    }

    // 변화하는 ship에 대하여 인터페이스를 받도록하여 client코드의 일부를 변경하지 않아도 되도록 처리 가능
    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
