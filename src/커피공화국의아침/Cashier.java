package 커피공화국의아침;

import 커피공화국의아침.role.MakeCoffee;
import 커피공화국의아침.role.Menu;
import 커피공화국의아침.role.TakeOrder;

public class Cashier implements TakeOrder {
    @Override
    public void takeOrder(Menu menu, MakeCoffee makeCoffee) {
        makeCoffee.makeCoffee(menu);
    }
}
