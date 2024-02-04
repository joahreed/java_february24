package assignments.fundamentals.notes.Strings.end.src.main.java.tylermaxwell;

public class StringEquality {

    
    public static void main(String[] args) {
        String a = "Some string";
        String b = "Some string";
        String c = new String("Some string");
        c = b;

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(b.equals(c));

        
    }
    
}
