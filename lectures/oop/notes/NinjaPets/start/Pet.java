package lectures.oop.notes.NinjaPets.start;



import java.util.ArrayList;

public class Pet {

    private String name;
    private String type;
    private int health;
    private int energy;


    public Pet(){
        health = 100;
        energy = 100;
    }


    public Pet(String name, String type, int health, int energy) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.energy = energy;
    }

    public Pet(String name, String type) {
        this();
        this.name = name;
        this.type = type;
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

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", type='" + getType() + "'" +
            ", health='" + getHealth() + "'" +
            ", energy='" + getEnergy() + "'" +
            "}";
    }


    
}
