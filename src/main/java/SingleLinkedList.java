public class SingleLinkedList<T> {
    public Node<T> head = null; // 최초 생성할 때 node가 null

    public class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) { // 끝의 node까지 가게 만드는것이 이 while 구문이 하는 일
                node = node.next; // 현재 node를 그 다음 next로 바꿔라
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }


    public Node<T> search(T data) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == data) {
                    return node;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    public void addNodeInside(T data, T isData) { // T data : 내가 가진 데이터 , T isData : 그 앞 노드가 가지고 있는 데이터
        Node<T> serchedNode = this.search(isData);

        if (serchedNode == null) {
            this.addNode(data);
        } else {
            Node<T> nextNode = serchedNode.next;
            serchedNode.next = new Node<T>(data);
            serchedNode.next.next = nextNode;
        }
    }

    public boolean delNode(T isData) {
        if (this.head == null) {
            return false;
        } else {
            Node<T> node = this.head;
            if (node.data == isData) {
                this.head = this.head.next;
                return true;
            } else {
                while (node.next != null) {
                    if (node.next.data == isData) {
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }

}

class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> myLinkedList = new SingleLinkedList<>();
        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);
        myLinkedList.addNode(4);
        myLinkedList.addNode(5);
        myLinkedList.printAll();

        System.out.println("-------------------");

        myLinkedList.delNode(3);
        myLinkedList.printAll();

    }
}
