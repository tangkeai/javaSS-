public class Partition {

    public Node partition(Node head,int x) {
        Node cur = head;
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;

        while (cur != null) {
            if (cur.val < x) {
                if (bs == null) {
                    bs = cur;
                    be = cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                if (as == null) {
                    as = cur;
                    ae = cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        /*
        把链表串起来
        1.两个段内，可能有一个是空的
            如果as不等于空，ae.next = null
        2.如果两个段都有数据
            be.next = as
         */
        if (bs == null) {
            return as;
        }
        //bs != null;
        be.next = as;
        if (as != null) {
            ae.next = null;
        }
        return bs;
    }
}
