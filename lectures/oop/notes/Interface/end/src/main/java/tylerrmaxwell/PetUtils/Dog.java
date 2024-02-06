package lectures.oop.notes.Interface.end.src.main.java.tylerrmaxwell.PetUtils;

public class Dog extends Pet implements HousePet {

    private boolean swims;


    public Dog() {
        swims = false;
    }

    public Dog(String name, String type) {
        super(name, type);
    }


    public Dog(boolean swims) {
        this.swims = swims;
    }

    @Override
    public void givesOwnerAffection() {
 ;
    }




    
}
