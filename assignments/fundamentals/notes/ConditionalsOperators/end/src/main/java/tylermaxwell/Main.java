package assignments.fundamentals.notes.ConditionalsOperators.end.src.main.java.tylermaxwell;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Rock, paper, or scissors");
        String choice = s.nextLine();
        System.out.println(choice);
        String computerChoice = "scissors";

        if(choice.equals("rock")){
            System.out.println("you win");
        } 
        else if(choice.equals(computerChoice)){
            System.out.println("Tie");
        } else {
            System.out.println("you loose!!");
        }

    }
        
  
}