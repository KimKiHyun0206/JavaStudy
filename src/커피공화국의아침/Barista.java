package 커피공화국의아침;

import 커피공화국의아침.role.MakeCoffee;
import 커피공화국의아침.role.Menu;

public class Barista implements MakeCoffee{

    @Override
    public void makeCoffee(Menu menu) {
        System.out.println("커피공화국의아침.Barista make "+menu);
    }
}
