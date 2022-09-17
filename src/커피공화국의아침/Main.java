package 커피공화국의아침;

import 커피공화국의아침.role.MakeCoffee;
import 커피공화국의아침.role.Menu;
import 커피공화국의아침.role.OrderMenu;
import 커피공화국의아침.role.TakeOrder;

public class Main {

    static MakeCoffee barista = new Barista();
    static OrderMenu guest = new Guest();
    static TakeOrder cashier = new Cashier();
    public static void main(String[] args) {
        Menu menu = guest.orderMenu();
        cashier.takeOrder(menu,barista);
    }
}
