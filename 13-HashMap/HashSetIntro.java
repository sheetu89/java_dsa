// HashSet Example in Java
import java.util.HashSet;

public class HashSetIntro{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);  // Duplicate, will be ignored

        // Displaying elements
        System.out.println(set); // Output: [20, 10, 30] (order may vary)

        // Checking for an element
        System.out.println(set.contains(20));  // true
        System.out.println(set.contains(40));  // false

        // Removing an element
        set.remove(10);

        // Size
        System.out.println("Size: " + set.size());

        // Iterating over elements
        for (int num : set) {
            System.out.println(num);
        }
    }
}
