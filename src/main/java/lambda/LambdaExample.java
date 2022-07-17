package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static lambda.Color.GREEN;
import static lambda.Color.RED;

public class LambdaExample {

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (p.test(apple)) { // predicate 객체로 사과 검사 조건을 캡슐화
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(GREEN, 80), new Apple(RED, 100), new Apple(GREEN, 150));
        List<Apple> result = filterApples(inventory, (Apple apple) -> RED.equals(apple.getColor()));

    }
}
