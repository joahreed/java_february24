package assignments.fundamentals.practice.AlfredBot.end.src.main.java.tylermaxwell;

import java.util.Date;

public class AlfredQuotes {


    /**
     * 
     * @return Returns a greeting that includes the person's name.
     */
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello, %s. Lovely to see you.", name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        System.out.println(date);
        String output = String.format("It is currently %s.", date);
        return output;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        return "for snarky response return string";
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method

    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}


