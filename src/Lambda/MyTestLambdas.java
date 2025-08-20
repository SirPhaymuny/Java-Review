package Lambda;

import java.util.Arrays;
import java.util.List;

public class MyTestLambdas {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(System.out::println);
    }
}
