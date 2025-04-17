// Java Collection Framework - List Interface Examples
import java.util.*;
public class Example {
    public static void main(String[] args) {
        // Step 1: Declare an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Step 2: Add elements to it
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Step 3: Display all elements
        System.out.println("Original List:");
        for (String item : list) {
            System.out.println(item);
        }

        // Step 4: Remove the third element (index 2)
        if (list.size() >= 3) {
            list.remove(2);
        }

        // Step 5: Display the final elements
        System.out.println("\nList after removing the third element:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}

    
