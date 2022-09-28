package 이상한나라의객체.엘리스의문통과하기;

public class Door {
    private final int high = 145;
    protected boolean considerAliceCanPassDoor(int height){
        if(height>this.high) return false;
        else return true;
    }
}
