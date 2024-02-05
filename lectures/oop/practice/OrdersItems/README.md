# [Orders and Items](https://login.codingdojo.com/m/315/9380/63311)

## Learning Objectives:

- Use another class file to help store data related to the app in a more organized way
- Understand the value of grouping data together in a class to perform similar operations
- Set member variables inside a class file
- Be able to instantiate a new instance of a class (initialize a custom data type)

## code:

```java

import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
    
        // Order variables -- order1, order2 etc.
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}

```

## Steps:

- [ ] Create the [Item]() class with the member variables: 
  -  `String` name 
  -  `double` price
 
- [ ] Create the [Order]() class with the member variables:
  - `String` name
  - `double` total
  - `boolean` ready
  - `ArrayList<Item>` items

- [ ] Create the testing file [TestOrders]() and complete the rest of the tasks inside the testing file.
- [ ] Create 4 item variables of type Item and instantiate each as an Item object. Name them item1, item2, etc.
- [ ] Set the price and the name for each - "mocha", "latte", "drip coffee" and "cappuccino." The price is up to you.
- [ ] Create 4 order variables of type Order and instantiate each as an Order object. Name them order1, order2, etc.
- [ ] Set each order's name - "Cindhuri", "Jimmy", "Noah", and "Sam."
- [ ] Print the order1 variable to the console to see what happens.
- [ ] Predict what will happen if you print 'order1.total'.
- [ ] Add item1 to order2's item list and increment the order's total.
- [ ] Noah ordered a cappuccino. Add the cappuccino to their order list and to their tab.
- [ ] Sam added a latte. Update the order accordingly.
- [ ] Cindhuri’s order is now ready. Update her status.
- [ ] Sam ordered more drinks - 2 lattes. Update their order as well.
- [ ] Jimmy’s order is now ready. Update his status.

