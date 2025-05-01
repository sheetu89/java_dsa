// given an unsorted array of integers nums,return the length of the longest consecutive elements sequence 
import java.util.*;
public class longestConsecutiveQus {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxStreak = 1;
        for (int num : set) {
            if (!set.contains(num - 1)) { // Check if it's the start of a sequence
                int currNum = num;
                int currStreak = 1;
                while (set.contains(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }
                maxStreak = Math.max(maxStreak, currStreak);
            }
        }
        return maxStreak;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Length of longest consecutive sequence: " + longestConsecutive(nums)); // Output: 4

       
}
}
