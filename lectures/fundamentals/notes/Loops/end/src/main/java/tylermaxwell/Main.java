package lectures.fundamentals.notes.Loops.end.src.main.java.tylermaxwell;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // while loop
        {
            int i = 0;
            while(i < 7){
                System.out.println("foo");
                i++;
            }
        }

        // C style for loop
        {
            for (int i = 0; i < 7; i++){
                System.out.println("bar");
            }
        }

        // loop over array
        {
            ArrayList<String> dynamicArray = new ArrayList<String>();
            dynamicArray.add("hello");
            dynamicArray.add("world");
            dynamicArray.add("etc");
            for (int i = 0; i < dynamicArray.size(); i++){
                System.out.println(dynamicArray.get(i));
            }

            // enhanced for loop

            for(String item : dynamicArray){
                System.out.println(item);
            }

            // won't work if modifying arraylist
        }


        
        


    }
}