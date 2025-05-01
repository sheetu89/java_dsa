import java.util.Stack;
import java.util.Scanner;
public class balancedBrackets {
    public static boolean isBalanced(String str) {
       import java.util.Stack;
import java.util.Scanner;

public class BalancedBrackets {
    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') { // Only process valid closing brackets
                if (st.isEmpty()) return false; // No matching opening bracket
                if (st.peek() == '(') st.pop(); // Matched pair, remove it
            }
        }
        return st.isEmpty(); // Stack should be empty for a balanced string
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with brackets: ");
        String str = sc.nextLine();
        System.out.println(isBalanced(str) ? "Balanced" : "Not Balanced");
        sc.close();
    }
}
 // Stack should be empty for a balanced string
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with brackets: ");
        String str = sc.nextLine();
        System.out.println(isBalanced(str) ? "Balanced" : "Not Balanced");
        sc.close();
    }
}
