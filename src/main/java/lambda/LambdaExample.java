package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static lambda.Color.GREEN;
import static lambda.Color.RED;

public class LambdaExample {

    public static List<Apple> filterApples(List<Apple> inventory, Color color, int weight, boolean flag) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if ((flag && apple.getColor().equals(color)) || (!flag && apple.getWeight() > weight)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(GREEN, 80), new Apple(RED, 100), new Apple(GREEN, 150));

        List<Apple> greenApples = filterApples(inventory, GREEN, 0, true);
        List<Apple> redApples = filterApples(inventory, null, 150, false);
    }
}
