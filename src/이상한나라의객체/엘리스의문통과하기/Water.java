package 이상한나라의객체.엘리스의문통과하기;

import 이상한나라의객체.엘리스의문통과하기.Food;

public class Water extends Food {
    Water(){
        this.keyChangeWidth = -10;
        this.remainingChance = 5;
        this.foodName = "Water";
    }

    @Override
    protected void foodFeatures() {
        System.out.println("gulp gulp");
    }
}
