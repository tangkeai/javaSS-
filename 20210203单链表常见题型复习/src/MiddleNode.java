public class MiddleNode {
    public Node middleNode(Node head) {
        Node fast = head;
        Node slow = head;
        //while里面的条件不可以
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
