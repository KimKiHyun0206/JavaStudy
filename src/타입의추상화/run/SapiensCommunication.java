package 타입의추상화.run;

import 타입의추상화.HomoSapiens;

public class SapiensCommunication {
    public static void main(String[] args) {
        HomoSapiens kim = new HomoSapiens("kim",21);
        HomoSapiens park = new HomoSapiens("park",21);

        kim.talk(park);
    }
}
