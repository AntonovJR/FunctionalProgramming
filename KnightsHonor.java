import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split("\\s+");
        Consumer<String[]> stringConsumer = list -> {
            for (String s : list) {
                System.out.println("Sir "+s);
            }
        };
        stringConsumer.accept(array);

    }
}
