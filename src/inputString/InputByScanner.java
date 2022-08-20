package inputString;

import java.util.Scanner;

public class InputByScanner implements InputString{

    private String stringValue;

    @Override
    public void inputString() {
        Scanner sc = new Scanner(System.in);
        setStringValue(sc.nextLine());
    }

    @Override
    public void showString() {

    }

    private String getStringValue(){
        return stringValue;
    }

    private void setStringValue(String stringValue){
        this.stringValue = stringValue;
    }
}
