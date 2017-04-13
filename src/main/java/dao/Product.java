package dao;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;

/**
 * Created by valeriakulikova on 30.03.17.
 */
@Entity
@Table(name= "PRODUCT" , schema = "JAVA_TASK")

public class Product {
    private long id;
    private Diet diet;
    private String breakfast;
    private String dinner;
    private String supper;

    public Product() {

    }

public Product (long id, Diet diet, String breakfast, String dinner,String supper){

    this.id = id;
    this.diet = diet;
    this.breakfast = breakfast;
    this.dinner = dinner;
    this.supper = supper;
}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique=true)
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="DIET_ID", nullable = false)
    public Diet getDiet() {return diet;}
    public void setDiet(Diet diet) {this.diet=diet;}

    @Column(name="BREAKFAST",length = 100, nullable = false)
    public String getBreakfast() {return breakfast;}
    public void setBreakfast(String breakfast) {this.breakfast = breakfast;}

    @Column(name="DINNER", length = 100, nullable = false)
    public String getDinner() {return dinner;}
    public void setDinner(String dinner) {this.dinner = dinner;}

    @Column(name="SUPPER",length = 100, nullable = false)
    public String getSupper() {return supper;}
    public void setSupper(String supper) {this.supper = supper;}

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("diet", diet)
                .append("breakfast", breakfast)
                .append("dinner", dinner)
                .append("supper", supper)
                .toString();
    }


}
