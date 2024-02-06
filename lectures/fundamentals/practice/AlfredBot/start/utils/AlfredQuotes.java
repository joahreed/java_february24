package lectures.fundamentals.practice.AlfredBot.start.utils;

import java.util.Date;

public class AlfredQuotes {



    /**
     * 
    Description:	Returns a greeting that includes the person's name.
`   Inputs:	String name
    @return	String
    Example Output:	"Hello, Beth Kane. Lovely to see you."  
     */
    public String greeting(String firstName, String lastName, double balance){
        return String.format("Hello, %s %s. Lovely to see you. Your balance is $%.2f", firstName, lastName, balance);
    }
   
    public String greeting(double money, String whatever, String balance){
        return String.format("Hello, %s %s. Lovely to see you. Your balance is $%.2f", balance, whatever, money);
    }

    public String greeting(String name){
        return String.format("Hello %s, Lovely to see you.", name);
    }

    public String greeting(){
        return "empty";
    }

    public String dataAnnouncement(){
        Date date = new Date();
        System.out.println(date);
        return String.format("It is currently %s.", date);
    }

    public String respondBeforeAlexis(String conversation){

        if(conversation.contains("Alexis")){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if(conversation.contains("Alfred")){
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }

    }
}

