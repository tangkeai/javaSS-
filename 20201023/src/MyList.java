
/*
  作业标题
  链表开始入环的第一个节点

  作业内容
  给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
   */





    /*
    作业标题
    给定一个链表，判断链表中是否有环

    作业内容
    给定一个链表，判断链表中是否有环
    */



    /*

作业标题
输入两个链表，找出它们的第一个公共结点

作业内容
输入两个链表，找出它们的第一个公共结点
     */



    /*

作业标题
链表的回文结构

作业内容
链表的回文结构
     */


    /*
    删除链表重复节点

作业内容
在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
     */

class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
    }
}

class MyList {
    public Node head;

    //头插法
    public void addFirst(int data) {
        //通过data创建一个Node对象
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }

    }



    //打印链表
    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data+ " ");
            cur = cur.next;
        }
        System.out.println();
    }


    //尾插法
    public void addLast(int data) {
        Node cur = this.head;
        Node node = new Node(data);
        //第一次插入
        if(this.head == null) {
            this.head = node;
            return;
        }
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }


    public void removeAll(int key) {
        Node prev = this.head;
        Node cur = this.head.next;
        while(cur != null) {
            if(cur.data == key) {
                prev.next = cur.next;
                //cur = cur.next;
            }else {
                //cur = cur.next;
                prev = prev.next;
            }
            cur = cur.next;
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }


    public void clear() {
        this.head = null;
    }



    /*
  作业标题
  链表开始入环的第一个节点

  作业内容
  给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
   */


}

