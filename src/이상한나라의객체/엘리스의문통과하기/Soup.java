package 이상한나라의객체.엘리스의문통과하기;

import 이상한나라의객체.엘리스의문통과하기.Food;

public class Soup extends Food {
    Soup(){
        this.keyChangeWidth = 10;
        this.remainingChance = 5;
        this.foodName = "Soup";
    }

    @Override
    protected void foodFeatures() {
        System.out.println("i'm hot");
    }
}
