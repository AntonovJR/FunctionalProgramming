import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::valueOf).toArray();
        Function<int[], Integer> function = list -> {
            int min = Integer.MAX_VALUE;
            for (int i : list) {
                if(i<min){
                    min = i;
                }

            }
            return min;
        };
        System.out.println(function.apply(numbers));
    }
}
