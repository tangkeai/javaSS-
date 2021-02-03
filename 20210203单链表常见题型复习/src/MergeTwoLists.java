public class MergeTwoLists {

    public Node mergeTwoLists(Node headA,Node headB) {
        Node newHead = new Node(-1);//创建一个傀儡节点
        Node tmp = newHead;
        while (headA != null && headB != null) {
            if (headA.val < headB.val) {
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            }else {
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
        }
        if (headA != null) {
            tmp.next = headA;
        }else {
            tmp.next = headB;
        }
        return newHead.next;
    }
}
