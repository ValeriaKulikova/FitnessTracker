package dao;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by valeriakulikova on 30.03.17.
 */
public class Diet {
    private Long id;
    private String name_of_diet;
    private int time_of_diet;
    private Set<Product> products = null;//new HashSet<Post>(0);

    public Diet() {

    }

    public Diet(Long id, String name_of_diet, int time_of_diet) {
        this.id = id;
        this.name_of_diet = name_of_diet;
        this.time_of_diet = time_of_diet;
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
    public String getName_of_diet() {
        return name_of_diet;
    }

    public void setName_of_diet(String name_of_diet) {
        this.name_of_diet = name_of_diet;
    }


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "diet")
    public int getTime_of_diet() {
        return time_of_diet;
    }

    public void setTime_of_diet(int time_of_diet) {
        this.time_of_diet = time_of_diet;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name_of_diet", name_of_diet)
                .append("time_of_diet", time_of_diet)
                .append("products", products)
                .toString();
    }
}
