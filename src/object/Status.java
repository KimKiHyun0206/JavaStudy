package object;

public abstract class Status {
    String status;
    protected String name;

    void tellOwnStatus(){
        System.out.println(this.name+"`s status is "+this.status);
    }
}
