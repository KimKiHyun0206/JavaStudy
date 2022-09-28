package 타입의추상화;

public class HomoErectus extends People{
    int age;
    String name;

    public HomoErectus(String name, int age){
        this.age = age;
        this.name = name;
    }
    void walk(){
        System.out.println("Run Fast");
    }
    public void talk(){
        System.out.println(this.name+": talk");
    }

    public void aboutMe(){
        for(int i = 0; i<this.age;i++){
            System.out.print(this.name+" ");
        }
        System.out.println();
    }
}
