package lectures.fundamentals.notes.Maps.end.src.main.java.tylermaxwell;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        

        HashMap<String, Integer> userAges = new HashMap<>();

        userAges.put("Tyler", 39);
        userAges.put("Josh", 24);
        userAges.put("Josh", 25);

        userAges.replace("Tyler", 45);

        Set<String> keys = userAges.keySet();

        for(String key: keys){
            System.out.println(key);
            System.out.println(userAges.get(key));
            System.out.println(String.format("%s is %d years old", key, userAges.get(key)));
        }

        System.out.println(userAges.size());
    }
}