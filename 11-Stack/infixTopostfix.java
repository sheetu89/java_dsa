package stacks;
import java.util.Stack;
 public class infixTopostfix{
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        // 9-(5+3)*4/6;
        // 953*4*6/-

        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                val.push(ch + "");  // Push digit as string
            } else if (op.isEmpty()) {
                op.push(ch);
            } else {
                if (ch == '+' || ch == '-') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t =v1 + v2+ o;
                    val.push(t);
                    op.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/')) {
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t =v1 + v2+ o;
                        val.push(t);
                    }
                    op.push(ch);
                }
            }
        }

        // Final remaining operations
        while (!op.isEmpty()) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = v1 + v2+ o;
            val.push(t);
        }

        System.out.println("Postfix: " + val.pop());
    }
}

