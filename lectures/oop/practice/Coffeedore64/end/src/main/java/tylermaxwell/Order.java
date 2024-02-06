package lectures.oop.practice.Coffeedore64.end.src.main.java.tylermaxwell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {

    private String name;
    private boolean ready;
    private ArrayList<Item> items;


    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<>();
    }


    public Order(String name) {
        this();
        this.name = name;
    }


    public void addItem(Item... itemArr){
        List<Item> newItems = Arrays.asList(itemArr);
        this.items.addAll(newItems);
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        double total = 0.0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.println(String.format("Customer Name: %s", this.name));
        for( Item item: this.items){
            System.out.println(String.format("%s - $%.2f", item.getName(), item.getPrice()));
        }
        System.out.println(String.format("Total: $%.2f", this.getOrderTotal()));

    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return this.ready;
    }

    public boolean getReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", ready='" + isReady() + "'" +
            ", items='" + getItems() + "'" +
            "}";
    }




    
}
