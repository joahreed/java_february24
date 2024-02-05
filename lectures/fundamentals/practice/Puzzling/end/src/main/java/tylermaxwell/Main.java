package lectures.fundamentals.practice.Puzzling.end.src.main.java.tylermaxwell;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Puzzle p = new Puzzle();

        int[] rolls = p.getTenRolls();
        System.out.println(Arrays.toString(rolls));

        System.out.println(p.getRandomLetter());

        System.out.println(p.generatePassword());

        System.out.println(Arrays.toString(p.getNewPasswordSet(5)));
    }
}