package lectures.oop.notes.NinjaPets.end.src.main.java.tylermaxwell;

public class Pet {

    private String name;
    private String type;
    private int energy;
    private int health;


    public Pet() {
        this.energy = 100;
        this.health = 100;
    }



    public Pet(String name, String type) {
        this.name = name;
        this.type = type;

    }

    public void sleep(){
        this.energy += 25;
    }

    public void eat(){
        this.energy += 5;
        this.health += 10;
    }

    public void play(){
        this.health += 5;
    }

    public void noise(){
        switch (type) {
            case "dog":
                System.out.println("woof");
                break;
            case "cat":
                System.out.println("meow");
                break;
                default:
                System.out.println("no noise");
                break;
        }
    }

    public void noise(String noise){
        System.out.format("The %s says %s", type, noise);
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", type='" + getType() + "'" +
            ", energy='" + getEnergy() + "'" +
            ", health='" + getHealth() + "'" +
            "}";
    }



    
}
