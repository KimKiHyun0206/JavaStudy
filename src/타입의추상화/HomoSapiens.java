package 타입의추상화;

public class HomoSapiens extends People {

    String name;
    int age;

    public HomoSapiens(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    void talk() {
        System.out.println(this.name+" : hello");
    }

    public void talk(HomoSapiens homoSapiens) {
        System.out.println(this.name + " talk with " + homoSapiens.name);
        homoSapiens.talk();
    }

    void walk() {
        System.out.println("Run!");
    }

    void aboutMe() {
        System.out.println("My name is " + this.age);
    }
}
