package lectures.oop.practice.Coffeedore64.end.src.main.java.tylermaxwell;

public class Main {
    public static void main(String[] args) {
        CoffeeKiosk ck = new CoffeeKiosk();
        ck.addMenuItem("banana", 2.0);
        ck.addMenuItem("coffee", 1.5);
        ck.addMenuItem("latte", 4.5);
        ck.newOrder();
    }
}