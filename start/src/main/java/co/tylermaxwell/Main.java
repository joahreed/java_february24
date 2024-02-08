package co.tylermaxwell;

import co.tylermaxwell.utils.Cat;
import co.tylermaxwell.utils.Dog;
import co.tylermaxwell.utils.Ninja;
import co.tylermaxwell.utils.Pet;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet();
        Dog dog = new Dog();
        dog.makeNoise("woof");
        Cat cat = new Cat();
        cat.makeNoise("meow");
        Ninja joe = new Ninja("Joe", "MeMay",dog);
        Ninja josh = new Ninja("Josh", "Gallaway",cat);
        System.out.println(pet);
        System.out.println(joe.getPet());
        System.out.println(josh.getPet());
        josh.feed();
        System.out.println(josh.getPet());

    }
}