package co.tylermaxwell.formsessiondemo;

public class Thing {

    private String city;
    private int number;


    public Thing() {
    }


    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "{" +
            " city='" + getCity() + "'" +
            ", number='" + getNumber() + "'" +
            "}";
    }



    
}
