package lectures.oop.practice.OrdersItems.end.src.main.java.tylermaxwell;

import java.util.ArrayList;

import lectures.oop.practice.OrdersItems.end.src.main.java.tylermaxwell.utils.Item;
import lectures.oop.practice.OrdersItems.end.src.main.java.tylermaxwell.utils.Order;

public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 3.25;
        
        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 3.50;
        
        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2.50;
        
        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price = 1.50;
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";

        
        Order order2 = new Order();
        order2.name = "Jimmy";
        
        Order order3 = new Order();
        order3.name = "Noah";
        
        Order order4 = new Order();
        order4.name = "Sam";
        
        // what will happen?
        System.out.println(order1.total);

        // Add item1 to order2's item list and increment the order's total.
        order2.items.add(item1);
        order2.total += item1.price;
        System.out.println(order2.items);
        System.out.println(order2.total);

        // Noah ordered a cappuccino. Add the cappuccino to their order list and to their tab.
        order3.items.add(item4);
        order3.total += item4.price;
        System.out.println(order3.items);
        System.out.println(order3.total);
        
        // Sam added a latte. Update the order accordingly.
        order4.items.add(item2);
        order4.total += item2.price;
        System.out.println(order4.items);
        System.out.println(order4.total);


        // Cindhuri’s order is now ready. Update her status.


        
        // Sam ordered more drinks - 2 lattes. Update their order as well.

        // Jimmy’s order is now ready. Update his status.



        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}

