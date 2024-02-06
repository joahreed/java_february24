package lectures.fundamentals.notes.Maps.start;

import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        
        HashMap<String, Integer> userages = new HashMap<>();
        userages.put("Tyler", 39);
        userages.put("Joe", 35);
        userages.put("Josh", 26);

        Set<String> keys = userages.keySet();

        System.out.println(keys);

        for(String key : keys){
            System.out.println(key);
            System.out.println(userages.get(key));
            System.out.println(String.format("%s is %d years old", key, userages.get(key)));
        }
    }
    
}
