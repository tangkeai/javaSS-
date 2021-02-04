class Node {
    public int val;
    public Node prev;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class DoubleList {
    public Node head;
    public Node last;
    //头插法
    public void addFirst(int val) {
        Node node = new Node(val);
        if (this.head == null) {
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
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }
    public Node searchIndex(int index) {
        if (index < 0 || index > size()) {
            return null;
        }
        Node cur = this.head;
        while (index != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //任意插入
    public void addIndex(int index,int val) {
        if (index == 0) {
            addFirst(val);
            return;
        }
        if (index == size()) {
            addLast(val);
            return;
        }
        Node node = new Node(val);
        Node cur = searchIndex(index);
        if (cur == null) {
            return;
        }
        node.next = cur;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;


    }
    //查找是否包含关键字key在链表中
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //求长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    //打印
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    //删除第一次出现关键字为key的节点
    //返回值代表你要删除的数字
    public void remove(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                //头节点为key
                if (this.head.val == key) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        //当前cur不是尾节点
                        cur.next.prev = cur.prev;
                    }else {
                        //当前节点是尾节点
                        this.last = this.last.prev;
                    }
                }
                return;
            }
            cur = cur.next;
        }
    }

    public void removeAll(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                //头节点为key
                if (this.head.val == key) {
                    this.head = this.head.next;
                    if (this.head.next == null) {
                        this.head = null;
                        return;
                    }
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        //当前cur不是尾节点
                        cur.next.prev = cur.prev;
                    } else {
                        //当前节点是尾节点
                        this.last = this.last.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }
    //清除
    public void clear() {
        this.head = null;
        this.last = null;
    }


    public static void main(String[] args) {
        DoubleList doubleList = new DoubleList();
        doubleList.addLast(2);
        doubleList.addLast(2);
        doubleList.addLast(2);
       /* doubleList.addIndex(3,99);
        doubleList.addFirst(88);*/
        doubleList.display();
        doubleList.clear();
        System.out.println("iuytr");
        doubleList.display();
    }
}
