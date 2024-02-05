package lectures.fundamentals.notes.Variables.end.src.main.java.tyler;

public class Main {
    public static void main(String[] args) {

        // What is a data type?

        int answer = 42;
        System.out.println(Integer.toBinaryString(answer));

        char answerC = '*';
        System.out.println(Integer.toBinaryString(answerC));
    
        // primitive types:

        // boolean
        boolean myBool = true;
        // byte
        byte myByte = 127;
        // char
        char myChar = '*';
        // short
        short myShort = 10_000;
        // int
        int myInt = 1_000_000_000;
        // float
        float myFloat = 12.897F;
        // long
        long myLong = 1_000_000_000_000L;
        // double
        double myDouble = 6.02E23;
    }
}