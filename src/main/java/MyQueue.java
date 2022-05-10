
import java.util.ArrayList;

public class MyQueue<T> {

    private final ArrayList<T> queue = new ArrayList<>();

    public void enqueue(T t) {
        queue.add(t);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }


    public static void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<Integer>();

        mq.enqueue(3);
        mq.enqueue(4);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
    }
}
