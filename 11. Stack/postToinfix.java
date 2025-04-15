package stacks;

import java.util.Stack;

public class postToinfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> val = new Stack<>();  // Use Stack<String> instead of Stack<Integer>

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {  // check if ch is a digit
                val.push(ch + "");  // convert char to string and push
            } else {
                String v2 = val.pop();
                String v1 = val.pop();
                String t = "(" + v1 + ch + v2 + ")";
                val.push(t);
            }
        }

        System.out.println(val.peek());
    }
}

