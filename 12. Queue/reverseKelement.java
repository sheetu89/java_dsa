package queue;
import java.util.*;

public class reverseKelement {
   
    public static void reverseFirstKElements(Queue<Integer> queue, int k) {
        Stack<Integer> stack = new Stack<>();
        // Step 1: Push first k elements into a stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        // Step 2: Enqueue back the stack elements (they are now reversed)
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Step 3: Move the remaining (n-k) elements to the back to maintain order
        int size = queue.size();
        for (int i = 0; i < size - k; i++) {
            queue.add(queue.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        int k = 3;

        System.out.println("Original Queue: " + queue);

        reverseFirstKElements(queue, k);

        System.out.println("Queue after reversing first " + k + " elements: " + queue);
    }
}
