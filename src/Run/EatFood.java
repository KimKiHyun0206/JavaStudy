package Run;

import object.Alice;
import object.Food;

public class EatFood {
    public static void main(String[] args) {
        Food mushroom = new Food("Mushroom",+20);
        Food beverage = new Food("Beverage",-20);
        Food cake = new Food("Cake",+30);
        Food Book = new Food("Book",-30);
        Alice alice = new Alice();

        //먹기 전의 키
        alice.tellMyHeight();

        Food foodToEat = mushroom;
        foodToEat.eatFood();

        //먹은 후의 키
        alice.tellMyHeight();
        if(Alice.height <= 140){
            alice.setPlace("in");
        }

        //먹은 후의 위치
        alice.tellMyPlace();
    }
}
