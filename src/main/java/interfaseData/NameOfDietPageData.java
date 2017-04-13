package interfaseData;

import dao.Diet;
import org.apache.commons.lang3.builder.ToStringBuilder;



public class NameOfDietPageData {



    String nameOfDiet;


    public NameOfDietPageData() { }




    public String getNameOfDiet() {
        return nameOfDiet;
    }

    public void setNameOfDiet(String nameOfDiet) {
        this.nameOfDiet = nameOfDiet;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("nameOfDiet", nameOfDiet)
                .toString();
    }
}
