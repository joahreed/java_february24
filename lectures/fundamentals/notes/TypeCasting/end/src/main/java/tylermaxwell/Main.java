package lectures.fundamentals.notes.TypeCasting.end.src.main.java.tylermaxwell;

public class Main {
    public static void main(String[] args) {

    
        System.out.println("The max value of byte is " + Byte.MAX_VALUE + " Which is " + Byte.SIZE + " bits");
        System.out.println("The max value of char is " + Character.MAX_VALUE + " Which is " + Character.SIZE + " bits");
        System.out.println("The max value of short is " + Short.MAX_VALUE + " Which is " + Short.SIZE + " bits");
        System.out.println("The max value of int is " + Integer.MAX_VALUE + " Which is " + Integer.SIZE + " bits");
        System.out.println("The max value of float is " + Float.MAX_VALUE + " Which is " + Float.SIZE + " bits");
        System.out.println("The max value of long is " + Long.MAX_VALUE + " Which is " + Long.SIZE + " bits");
        System.out.println("The max value of double is " + Double.MAX_VALUE + " Which is " + Double.SIZE + " bits");


        byte by1 = 127;
        char ch2 = 't';
        short sh2 = 32767;
        int in4 = 2147483647;
        float fl4 = 3.4028235E38F;
        long l8 = 9223372036854775807L;
        double d8 = 1.7976931348623157E308;

        in4 = by1;

        System.out.println(in4);
        
        in4 = (int)l8;
        
        System.out.println(in4);
 
    

        
        


        


    }
}