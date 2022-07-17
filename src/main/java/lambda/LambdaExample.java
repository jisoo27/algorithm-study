package lambda;

import java.util.ArrayList;
import java.util.List;

import static lambda.Color.GREEN;

public class LambdaExample {

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }
}
