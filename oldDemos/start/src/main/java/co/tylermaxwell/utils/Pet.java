package co.tylermaxwell.utils;

public abstract class Pet {

    // Attributes aka fields 
    private String name;
    private String type;
    private int health;
    private int energy;

    // constructors


    public Pet() {
        health = 100;
        energy = 100;

    }



    public Pet(String name, String type, int health, int energy) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.energy = energy;
    }

    // custom methods

    public void eat(){
        this.energy += 10;
    }

    public void makeNoise(String noise){
        System.out.format("The %s says %s\n", this.getClass().getSimpleName(), noise );
    }


    // getters and setters 

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


    // to String


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
