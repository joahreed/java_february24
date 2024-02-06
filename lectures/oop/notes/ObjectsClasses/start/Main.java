package lectures.oop.notes.ObjectsClasses.start;

public class Main {

    public static void main(String[] args) {

        Tesla joshs_tesla = new Tesla();
        joshs_tesla.model = "X";
        Tesla tylers_tesla = new Tesla();
        tylers_tesla.model = "S";
        System.out.println(joshs_tesla.model);
        System.out.println(tylers_tesla.model);
        
    }
    
}
