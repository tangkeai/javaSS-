

public class Reverse {
    public Node reverseList(Node head) {
        Node newHead = null;
        Node cur = head;
        Node prev = null;
        while (cur != null) {
            Node curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
}
