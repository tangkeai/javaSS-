import java.util.Stack;
class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        if (stack2.isEmpty()) {
            System.out.println("队列为空");
            return -1;
        }
        return stack2.pop();
    }
}

public class TsetDemo2 {
    public static void main(String[] args) {
        Solution queue = new Solution();
        queue.push(1);
        System.out.println(queue.pop());
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.pop());
        queue.push(5);
        System.out.println(queue.pop());
    }
}
