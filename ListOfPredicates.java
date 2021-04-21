import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOfPredicates {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> arr = IntStream.rangeClosed(1,n).boxed().collect(Collectors.toList());


        Integer[] divisors = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Predicate<Integer> check = (i) -> {
            for (Integer a : divisors) {
                if (a == 0)
                    continue;
                if (i % a != 0)
                    return false;
            }
            return true;
        };

        for (Integer i : arr)
            if (check.test(i))
                System.out.printf("%d ", i);
    }
}