package interfaseData;

import org.apache.commons.lang3.builder.ToStringBuilder;


public class ProductPageData {


    String diet;
    String breakfast ;
    String dinner ;
    String supper;

    public ProductPageData() { }

    public String getDiet() {return diet;}

    public void setDiet(String diet) {this.diet = diet;}

    public String getBreakfast() {return breakfast;}

    public void setBreakfast(String breakfast) {this.breakfast = breakfast;}

    public String getDinner() {return dinner;}

    public void setDinner(String dinner) {this.dinner = dinner;}

    public String getSupper() {return supper;}

    public void setSupper(String supper) {this.supper = supper;}

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("diet", diet)
                .append("breakfast", breakfast)
                .append("dinner", dinner)
                .append("supper", supper)
                .toString();
    }
}
