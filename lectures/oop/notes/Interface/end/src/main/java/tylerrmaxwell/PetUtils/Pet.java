package lectures.oop.notes.Interface.end.src.main.java.tylerrmaxwell.PetUtils;

public abstract class Pet {

    protected String name;
    protected String type;


    public Pet() {
    }


    public Pet(String name, String type) {
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


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", type='" + getType() + "'" +
            "}";
    }



    
}
