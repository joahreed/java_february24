package lectures.oop.practice.Devices.end.src.main.java.tylermaxwell;

public class Device {

    private int battery;


    public Device() {
        this.battery = 100;
    }

    public void checkBattery(){
        if(battery < 10){
            System.out.println("battery critical");
        }
    }

    public int getBattery() {
        return this.battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }




    
}
