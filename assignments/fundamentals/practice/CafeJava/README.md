# [Cafe Java](https://login.codingdojo.com/m/315/9299/62839)

## Learning Objectives:

- Become comfortable using **type declarations and variables** to store different kinds of data
- Use conditionals and basic numerical operations to solve practical problems
- Create, build (compile) and run a project
- Encounter some common syntax errors, and be able to debug them

```java

public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
    }
}
```

## steps

- [ ] Following the same camelcase naming convention, create drink price variables for drip coffee, latte, and cappuccino.

- [ ] Create customer variables for Sam, Jimmy, and Noah.

- [ ] Create the order status flag (true/false) for each customer.

- [ ] Cindhuri ordered a coffee. Based on her order status, print the correct status message to the console.

- [ ] Noah ordered a cappuccino. Use an if statement to check the status of his order and print the correct status message. If it is ready, also print the message to display the total. Note: Outcomes may be different depending on what you assigned as the status.

- [ ] Sam just ordered 2 lattes, print the message to display their total. Next, use an if statement to print the appropriate order status message. Change the isReady flag value from true to false or vice versa in order to test your control logic (if-statement).

- [ ] Jimmy just realized he was charged for a coffee but had ordered a latte. Print the total message with the new calculated total (what he owes) to make up the difference.

- [ ] Try changing the price values for each drink and isReady flags (booleans), to test if all of your logic works, even when prices and statuses are changed.
