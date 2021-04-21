import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Predicate<String> isUppperCase = word -> Character.isUpperCase(word.charAt(0));
        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(isUppperCase)
                .collect(Collectors.toList());
        System.out.println(list.size());
        System.out.println(list.stream().collect(Collectors.joining(System.lineSeparator())));

    }
}
