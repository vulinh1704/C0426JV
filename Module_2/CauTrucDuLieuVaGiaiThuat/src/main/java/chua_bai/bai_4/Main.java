package chua_bai.bai_4;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "{()}";
        System.out.println(checkValidation(str));
    }

    public static boolean checkValidation(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            }

            // Với chuỗi đóng sẽ kiểm xem đối xứng hay không của dấu gần nhất
            if (ch == '}') {
                char item = stack.pop();
                if (item != '{') return false;
            }

            if (ch == ')') {
                char item = stack.pop();
                if (item != '(') return false;
            }

            if (ch == ']') {
                char item = stack.pop();
                if (item != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}
