import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String line = scanner.nextLine();
        while (!"Party!".equals(line)) {

            String[] commandTokens = line.split("\\s+");

            String command = commandTokens[0];
            String predicateType = commandTokens[1];
            String predicateArgument = commandTokens[2];

            if (command.equals("Remove")) {
                guests.removeIf(getPredicate(predicateType, predicateArgument));
            } else if (command.equals("Double")) {

                for (int i = 0; i < guests.size(); i++) {
                    String guest = guests.get(i);
                    if (getPredicate(predicateType, predicateArgument).test(guest)) {
                        guests.add(i++, guest);
                    }
                }
            }
            line = scanner.nextLine();
        }
        if (guests.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(guests);
            System.out.printf("%s are going to the party!%n", String.join(", ", guests));
        }
    }

    private static Predicate<String> getPredicate(String type, String parameter) {
        switch (type) {
            case "StartsWith":
                return text -> text.startsWith(parameter);
            case "EndsWith":
                return text -> text.endsWith(parameter);
            case "Length":
                return text -> text.length() == Integer.parseInt(parameter);
            default:
                return text -> false;
        }
    }
}