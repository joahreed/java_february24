package lectures.oop.practice.Coffeedore64.end.src.main.java.tylermaxwell;

import java.util.ArrayList;

public class CoffeeKiosk {

    private ArrayList<Item> menu;
    private ArrayList<Order> orders;


    public CoffeeKiosk() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }


    public void addMenuItem(String name, double price){
        Item item = new Item(name, price);
        this.menu.add(item);
        int index = this.menu.indexOf(item);
        item.setIndex(index);

    }

    public void displayMenu(){
        for(Item item : this.menu){
            System.out.println(String.format("%d %s -- $%.2f", item.getIndex(), item.getName(), item.getPrice()));
        }
    }

    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        Order order = new Order(name);
        // Show the user the menu, so they can choose items to add.
        displayMenu();

        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            
            // Get the item object from the menu, and add the item to the order
            Item item = menu.get(Integer.parseInt(itemNumber));
            order.addItem(item);
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details 

        order.display();

    }



    // getters setters


    public ArrayList<Item> getMenu() {
        return this.menu;
    }

    public void setMenu(ArrayList<Item> menu) {
        this.menu = menu;
    }

    public ArrayList<Order> getOrders() {
        return this.orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }


    @Override
    public String toString() {
        return "{" +
            " menu='" + getMenu() + "'" +
            ", orders='" + getOrders() + "'" +
            "}";
    }



    
}
