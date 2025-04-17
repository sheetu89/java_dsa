// set is a collection that does not allow duplicate elements and does not guarantee any specific order of elements. It is part of the Java Collection Framework and is implemented by various classes such as HashSet, LinkedHashSet, and TreeSet. The Set interface extends the Collection interface and provides additional methods for set operations.
// The Set interface is commonly used in scenarios where uniqueness of elements is required, such as in mathematical set operations, filtering duplicates from a collection, and maintaining a collection of unique items.
// The Set interface provides methods such as add(), remove(), contains(), and size() to manipulate the elements in the set.
// The HashSet class is the most commonly used implementation of the Set interface. It uses a hash table to store elements and provides constant time performance for basic operations such as add, remove, and contains. However, it does not guarantee any specific order of elements.

import java.util.HashSet;
import java.util.LinkedHashSet;
public class SetInterfaceExamples {

    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();
        // LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        st.add(1); // duplicate element, will not be added
        st.add(6);
        System.out.println(st); // [1, 2, 3, 4, 5, 6] (order may vary)  
        st.remove(3); // remove element 3
        System.out.println(st); // [1, 2, 4, 5, 6] (order may vary)
        System.out.println(st.size()); // 5 (size of the set)



    }

    
}
