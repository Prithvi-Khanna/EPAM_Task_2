package Sweets;

public class Chocolate extends Sweet {

    String ChocoName;
    String Type;

    public Chocolate(int quantity, int weight, String category, String chocoName, String type) {
        super(quantity, weight, category);
        ChocoName = chocoName;
        Type = type;
    }
}
