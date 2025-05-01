package queue;
import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer>dq = new LinkedList<>();
        // add,remove/poll/element
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);

    }
}
