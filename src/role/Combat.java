package role;

public interface Combat {
    default void combat(){
        System.out.println("Fight!");
    }
}
