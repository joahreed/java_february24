package lectures.fundamentals.notes.Strings.end.src.main.java.tylermaxwell;

public class Main {
    public static void main(String[] args) {

        String myString = "This is the string";
        String myOtherString =  "we are going to use.";
        System.out.println(myString);

        /**
         * length() method
         */
        System.out.println(myString.length());

        /**
         * concat() method
         */
        String newStr = myString.concat(myOtherString);
        System.out.println(newStr);

        /**
         * format() static method
         */

        String str1 = "Simon";
        String str2 = "draw drawings";
        String formatString = String.format("My name is %s and I like to %s.", str1, str1);
        System.out.println(formatString);

        /**
         * indexOf() method
         */
        System.out.println(myString.indexOf("string"));

    }
}