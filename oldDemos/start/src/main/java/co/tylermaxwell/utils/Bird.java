package co.tylermaxwell.utils;

public class Bird extends Pet implements HousePet, Flyable {

    @Override
    public void fly() {
        System.out.printf("The %s is flying", this.getClass().getSimpleName());
    }

    @Override
    public void land() {

    }

    @Override
    public void sleepInside() {
        
    }

    @Override
    public boolean isHouseTrained() {
        return true;
    }
    
}
