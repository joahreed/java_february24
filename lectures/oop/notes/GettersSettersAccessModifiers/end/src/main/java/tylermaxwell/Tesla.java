package lectures.oop.notes.GettersSettersAccessModifiers.end.src.main.java.tylermaxwell;

public class Tesla {


    private String model;
    private String color;
    private double mileage;


    public Tesla() {
        this.mileage = 12.0;
    }



    public Tesla(String model, String color) {
        this();
        this.model = model;
        this.color = color;
    }


    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return this.mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }



    @Override
    public String toString() {
        return "{" +
            " model='" + getModel() + "'" +
            ", color='" + getColor() + "'" +
            ", mileage='" + getMileage() + "'" +
            "}";
    }

    
}
