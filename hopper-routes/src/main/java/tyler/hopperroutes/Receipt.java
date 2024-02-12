package tyler.hopperroutes;

public class Receipt {

    private String name;
    private String itemName;
    private String description;
    private double price;
    private String vendor;


    public Receipt() {
    }


    public Receipt(String name, String itemName, String description, double price, String vendor) {
        this.name = name;
        this.itemName = itemName;
        this.description = description;
        this.price = price;
        this.vendor = vendor;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getVendor() {
        return this.vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", itemName='" + getItemName() + "'" +
            ", description='" + getDescription() + "'" +
            ", price='" + getPrice() + "'" +
            ", vendor='" + getVendor() + "'" +
            "}";
    }




    
    
}
