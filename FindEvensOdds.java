import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FindEvensOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::valueOf).toArray();
        String command = scanner.nextLine();
        switch (command){
            case "odd":
        IntStream.rangeClosed(tokens[0],tokens[1])
                .filter(n-> n%2!=0)
                .forEach(n-> System.out.print(n+" "));
        break;
            case "even":
                IntStream.rangeClosed(tokens[0],tokens[1])
                        .filter(n-> n%2==0)
                        .forEach(n-> System.out.print(n+" "));
                break;

        }
    }
}
