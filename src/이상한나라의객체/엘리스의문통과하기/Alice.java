package 이상한나라의객체.엘리스의문통과하기;

public class Alice {
    private int height = 150;
    private String currentLocation = "Outside";

    protected void eatFood(Food food){
        if(food.getRemainingChance()>0){
            this.height += food.getKeyChangeWidth();
            System.out.println("i eat "+food.getFoodName());
            food.minusRemainingChance();
        }else{
            System.out.println(food.getFoodName()+" is not left");
        }
    }

    protected void passTheDoor(Door door){
        if(door.considerAliceCanPassDoor(this.height)){
            currentLocation = "Inside";
            System.out.println("i went through the door");
        }else{
            System.out.println("i cant pass the door");
        }
    }

    protected void tellOwnPlace(){
        System.out.println("now i'm at "+ this.currentLocation);
    }
}
