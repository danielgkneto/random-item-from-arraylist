import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int value;

        for (int i = 0; i < 20; i++)
            numbers.add(new Random().nextInt(1000) + 1);

        System.out.println(numbers);

        System.out.println("Random value from the list: ");
        value = numbers.get(new Random().nextInt(20));
        System.out.print(value);
    }
}