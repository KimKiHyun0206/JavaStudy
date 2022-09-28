package 이상한나라의객체.엘리스의문통과하기;

public class main {
    public static void main(String[] args) {
        Alice alice = new Alice();
        Door door = new Door();

        Soup soup = new Soup();
        Water water = new Water();

        alice.tellOwnPlace();

        alice.eatFood(soup);
        //alice.eatFood(water);

        alice.passTheDoor(door);
    }
}
