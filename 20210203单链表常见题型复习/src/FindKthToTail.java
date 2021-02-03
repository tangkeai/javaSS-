public class FindKthToTail {

    public Node findKthTail(Node head,int k) {
        if (k <= 0 || head == null) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        while (k-1 > 0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            }else {
                System.out.println("没有这个节点");
                return null;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
