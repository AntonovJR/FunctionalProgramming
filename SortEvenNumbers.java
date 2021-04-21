import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(", ");
        String output = Arrays.stream(data)
                .mapToInt(Integer::valueOf)
                .filter(num -> num % 2 == 0)
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(output);

        output = Arrays.stream(data)
                .mapToInt(Integer::valueOf)
                .filter(num -> num % 2 == 0)
                .sorted()
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(output);
    }
}
