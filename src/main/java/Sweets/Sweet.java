package Sweets;

public abstract class Sweet implements Comparable<Sweet> {

    int quantity;
    int weight;
    String category;

    public Sweet(int quantity, int weight, String category) {
        this.quantity = quantity;
        this.weight = weight;
        this.category = category;
    }

    public Sweet() {

    }

    public int compareTo(Sweet sweet)
    {
        return ( this.quantity * this.weight ) - ( sweet.getQuantity() * sweet.getWeight() );
    }

    @Override
    public String toString() {
        return "Sweet Category = " + this.category + " weight = " + this.weight + " quantity = " + this.quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
