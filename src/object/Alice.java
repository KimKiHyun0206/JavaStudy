package object;

import role.Witness;

public class Alice extends Status implements Witness {


    public static int height = 150;
    String place = "out";
    public Alice(){
        this.name ="Alice";
        this.status = "Girl";
    }

    public void tellMyHeight(){
        System.out.println("Alice : my height is "+ height);
    }

    public void tellMyPlace(){
        System.out.println("Alice : now im" + this.place);
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public void testify() {
        System.out.println(this.name+ " : I dont know anything");
    }
}
