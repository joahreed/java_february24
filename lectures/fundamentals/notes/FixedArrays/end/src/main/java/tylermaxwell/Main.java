package lectures.fundamentals.notes.FixedArrays.end.src.main.java.tylermaxwell;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = {"tyler", "joshG", "joshL"};
        System.out.println(names);
        System.out.println(Arrays.toString(names));
        
        String fruit[] = {"banana", "pear", "papaya", "kiwi"};
        System.out.println(fruit);
        System.out.println(Arrays.toString(fruit));
        System.out.println(fruit.length);

        ArrayList<String> fruitList = new ArrayList<>(Arrays.asList(fruit));

        System.out.println(fruitList);
        fruitList.add("apple");
        System.out.println(fruitList);
    }
}