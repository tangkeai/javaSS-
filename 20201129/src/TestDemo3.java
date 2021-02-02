import java.util.Stack;
class Solution1 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    public int pop() {
        if (stack2.isEmpty()) {
            System.out.println("队列为空");
            return -1;
        }
        return stack2.pop();
    }
}


public class TestDemo3 {
    public static void main(String[] args) {

    }
}
