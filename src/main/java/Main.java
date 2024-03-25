import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> fruits = List.of("Apple", "Banana", "Cherry", "Cucumber", "Raspberry", "Strawberry", "Watermelon", "Pineapple", "Kiwi", "Grape");


        System.out.println("Loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Stream:");
        fruits.stream()
                .forEach((fruit) -> {
                    System.out.println(fruit);
                });

        fruits.stream()
                .map((f) -> new Termin(f, Weekday.MONDAY))
                .map(termin -> termin.toString())
                .forEach(length -> {
                    System.out.println(length);
                });

        List<String> result = fruits.stream()
                .filter(f -> f.length() > 5 && f.length() < 10)
                .map(f -> f.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(fruits);
        System.out.println(result);


        int sum = fruits.stream()
                .map(fruit -> fruit.length())
                .sorted((a, b) -> {
                    if (a > b) {
                        return a;
                    } else return b;
                })
                .reduce(0, (prevResult, currentElement) -> {
                    return prevResult + currentElement;
                });

        System.out.println(sum);


        System.out.println(fruits.stream()
                .reduce(":!:", (f1, f2) -> {
                    return f1 + f2;
                }));

    }
}
