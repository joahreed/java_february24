package lectures.fundamentals.notes.FixedArrays.end.src.main.java.tylermaxwell;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4};

        String[] names = new String[3];

        names[0] = "JoshG";
        names[1] = "JoshL";
        names[2] = "Joe";

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println(Arrays.toString(names));
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        ArrayList<String> dynamicNames = new ArrayList<>(Arrays.asList(names));
        dynamicNames.add("tyler");

        for(int j = 0; j < dynamicNames.size(); j++ ){
            System.out.println(dynamicNames.get(j));
        }

        // enhanced for loop for( type i : types )

        for( String name : dynamicNames ){
            System.out.println(name);
        }
   

 

        System.out.println(dynamicNames);




        // String[] names = {"tyler", "joshG", "joshL"};
        // System.out.println(names);
        // System.out.println(Arrays.toString(names));
        
        // String fruit[] = {"banana", "pear", "papaya", "kiwi"};
        // System.out.println(fruit);
        // System.out.println(Arrays.toString(fruit));
        // System.out.println(fruit.length);

        // ArrayList<String> fruitList = new ArrayList<>(Arrays.asList(fruit));

        // System.out.println(fruitList);
        // fruitList.add("apple");
        // System.out.println(fruitList);
    }
}