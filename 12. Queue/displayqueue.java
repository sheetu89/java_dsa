package queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
public class displayqueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // rear -> 5 4 3 2 1  -> front
        Queue<Integer> helper = new ArrayDeque<>();
        while(q.size()>0){
            System.out.println(q.peek());
            helper.add(q.poll());
        }
        while(helper.size()>0){
            q.add(helper.poll());
        }








    }
    
}
