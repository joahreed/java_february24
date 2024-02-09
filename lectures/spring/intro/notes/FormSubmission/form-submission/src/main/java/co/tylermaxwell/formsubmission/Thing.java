package co.tylermaxwell.formsubmission;

public class Thing {

    private String data;


    public Thing() {
    }


    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "{" +
            " data='" + getData() + "'" +
            "}";
    }



    
}
