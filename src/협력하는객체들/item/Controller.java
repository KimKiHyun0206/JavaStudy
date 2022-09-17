package 협력하는객체들.item;

public class Controller {
    private final View view = new View();
    private final Model model = new Model();

    public void useItem(){
        String color = model.getColor();
        String whatToWrite = model.whatToWrite();
        view.showColor(color,whatToWrite);
    }
}
