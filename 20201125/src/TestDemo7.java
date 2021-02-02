import java.util.Stack;

class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        char[] array = A.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (array[i] != '(' &&  array[i] != ')') {
                return false;
            }
            if (array[i] == '(') {
                stack.push(array[i]);
            }
            if (array[i] == ')') {
                if (stack.isEmpty()) {
                    return false;
                }else if (stack.peek()== '(') {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}

public class TestDemo7 {

    public static void main(String[] args) {
        Parenthesis parenthesis = new Parenthesis();
        System.out.println(parenthesis.chkParenthesis("(()))()", 6));
    }
}
