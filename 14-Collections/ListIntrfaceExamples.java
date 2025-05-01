// Java Collection Framework - List Interface Examples
// List Interface is a part of the Java Collection Framework and is used to store ordered collections of elements.
import java.util.*;

public class ListInetrfaceExamples {
    static void ArrayListExamples(){
        // ArrayList is a resizable array implementation of the List interface.
        // It allows duplicate elements and maintains insertion order.  
        ArrayList<Integer> l = new ArrayList<>();
        // same as in LinkedList
        // LinkedList<Integer> l = new LinkedList<>();
        // Vector<Integer> l = new Vector<>();
        // CopyOnWriteArrayList<Integer> l = new CopyOnWriteArrayList<>();

        l.add(1);
        l.add(2);
        l.add(3);   
        System.out.println(l); // [1, 2, 3]
        System.out.println(l.get(1)); // 2
        l.set(1, 10); // set value at index 1 to 10
        System.out.println(l); // [1, 10, 3]
        System.out.println(l.size()); // 3
        l.remove(1); // remove element at index 1
        System.out.println(l); // [1, 3]
        System.out.println(l.contains(3)); // true
        System.out.println(l.indexOf(3)); // 1
    }


    static void StackExamples(){
        // Stack is a last-in-first-out (LIFO) data structure.
        Stack<String> st = new Stack<>();
        st.push("A");
        st.push("B");
        st.push("C");
        System.out.println(st); // [A, B, C]
        System.out.println(st.peek()); // C
        System.out.println(st.pop()); // C
        System.out.println(st); // [A, B]
        System.out.println(st.isEmpty()); // false

       
    }   public static void main(String[] args) {
        ArrayListExamples();
        // LinkedListExamples();
        // VectorExamples();
        // StackExamples();
        // CopyOnWriteArrayListExamples();
    }
}
