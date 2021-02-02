


public class TestDemo {

    public static Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while (headA != null && headB != null) {
            if(headA.data < headB.data) {
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            }else {
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
        }
        if(headA != null) {
            tmp.next = headA;
        }else {
            tmp.next = headB;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        MySingleList mySingleList1 = new MySingleList();
        MySingleList mySingleList2 = new MySingleList();
        mySingleList1.addLast(1);
        mySingleList1.addLast(22);
        mySingleList1.addLast(31);
        mySingleList1.addLast(45);
        mySingleList1.addLast(65);
        mySingleList2.addLast(2);
        mySingleList2.addLast(12);
        mySingleList2.addLast(32);
        mySingleList2.addLast(41);
        mySingleList1.display();
        mySingleList2.display();
        Node rst1 = mergeTwoLists(mySingleList1.head,mySingleList2.head);
        mySingleList1.display1(rst1);
    }

   /* public static void main1(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(1);
        mySingleList.addLast(2);
        mySingleList.addLast(3);
        mySingleList.addLast(4);
        mySingleList.addLast(5);
        mySingleList.display();
        Node rst = mySingleList.reverseList();
        mySingleList.display1();
        Node rst1 = mySingleList.middleList();
        mySingleList.display1();
        //mySingleList.addIndex(5,88);
        //mySingleList.display();
        //mySingleList.remove(3);
        //mySingleList.display();

    }*/
}
