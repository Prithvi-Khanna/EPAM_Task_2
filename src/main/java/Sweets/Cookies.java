package Sweets;

public class Cookies extends Sweet {

    String CookieName;

    public Cookies(int quantity, int weight, String category, String cookieName) {
        super(quantity, weight, category);
        CookieName = cookieName;
    }
}
