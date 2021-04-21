import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Function<int[], String> getCountStr =
                arr -> String.format("Count = %d", arr.length);
        System.out.println(getCountStr.apply(data));
        Function<int[], String> getSumString =
                arr -> {
                    return "Sum = " + Arrays.stream(arr).sum();
                };
        System.out.println(getSumString.apply(data));
    }
}
/*
        String[] data = scanner.nextLine().split(", ");
        int sum = Arrays.stream(data).mapToInt(Integer::valueOf).sum();
        System.out.println("Count = "+ data.length);
        System.out.println("Sum = "+sum);
        */