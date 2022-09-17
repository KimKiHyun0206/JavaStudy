package 협력하는객체들.item;

import java.util.Scanner;

public class Service {

    protected Service(){

    }
    protected String decideColor() {
        int color = (int) Math.random() * 3;
        switch (color) {
            case 0: {
                return "Red";
            }
            case  1:{
                return "Blue";
            }
            case 2:{
                return "Black";
            }
            default:{
                return "Yellow";
            }
        }
    }

    protected String input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
