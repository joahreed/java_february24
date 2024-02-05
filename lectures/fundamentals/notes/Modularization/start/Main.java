package lectures.fundamentals.notes.Modularization.start;

public class Main {

    public static void main(String[] args) {
       Operations operations = new Operations();
       System.out.println(operations);
       int int_sum = operations.add(3,4);
       double double_sum = operations.add(3.2,4.5);
       System.out.println(int_sum);
       System.out.println(double_sum);

       double_sum = operations.add(6.7, 5.5);

       String str = operations.add("string", 42);

       System.out.println(str);

       var name = 42;
       name = 43;
    }
    
}
