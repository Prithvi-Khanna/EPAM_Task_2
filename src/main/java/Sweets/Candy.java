package Sweets;

public class Candy extends Sweet {

    String CandyName;
    String colorName;

    public Candy(int quantity, int weight, String category, String candyName, String colorName) {
        super(quantity, weight, category);
        CandyName = candyName;
        this.colorName = colorName;
    }

    public Candy(){
        super();
    }

    public String getCandyName() {
        return CandyName;
    }

    public void setCandyName(String candyName) {
        CandyName = candyName;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}
