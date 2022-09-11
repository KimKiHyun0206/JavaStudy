package object;

import object.Status;

public abstract class Trump extends Status {
    Trump(){
        this.status ="flap";
    }

    void flap(){
        System.out.println(this.name +" flap~");
    }
}
