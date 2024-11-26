public class Calc {
    public static int run(String expr) {
        String[] tokens = expr.split(" ");
        // 초기값
        int result = 0;
        int currentNum = 0;
        String operation = "+";

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                operation = token;
            } else {
                currentNum = Integer.parseInt(token);
                switch (operation) {
                    case "+":
                        result += currentNum;
                        break;
                    case "-":
                        result -= currentNum;
                        break;
                    case "*":
                        result *= currentNum; // 초기값 0, 수정필요
                        break;
                    case "/":
                        result /= currentNum; // 초기값 0, 수정필요
                        break;
                }
            }
        }
        return result;
    }
}
