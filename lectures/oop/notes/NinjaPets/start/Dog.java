package lectures.oop.notes.NinjaPets.start;



public class Dog extends Pet {

    private boolean swimmer;

    public Dog(){
        swimmer = false;
    }
    

    public Dog(String name, String type){
        super(name, type);
    }

    public Dog(String name, String type, boolean swimmer){
        super(name, type);
        this.swimmer = swimmer;
    }


    public boolean isSwimmer() {
        return this.swimmer;
    }

    public boolean getSwimmer() {
        return this.swimmer;
    }

    public void setSwimmer(boolean swimmer) {
        this.swimmer = swimmer;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", type='" + getType() + "'" +
            ", health='" + getHealth() + "'" +
            ", energy='" + getEnergy() + "'" +
            " swimmer='" + isSwimmer() + "'" +
            "}";
    }





    
}
