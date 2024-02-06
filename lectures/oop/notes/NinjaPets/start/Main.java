package lectures.oop.notes.NinjaPets.start;

public class Main {

    public static void main(String[] args) {
        Pet pet1 = new Pet("Fido", "dog");
        Pet pet2 = new Pet();
        pet2.setType("cat");
        pet2.setName("Fluffy");
        pet1.setName("Fido");
        System.out.println(pet1.getName());
        System.out.println(Pet.getAllPets());
        System.out.println(pet1.getHealth());
    }
    
}
