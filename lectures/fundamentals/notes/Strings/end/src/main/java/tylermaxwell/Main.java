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
        String formatString = String.format("My name is %s and I like to %s.", "Simon", "draw drawings");
        System.out.println(formatString);

        /**
         * indexOf() method
         */
        System.out.println(myString.indexOf("string"));

    }
}