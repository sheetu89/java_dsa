package stacks;

import java.util.Stack;

public class infixToprefix {
     String infix = "9-5+3*4/6";  // Fixed: string should be in double quotes

        Stack<String> val = new Stack<>();      // Fixed: use Stack with capital "S"
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = infix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {   
              String s = ""+ ch;
              val.push(s);
            } else if (op.size() == 0) {
                op.push(ch);
            } else { 
                if (ch == '+' || ch == '-') {
                    int v2 = val.pop();
                    int v1 = val.pop();

                    if (op.peek() == '-') val.push(v1 - v2);
                    if (op.peek() == '+') val.push(v1 + v2);
                    if (op.peek() == '*') val.push(v1 * v2);
                    if (op.peek() == '/') val.push(v1 / v2);

                    op.pop();
                    op.push(ch);
                }

                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        int v2 = val.pop();
                        int v1 = val.pop();

                        if (op.peek() == '-') val.push(v1 - v2);
                        if (op.peek() == '+') val.push(v1 + v2);
                        if (op.peek() == '*') val.push(v1 * v2);
                        if (op.peek() == '/') val.push(v1 / v2);

                        op.pop();
                        op.push(ch);
                    } else {
                        op.push(ch);
                    }
                }
            }
        }

        // Final processing of remaining operator
        while (val.size() > 1) {
            int v2 = val.pop();
            int v1 = val.pop();

            if (op.peek() == '-') val.push(v1 - v2);
            if (op.peek() == '+') val.push(v1 + v2);
            if (op.peek() == '*') val.push(v1 * v2);
            if (op.peek() == '/') val.push(v1 / v2);

            op.pop();
        }

        System.out.println("Result: " + val.pop());
    
}
