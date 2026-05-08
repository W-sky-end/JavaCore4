import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);
        numbers.add(7);
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);

        numbers.sort((a, b) -> b - a);

        System.out.println(numbers);


        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        names.add("Vadik");
        names.add("Mia");

        names.sort((a, b) -> a.compareTo(b));
        System.out.println(names);

        names.sort((a,b)-> a.length()-b.length());
        System.out.println(names);


    }
}