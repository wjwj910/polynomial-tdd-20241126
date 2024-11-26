import java.util.Stack;


public class Calc {
    public static int run(String expr) {
        Stack<Integer> stack = new Stack<>();
        int currentNum = 0;
        char operation = '+';
        expr = expr.replaceAll(" ", "");

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (Character.isDigit(ch)) {
                currentNum = currentNum * 10 + (ch - '0');
            }

            if (ch == '(') {
                int j = i, count = 0;
                while (i < expr.length()) {
                    if (expr.charAt(i) == '(') count++;
                    if (expr.charAt(i) == ')') count--;
                    if (count == 0) break;
                    i++;
                }
                currentNum = run(expr.substring(j + 1, i));
            }

            if (i == expr.length() - 1 || "+-*/".indexOf(ch) != -1) {
                switch (operation) {
                    case '+':
                        stack.push(currentNum);
                        break;
                    case '-':
                        stack.push(-currentNum);
                        break;
                    case '*':
                        stack.push(stack.pop() * currentNum);
                        break;
                    case '/':
                        stack.push(stack.pop() / currentNum);
                        break;
                }
                operation = ch;
                currentNum = 0;
            }
        }

        int result = 0;
        for (int num : stack) {
            result += num;
        }
        return result;
    }
}