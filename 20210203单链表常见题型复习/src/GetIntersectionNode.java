public class GetIntersectionNode {
    public Node getIntersectionNode(Node headA,Node headB) {
        if (headA == null || headB == null) {
            return null;
        }
        //1.求两个单链表的长度
        Node pL = headA;
        Node pS = headB;
        int lenA = 0;
        while (pL != null) {
            lenA++;
            pL = pL.next;
        }
        int lenB = 0;
        while (pS != null) {
            lenB++;
            pS = pS.next;
        }
        int len = lenA-lenB;
        pL = headA;
        pS = headB;
        if (len < 0) {
            pL = headB;
            pS = headA;
            len = lenB - lenA;
        }
        while (len > 0) {
            pL = pL.next;
            len--;
        }
        while (pL != pS && pL != null && pS != null) {
            pL = pL.next;
            pS = pS.next;
        }
        if (pL == null || pS == null) {
            return null;
        }
        return pL;
    }
}
