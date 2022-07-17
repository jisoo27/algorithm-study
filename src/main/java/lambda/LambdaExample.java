package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static lambda.Color.GREEN;
import static lambda.Color.RED;

public class LambdaExample {

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();

        for (T e : list) {
            if (p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(GREEN, 80), new Apple(RED, 100), new Apple(GREEN, 150));
        List<Integer> numbers = Arrays.asList(2, 4, 5, 7, 9);

        List<Apple> redApples = filter(inventory, (Apple apple) -> RED.equals(apple.getColor()));
        List<Integer> evenNumbers = filter(numbers, (Integer i) -> i % 2 == 0);
    }
}
