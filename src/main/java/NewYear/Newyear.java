package NewYear;

import Gift.Gift;
import Sweets.*;

public class Newyear {
public static void main(String Args[])
{
    Sweets choclate= new Choclates(8, "Dairy Milk", 50, 40,"Milk Choclate");
    Sweets choclate1= new Choclates(7, " 5 star", 40, 30,"Dark Choclate");
    Sweets candy = new Candy(6, "Milky Way", 50, 30, "Baumatic");
    Sweets candy1 = new Candy(5, "Dubble Bubble", 70, 50, "Nestle");

    Sweets cake = new Cakes(4, "FruitCake", 400, 350, "Fruits");
    Sweets cake1 = new Cakes(5, "Choclate Cake", 400, 500, "Dark Choclate");

     Gift gift = new Gift();
     gift.add(choclate);
    gift.add(choclate1);
    gift.add(candy);
    gift.add(candy1);
    gift.add(cake);
    gift.add(cake1);

    System.out.println("Total weight of your gift is rs :-"+gift.NetWeight());
    System.out.println(gift.toString());

    gift.sort();
    System.out.println("After sorting on price Item will be:- "+ gift.toString());
}
}
