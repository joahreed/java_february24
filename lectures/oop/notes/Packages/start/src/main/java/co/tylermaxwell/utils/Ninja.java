package lectures.oop.notes.Packages.start.src.main.java.co.tylermaxwell.utils;

public class Ninja {

    private String firstName;
    private String lastName;
    private Pet pet;



    public Ninja(String firstName, String lastName, Pet pet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pet = pet;
    }

    public void feed(){
        pet.eat();
    }


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Pet getPet() {
        return this.pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    
}
