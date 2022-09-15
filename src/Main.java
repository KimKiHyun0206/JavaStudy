import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenericTest<String> test1 = new GenericTest<>();
        test1.setName("Hello");
        System.out.println(test1.getName());

        GenericTest<List<Integer>> test2 = new GenericTest<>();
        test2.setName(new LinkedList<>());
        test2.getName().add(1);
        test2.getName().add(2);
        test2.getName().stream().forEach(System.out::println);
    }
}
