package co.tylermaxwell.utils;

public class Dog extends Pet implements HousePet {


    @Override
    public void makeNoise(String noise){
        super.makeNoise(noise);
    }

	@Override
	public void sleepInside() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'sleepInside'");
	}

	@Override
	public boolean isHouseTrained() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'isHouseTrained'");
	}
    
}
