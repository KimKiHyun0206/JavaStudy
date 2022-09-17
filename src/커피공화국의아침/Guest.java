package 커피공화국의아침;

import 커피공화국의아침.role.Menu;
import 커피공화국의아침.role.OrderMenu;

public class Guest implements OrderMenu {
    @Override
    public Menu orderMenu() {
        return Menu.Americano;
    }
}
