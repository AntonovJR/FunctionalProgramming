import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> data = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        Consumer<List<Integer>> print = list ->
        {
            for (int i = list.size()-1; i >=0 ; i--) {
                if(list.get(i)%n!=0){
                    System.out.print(list.get(i)+" ");
                }

            }
        };
        print.accept(data);
    }
}
