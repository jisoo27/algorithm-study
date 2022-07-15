public class DoubleLinkedList<T> {
    public Node<T> head = null;
    public Node<T> tail = null;

    public class Node<T> {
        T data;
        Node<T> prev = null;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (this.head == null) {
            this.head = new Node<T>(data);
            this.tail = this.head; // 일단 데이터가 하나기 때문에 tail에도 head와 같은 데이터를 넣어준다.
        } else {
            Node<T> node = this.head;
            while (node.next != null) { // node.next == null 이라는것은 마지막 노드라는 것
                node = node.next;
            }
            node.next = new Node<T>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll() {
        if (this.head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public T serarchFromHead(T isData) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    public T searchFromTail(T isData) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.tail;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.prev;
                }
            }
            return null;
        }
    }


}


class Application {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> myLinkedList = new DoubleLinkedList<>();
        myLinkedList.addNode(2);
        myLinkedList.addNode(4);
        myLinkedList.addNode(6);
        myLinkedList.addNode(8);
        myLinkedList.addNode(3);

        myLinkedList.printAll();

        System.out.println("---------");

        System.out.println(myLinkedList.serarchFromHead(2));
        System.out.println(myLinkedList.searchFromTail(2));
        System.out.println(myLinkedList.searchFromTail(9));


    }
}