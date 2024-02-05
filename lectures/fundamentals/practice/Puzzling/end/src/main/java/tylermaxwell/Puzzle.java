package lectures.fundamentals.practice.Puzzling.end.src.main.java.tylermaxwell;

import java.util.Arrays;
import java.util.Random;

public class Puzzle {

    public int[] getTenRolls(){
        int rolls[] = new int[10];
        Random r = new Random();

        for(int i = 0; i < rolls.length; i++){
            rolls[i] = r.nextInt(21);
        }
        return rolls;
    }

    public char getRandomLetter(){
        char letters[] = new char[26];
        Random r = new Random();
        for(int i = 0; i < 26; i++){
            letters[i] = (char)(i + 65);
        }
        // System.out.println(Arrays.toString(letters));
        return letters[r.nextInt(9)];
    }

    public String generatePassword(){
        String password = "";

        for(int i = 0; i < 9; i++){
            password += getRandomLetter();
        }

        return password;
    }

    public String[] getNewPasswordSet(int length){
        String passwords[] = new String[length];

        for(int i = 0; i < passwords.length; i++){
            passwords[i] = generatePassword();
        }

        return passwords;

    }

    
}
