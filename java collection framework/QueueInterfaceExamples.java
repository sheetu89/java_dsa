// Java Collection Framework - Queue Interface Examples
// Queue Interface is a part of the Java Collection Framework and is used to store elements in a FIFO (First In First Out) order.
// It is a subinterface of the Collection interface and provides methods for adding, removing, and inspecting elements in the queue.
// The Queue interface is implemented by several classes in the Java Collection Framework, including LinkedList, PriorityQueue, and ArrayDeque.
// The Queue interface provides methods such as offer(), poll(), peek(), and remove() to manipulate the elements in the queue.
// The Queue interface is commonly used in scenarios where elements need to be processed in the order they were added, such as in task scheduling, breadth-first search algorithms, and producer-consumer problems.
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class QueueInterfaceExamples {
    static void dequeueExamples(){
        // Deque is a double-ended queue that allows insertion and removal of elements from both ends.
        // It can be used as a stack or a queue.
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1); // add 1 to the front of the deque
        dq.addLast(2); // add 2 to the back of the deque

        dq.addFirst(3); // add 3 to the front of the deque
        dq.addLast(4); // add 4 to the back of the deque
        System.out.println(dq); // [3, 1, 2, 4]
        System.out.println(dq.pollFirst()); // 3 (removes and returns the first element)
        System.out.println(dq); // [1, 2, 4]
        System.out.println(dq.pollLast()); // 4 (removes and returns the last element)
        System.out.println(dq); // [1, 2]
        System.out.println(dq.peekFirst()); // 1 (returns the first element without removing it)
        System.out.println(dq.peekLast()); // 2 (returns the last element without removing it)
        System.out.println(dq); // [1, 2]
        System.out.println(dq.size()); // 2 (size of the deque)
        

    }
    static void PriorityQueueExamples(){
         // PriorityQueue is a queue that orders its elements based on their natural ordering or by a comparator provided at queue construction time.
        // It does not allow null elements and does not guarantee the order of elements with equal priority.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // reverse order comparator
        pq.offer(3); // add 3 to the queue
        pq.offer(1); // add 1 to the queue
        pq.offer(2); // add 2 to the queue
        System.out.println(pq); // [1, 3, 2] (elements are ordered based on their natural ordering)
        System.out.println(pq.peek()); // 1 (head of the queue)
        System.out.println(pq);
        System.out.println(pq.poll()); // 1 (removes and returns the head of the queue)
        System.out.println(pq); // [2, 3]
    }
    static void QueueExamples(){
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1); // add 1 to the queue
        q.offer(2); // add 2 to the queue
        q.offer(3); // add 3 to the queue
        System.out.println(q); // [1, 2, 3]
        System.out.println(q.peek()); // 1 (head of the queue)
        System.out.println(q.poll()); // 1 (removes and returns the head of the queue)
        System.out.println(q); // [2, 3]
        System.out.println(q.size()); // 2 (size of the queue)
        System.out.println(q.isEmpty()); // false (checks if the queue is empty)
        q.remove(1); // remove element at index 1 (removes 3)
        System.out.println(q); // [2]
        q.clear(); // clear the queue
        System.out.println(q); // [] (queue is empty)
        }  
    public static void main(String[] args) {
        QueueExamples();
        PriorityQueueExamples();

    
}
}