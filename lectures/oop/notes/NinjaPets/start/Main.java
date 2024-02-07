package lectures.oop.notes.NinjaPets.start;



public class Main {

    public static void main(String[] args) {
        // Pet noArgPet = new Pet();
        // Pet twoArgPet = new Pet("Sparky", "dog");
        // Pet allArgPet = new Pet("fluffy", "cat", 150, 150);
        // System.out.println(noArgPet);
        // System.out.println(twoArgPet);
        // System.out.println(allArgPet);

        Dog dog = new Dog();
        Dog argDog = new Dog("fido", "mut", true);
        Cat cat = new Cat();
        System.out.println(argDog);
        System.out.println(cat);
   

    }
    
}
