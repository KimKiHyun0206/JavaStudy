package 협력하는객체들;

import 협력하는객체들.item.Controller;
import 협력하는객체들.item.View;

public class Item {
    private final Controller controller = new Controller();
    public void execution(){
        controller.useItem();
    }
}
