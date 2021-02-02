

class ListNode {
    int val;
    public ListNode prev;
    public ListNode next;

    public ListNode (int val) {
        this.val = val;
    }
}

public class DoubleList {
    public ListNode last;
    public ListNode head;

    //头插法
    public void addFirst(int val) {
        ListNode node = new ListNode(val);
        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int val) {
        ListNode node = new ListNode(val);
            if(this.head == null) {
                this.head = node;
                this.last = node;
            }else {
                this.last.next = node;
                node.prev = this.last;
                this.last = node;
            }
    }

    //
    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //求长度
    public int size() {
        ListNode cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur =cur.next;
        }
        return count;
    }

    //查找是否包含关键字key的元素
    public boolean contains(int key) {
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //任意插入元素
    public void addIndex(int index,int val) {
        ListNode cur = this.head;
        if(index < 0 || index > size()) {
            return;
        }
        if(index == 0) {
            addFirst(val);
            return;
        }
        if (index == size()) {
            addLast(val);
            return;
        }
        ListNode node = new ListNode(val);
        while (index > 0) {
            index--;
            cur = cur.next;
        }
        node.next = cur;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
    }
}
