
import java.util.Scanner;


public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }


    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode newHead = null;
        ListNode headA = list1;
        ListNode headB = list2;
        ListNode tmp = newHead;
        if(list1 == null && list2 == null) {
            return null;
        }

        while (headA != null && headB != null) {
            if(headA.val < headB.val) {
                if(newHead == null) {
                    newHead = headA;
                    headA = headA.next;
                    tmp = newHead;
                }else {
                    tmp.next = headA;
                    headA = headA.next;
                    tmp = tmp.next;
                }
            }else {
                if(newHead == null) {
                    newHead = headB;
                    headB = headB.next;
                    tmp = newHead;
                }else {
                    tmp.next = headB;
                    headB = headB.next;
                    tmp = tmp.next;
                }
            }
        }
        if(headA != null && headB == null) {
            tmp.next = headA;
            return newHead;
        }else {
            tmp.next = headB;
            return newHead;
        }
    }
}





/*
public class TestDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if(str.length() > 100) {
            return;
        }
        char[] arry = str.toCharArray();

        for (int i = 0; i < str.length() - 1; i++) {
        }
    }

}
*/
