package lectures.oop.notes.Interface.end.src.main.java.tylerrmaxwell;

import lectures.oop.notes.Interface.end.src.main.java.tylerrmaxwell.PetUtils.Cat;
import lectures.oop.notes.Interface.end.src.main.java.tylerrmaxwell.PetUtils.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("fido", "mut");
        Cat cat = new Cat("fefe", "house");
        System.out.println(dog);
        System.out.println(cat);
        dog.businessOutside();
    }
}