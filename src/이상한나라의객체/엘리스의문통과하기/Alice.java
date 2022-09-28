package 이상한나라의객체.엘리스의문통과하기;

public class Alice {
    private int height = 150;
    private String currentLocation = "Outside";

    private Food[] hands = new Food[2];

    Alice(){

    }
    Alice(Food food1, Food food2){
        hands[0] = food1;
        hands[1] = food2;
    }

    protected void eatFood(Food food){
        if(food.getRemainingChance()>0){
            this.height += food.getKeyChangeWidth();
            System.out.println("i eat "+food.getFoodName());
            food.foodFeatures();
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
