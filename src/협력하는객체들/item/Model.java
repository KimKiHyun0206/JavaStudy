package 협력하는객체들.item;

public class Model {
    private final Service service = new Service();
    protected Model(){

    }

    protected String getColor() {
        return service.decideColor();
    }

    protected String whatToWrite(){
        return service.input();
    }
}
