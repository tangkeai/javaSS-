

class Node {
    public int val;
    public Node next;
    public Node prev;
    public Node(int val) {
        this.val = val;
    }

}

public class DoubleList {
    Node head = new Node(-1);
    Node cur = this.head;


    //尾插法
    public void addLast(int val) {
        Node node = new Node(val);
        cur.next = node;
        node.prev = cur;
        cur = node;
    }

   /* //头插法
   //有错
    public void addFirst(int val) {
        Node node = new Node(val);
        Node cur = this.head;

        if (cur.next == null) {
            cur.next = node;
            node.prev = cur;
        }else {
            cur.next = node;
            node.next = cur.next;
            node.prev = cur;
            cur.next.prev = node;
        }
    }
*/
    //求长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //查找是否包含关键字key
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除key
    public void remove(int key) {
        Node cur = this.head.next;
        while (cur != null) {
            if(cur.val == key) {
                cur.prev.next = cur.next;
                if(cur.next != null) {
                    cur.next.prev = cur.prev;
                }else {
                    cur.prev = null;
                }
                return;
            }
            cur = cur.next;
        }
    }

    //打印函数
    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.val+ " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
