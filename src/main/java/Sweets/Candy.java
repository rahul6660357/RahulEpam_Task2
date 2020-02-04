package Sweets;

public class Candy extends Sweets {
    String brand;
    public Candy(int sweetness, String name, int weight, int price, String brand) {
        super(sweetness, name, weight, price);
        this.brand= brand;
    }
}
