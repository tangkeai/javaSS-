public class ChkPalindrome {
    public boolean chkPalindrome(Node head) {
        if (head == null) {
            return false;
        }
        //只有一个结点的时候也是回文的
        if (head.next == null) {
            return true;
        }
        //1.找到中间位置
        Node pHead = head;
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //slow就是中间位置，开始进行第二步，进行翻转
        Node cur = slow.next;
        while (cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //3.开始判断
        while (pHead != slow) {
            if (pHead.val != slow.val) {
                return false;
            }
            if (pHead.next == slow) {
                //偶数情况下
                return true;
            }
            pHead = pHead.next;
            slow = slow.next;
        }
        return true;
    }
}
