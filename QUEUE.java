import java.util.*;

public class QUEUE {

    public static void main(String[] args) {
        // Queue q = new Queue(5);
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
