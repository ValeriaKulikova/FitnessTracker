package dao;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.omg.CORBA.Object;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table (name = "DIET", schema = "JAVA_TASK")
public class Diet  {
    private Long id;
    private String nameOfDiet;
    private int timeOfDiet;
    private Set<Product> products = null;//new HashSet<Post>(0);



    public Diet() {

    }

    public Diet(Long id, String nameOfDiet, int timeOfDiet) {
        this.id = id;
        this.nameOfDiet = nameOfDiet;
        this.timeOfDiet = timeOfDiet;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "Name_of_diet", length = 32, nullable = false)
    public String getNameOfDiet() {
        return nameOfDiet;
    }

    public void setNameOfDiet(String nameOfDiet) {
        this.nameOfDiet = nameOfDiet;
    }


  @Column(name = "Time_of_diet", nullable = false)
    public int getTimeOfDiet(int time_of_diet) {
        return timeOfDiet;
    }

    public void setTimeOfDiet(int timeOfDiet) {
        this.timeOfDiet = timeOfDiet;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "diet")
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public void setPosts(Set<Product> posts) {
        this.products = posts;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("nameOfDiet", nameOfDiet)
                .append("timeOfDiet", timeOfDiet)
                .append("products", products)
                .toString();
    }


    public void getTimeOfDiet() {


    }


}
