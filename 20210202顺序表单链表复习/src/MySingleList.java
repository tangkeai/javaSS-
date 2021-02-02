

class Node {
    public int data;
    public Node next;

    public Node (int data) {
        this.data = data;
        //这里没有初始化next的引用时，不知道next当前指向哪个
        //结点
    }
}

public class MySingleList {
    public Node head;//作用是定义  头结点的引用
    //头插法
    public void addFirst(int data) {
        Node node= new Node(data);
        //优化后if可以不写
        if (this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }
    //尾插法
    public void addLast(int data) {
        Node cur = this.head;
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        while (cur.next != null) {
            cur =cur.next;
        }
        cur.next = node;
    }

    public Node searchPrev(int index) {
        int count = 0;
        Node cur = this.head;
        while (count < index-1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }
    //任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        Node node = new Node(data);
        if (index < 0 || index > size()) {
            System.out.println("index不合法");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node cur = searchPrev(index);
        node.next = cur.next;
        cur.next = node;
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
           System.out.print(cur.data+" ");
           cur = cur.next;
       }
        System.out.println();
    }
    //查找是否包含关键字key
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public Node searchPrevNode(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        //退出循环，cur已经走到了链表的尾部
        return null;//代表没有key的前驱
    }
    //删除第一次出现关键字key的值
    public void remove(int key) {
        //1.删除头节点
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        //2.找到需要删除的节点
        Node prev = searchPrevNode(key);
        if (prev == null) {
            return;
        }
        Node del = prev.next;//要删除结点的引用
        prev.next = del.next;
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = prev.next;
        while (cur != null) {
            if (cur.data == key) {
                prev.next = cur.next;
                //cur = cur.next;
            }else {
                prev = prev.next;
                //cur = cur.next;
            }
            cur = cur.next;
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }
    //删除所有节点
    public void clear() {
        this.head = null;
    }
}

