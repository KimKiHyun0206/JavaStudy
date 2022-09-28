package 타입의추상화.run;

import 타입의추상화.HomoErectus;

public class ErectusCommunication {
    public static void main(String[] args) {
        HomoErectus uga = new HomoErectus("Uga",3);
        HomoErectus kiki = new HomoErectus("Kiki",5);

        kiki.aboutMe();
        kiki.talk();
    }
}
