package queue;
import java.util.*;
import java.util.LinkedList;
public class basicSTL {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.size());
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.size());


        // print all the elements in given queue only using add(),remove(),peek(),size() & extra space
        


    }
}
