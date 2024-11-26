public class Calc {
    public static int run(String expr) {
        // 공백 제거, 덧셈|뺄셈 처리
        String[] exprBits = expr.split(" ");
        int result = 0;
        int currentNum = 0;
        String operation = "+";

        for (String bit : exprBits) {
            if (bit.equals("+") || bit.equals("-")) {
                operation = bit;
            } else {
                currentNum = Integer.parseInt(bit);
                if (operation.equals("+")) {
                    result += currentNum;
                } else if (operation.equals("-")) {
                    result -= currentNum;
                }
            }
        }
        return result;
    }
}