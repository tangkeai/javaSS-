public class HasCycle {
    public boolean hasCycle(Node head) {
        //可以一个走一步，一个走三步吗  走三步，四步可能会一直跳过
        Node fast = head;
        Node slow = head;
        while (fast != null &&fast.next != null) {
            fast = fast.next.next;
            slow =slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
