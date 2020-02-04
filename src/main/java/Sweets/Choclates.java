package Sweets;

public class Choclates  extends Sweets{

    String type;

    public Choclates(int sweetness, String name, int weight, int price,String type) {
        super(sweetness, name, weight, price);
        this.type= type;
    }
}
