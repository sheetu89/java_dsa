package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 8; i++) {
            q.add(i);
        }
        System.out.println("Original queue: " + q);

        Stack<Integer> st = new Stack<>();

        // Step 1: Push first half of the queue into the stack
        int size = q.size();
        for (int i = 0; i < size / 2; i++) {
            st.push(q.remove());
        }

        // Step 2: Enqueue back the stack elements
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 3: Move the first half to the back to bring the original second half to front
        for (int i = 0; i < size / 2; i++) {
            q.add(q.remove());
        }

        // Step 4: Push first half into the stack again
        for (int i = 0; i < size / 2; i++) {
            st.push(q.remove());
        }

        // Step 5: Interleave the elements from the stack and queue
        while (!st.isEmpty()) {
            q.add(st.pop());
            q.add(q.remove());
        }

        System.out.println("Reordered queue: " + q);
    }
}
