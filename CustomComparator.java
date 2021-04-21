import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split("\\s+");
        Function<String[], String[]> list = nums -> {
            String output = Arrays.stream(nums)
                    .mapToInt(Integer::valueOf)
                    .filter(num -> num % 2 == 0)
                    .sorted()
                    .boxed()
                    .map(String::valueOf)
                    .collect(Collectors.joining(" "));
            System.out.print(output + " ");

            output = Arrays.stream(nums)
                    .mapToInt(Integer::valueOf)
                    .filter(num -> num % 2 != 0)
                    .sorted()
                    .boxed()
                    .map(String::valueOf)
                    .collect(Collectors.joining(" "));
            System.out.print(output);

            return nums;
        };
        list.apply(data);
    }
}
