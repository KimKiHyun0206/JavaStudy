package 이상한나라의객체.엘리스의문통과하기;

public abstract class Food {
    int keyChangeWidth;
    int remainingChance;
    String foodName;

    protected int getKeyChangeWidth() {
        return keyChangeWidth;
    }

    protected String getFoodName(){
        return foodName;
    }

    protected void minusRemainingChance() {
        this.remainingChance--;
    }

    protected int getRemainingChance() {
        return remainingChance;
    }
}
