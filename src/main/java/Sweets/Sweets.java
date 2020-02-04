package Sweets;

import Gift.Gift;

public abstract class Sweets implements Comparable<Sweets> {
    int sweetness;
    private String name;
    private int weight;
    int price;

    public Sweets(int sweetness, String name, int weight, int price) {
        this.sweetness = sweetness;
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sweet name = " + this.name + " weight = " + this.weight + " price " + this.price+ "sweetness is"+ this.sweetness;
    }

    public  int compareTo(Sweets sweet)
    {
        return this.price - sweet.getPrice();
    }
    public int getSweetness() {
        return sweetness;
    }

    public void setSweetness(int sweetness) {
        if(sweetness>0 && sweetness< 9)
        this.sweetness = sweetness;
        else{
            this.sweetness=9;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
