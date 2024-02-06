package lectures.oop.notes.Interface.end.src.main.java.tylerrmaxwell.PetUtils;

public interface HousePet {

    static final boolean sleepsInside = true;
    boolean isHouseBroken = false;

    abstract void givesOwnerAffection();


    default void businessOutside(){
        System.out.println(String.format("The %s is going outside", this.getClass().getSimpleName()));
    }






    
}
