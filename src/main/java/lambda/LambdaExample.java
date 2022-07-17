package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static lambda.Color.GREEN;
import static lambda.Color.RED;

public class LambdaExample {

    public static List<Apple> filterGreenApples(List<Apple> inventory, Color color) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(GREEN), new Apple(RED), new Apple(GREEN));

        List<Apple> grrenApples = filterGreenApples(inventory, GREEN);
        List<Apple> RedApples = filterGreenApples(inventory, RED);
    }
}
