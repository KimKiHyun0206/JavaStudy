package object;

public class Food {
    String name;
    int effect;

    public Food(String name, int effect){
        this.name = name;
        this.effect = effect;
    }

    public void eatFood(){
        Alice.height += effect;
    }
}
