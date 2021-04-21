import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> data = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>, Integer> function = list -> {
            int min = Integer.MAX_VALUE;
            Integer num = null;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) <= min) {
                    min = list.get(i);
                    num = i;
                }

            }
            return num;
        };
        System.out.println(function.apply(data));
    }
}
