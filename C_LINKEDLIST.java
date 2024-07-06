/**
 * C_LINKEDLIST
 */
public class C_LINKEDLIST {

    public Node head;
    public Node tail;

    public C_LINKEDLIST() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " --> ");
                node = node.next;
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int val){
          
    }

    public class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        C_LINKEDLIST list = new C_LINKEDLIST();
        list.insert(50);
        list.insert(40);
        list.insert(30);
        list.insert(20);
        list.insert(10);
        list.display();
    }
}