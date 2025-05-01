// you are given n distinct pairs.each pair is numberd from 1 to n.
// all pairs are initially put in a bag.you need to pair up each number.
// you take numbers one by one from the bagand for each number you look
//  whether the pair of this number has already been taken out of the bag,
//  or not. if not (that means the pair of this number from the pair aside
//  .print the maximum number of numbers that were on the table at the same time.
import java.util.*;
public class MaxNumbersOnTable {
    public static int maxOnTable(int[] arr) {
        Set<Integer> table = new HashSet<>();
        int maxCount = 0;

        for (int num : arr) {
            if (table.contains(num)) {
                table.remove(num); // Pair completed, remove
            } else {
                table.add(num); // First time seen, put on table
                maxCount = Math.max(maxCount, table.size());
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 3};
        System.out.println("Max numbers on table: " + maxOnTable(arr));
    }
}
