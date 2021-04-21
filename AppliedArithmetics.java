import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<int[], int[]> add = nums -> Arrays.stream(nums).map(e -> e += 1).toArray();
        Function<int[], int[]> multiply = nums -> Arrays.stream(nums).map(e -> e *= 2).toArray();
        Function<int[], int[]> subtract = nums -> Arrays.stream(nums).map(e -> e -= 1).toArray();
        Consumer<int[]> intConsumer = nums->{
            for (int num : nums) {
                System.out.print(num+" ");

            }
        };
        int[] list = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::valueOf).toArray();

        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            switch (input) {
                case "add":
                    list = add.apply(list);
                    break;
                case "multiply":
                    list = multiply.apply(list);
                    break;
                case "subtract":
                    list = subtract.apply(list);
                    break;
                case "print":
                    intConsumer.accept(list);
                    System.out.println();
                    break;

            }
            input = scanner.nextLine();
        }
    }
}