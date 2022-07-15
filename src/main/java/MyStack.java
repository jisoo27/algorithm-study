import java.util.ArrayList;

public class MyStack<T> {

    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size()-1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        MyStack<Integer> ms = new MyStack<Integer>();
        ms.push(3);
        ms.push(4);
        System.out.println(ms.pop());
    }
}
