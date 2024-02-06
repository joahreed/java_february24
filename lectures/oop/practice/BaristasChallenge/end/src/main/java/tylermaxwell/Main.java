package lectures.oop.practice.BaristasChallenge.end.src.main.java.tylermaxwell;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
        
        Order cindhuri = new Order("Cindhuri");
        Order sam = new Order("sam");
        Order noah = new Order("noah");

        Item dripCoffee = new Item("drip coffee", 1.5);
        Item cappuccino = new Item("cappuccino", 3.5);
        Item mocha = new Item("mocha", 4.5);
        Item latte = new Item("latte", 5.5);

        cindhuri.addItem(latte);
        cindhuri.addItem(mocha, dripCoffee);

        System.out.println(cindhuri);

        String message = cindhuri.getStatusMessage();
        System.out.println(message);
        System.out.println(cindhuri.getOrderTotal());

        cindhuri.display();




    }
}