package Sweets;

public class Cakes extends Sweets {
String flavour;

    public Cakes(int sweetness, String name, int weight, int price, String flavour) {
        super(sweetness, name, weight, price);
        this.flavour=flavour;
    }
}
