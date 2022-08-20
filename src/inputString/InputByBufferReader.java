package inputString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputByBufferReader implements InputString{

    private String stringValue;
    @Override
    public void inputString() {
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            setStringValue(bufferedReader.readLine());
            bufferedReader.close();


        }catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void showString() {
        System.out.println("BufferReader = "+ getStringValue());
    }

    private void setStringValue(String stringValue){
        this.stringValue = stringValue;
    }

    private String getStringValue(){
        return stringValue;
    }
}
