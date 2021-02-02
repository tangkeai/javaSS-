import com.sun.jmx.snmp.SnmpOidDatabase;

class Node {
    public int data;
    public Node next;//存储对象的引用

    public Node(int data) {
        this.data = data;
        //这里没有初始化next的引用，不知道当前next指向哪个节点
    }
}

public class  MySingleList {
    public Node head;//定位头结点的引用

    //头插法
    public void addFirst(int data) {
        //1通过data构造一个Node对象
        Node node = new Node(data);
        int x = 10;
        //优化的话if语句可以不写
        if(this.head == null) {
            //第一次插入
            this.head = node;
            //node.data = data;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }

    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }


    public Node searchPrev(int index) {
        int count = 0;
        Node cur = this.head;
        while(count < index-1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    //任意位置插入，第一个数据结点为0号下标
    public void addIndex(int index,int data) {
        Node node = new Node(data);
        /*int count = 0;
        Node cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }*/
        if(index < 0 || index > size()) {
            System.out.println("插入不合法");
            return;
        }
        /*if(cur.next == null) {
            addFirst(data);
        }*/
        if(index == 0) {
            addFirst(data);
            return;
        }
        Node cur = searchPrev(index);
        //Node prev = searchPrev(index);
        node.next = cur.next;
        cur.next = node;
    }

    //得到单链表的长度
    public int size() {
        int count = 0;
        Node cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //找到关键字Key的前驱
    public Node searchPrevNode(int key) {
        Node cur = this.head;
        while(cur.next != null){
            if(cur.next.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        //退出循环，cur已近走到了链表的尾部
        return null;//没有key的前驱
    }
    //删除第一次出现关键字为key的结点
    public void remove(int key) {
        //1头结点
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        //2找需要删除节点的前驱
        Node prev = searchPrevNode(key);
        if(prev == null) {
            return;
        }
        Node del = prev.next;//就是要删除的结点的引用
        prev.next = del.next;
    }

}
