package co.tylermaxwell.burgertrackerone.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//TODO add annotiatons to indicate this is an "entity" to be tracked
//TODO add a table name

@Entity
@Table(name="burgers")
public class Burger {

    //TODO all the appropriate fields come from the form
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 5, max = 200)
    private String name;
    
    @NotBlank
    private String restaurant;
    
    @Min(0)
    @Max(5)
    private Integer rating;
    
    
    @NotBlank
    private String notes;


    //TODO  Don't forget to add annotations and getters & setters!


    public Burger() {
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRestaurant() {
        return this.restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public Integer getRating() {
        return this.rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", restaurant='" + getRestaurant() + "'" +
            ", rating='" + getRating() + "'" +
            ", notes='" + getNotes() + "'" +
            "}";
    }



    
}
