class Node {
    public int data;
    public Node next;//存储对象引用


    public Node(int data) {
        this.data = data;
        //这里没有初始化next的引用是，不知道next当前指向那个
        //节点
    }
}
public class MySingleList {
    public Node head;//作用是，定位头节点的引用
    Node newHead = null;
    //头插法
    public void addFirst(int data) {
        //1、通过data构造一个Node对象
        Node node = new Node(data);
        //2、
        if(this.head == null) {
            //第一次插入
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }
    //尾插法
    public void addLast(int data){
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

    /**
     * 找到index-1位置的节点
     * @param index
     * @return
     */
    public Node searchPrev(int index) {
        int count = 0;
        Node cur = this.head;
        while (count < index-1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        Node node = new Node(data);
        if(index < 0 || index > size()) {
            System.out.println("index不合法");
            return;
        }
        if(index == 0) {
            addFirst(data);
            return;
        }
        Node cur = searchPrev(index);
        node.next = cur.next;
        cur.next = node;
    }
    //得到单链表的长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * 找到关键字Key的前驱
     * @param key
     * @return
     */
    public Node searchPrevNode(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if(cur.next.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        //退出循环，cur已经走到了链表的尾部
        return null;//没有key的前驱
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        //1、头节点
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        //2、找需要删除节点的前驱
        Node prev = searchPrevNode(key);
        if(prev == null) {
            return;
        }
        Node del = prev.next;//就是要删除的节点的引用
        prev.next = del.next;
    }


    //删除所有值为key的节点
    public void removeAllKey(int key) {

    }
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void display1(Node newHead) {
        Node cur = newHead;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }


    //反转单链表
    //测试重新写一个display函数
    public Node reverseList() {
        Node cur = this.head;
        Node prev = null;
        newHead = null;
        while(cur != null) {
            Node curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }

    public Node middleList() {
        Node fast = this.head;
        Node slow = this.head;
        //判断条件不能空
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return  slow;
    }
    
    public Node findKthToTail(int k) {
        /*if(k <= 0 || k> size()) {
            System.out.println("查询位置不合法");
            return null;
        }*/
        if(k <= 0 || head == null) {
            //System.out.println("没有这个节点");
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        /*k = k-1;
        while(k != 0) {
            fast = fast.next;
            k--;
        }*/
        while(k-1 > 0) {
            if(fast.next != null) {
                fast = fast.next;
                k--;
            }
            else {
                System.out.println("没有这个节点");
                return null;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    /*public Node partition(int x) {
        Node beginstart = null;
        Node beginend = null;
        Node afterstart = null;
        Node afterend = null;
        Node cur = this.head;

        while (cur != null) {
            if(cur.data < x) {
                if(beginstart == null) {
                    beginstart = cur;
                    beginend = cur;
                }else {
                    beginend.next = cur;
                }
            }else {
                if(afterstart == null) {
                    afterstart = cur;
                    afterend = cur;
                }else {
                    afterend = cur.next;
                }
            }
            cur = cur.next;
        }
        if(beginstart == null || afterstart == null) {
            return this.head;
        }else {
            beginend = afterstart.next;
            afterend = null;
            return beginstart;
        }
    }*/

    public Node partition(int x) {
        Node cur = this.head;
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        while(cur != null) {
            if(cur.data < x) {
                if(bs == null) {
                    bs = cur;
                    be = cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                if(as == null) {
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
        * 1,两个段内 可能有一个是空的 如果as不为空， ae.next = null;
        * 2,如果两个字段都有数据  be.next = as;
        * */
        if(bs == null || as == null) {
            return newHead;
        }else {
            be.next = as;
            ae.next = null;
            return bs;
        }
    }

    public Node deleteDuplication() {
        Node cur = this.head;
        //创建一个傀儡结点
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while (cur != null) {
            //如果不加上cur.next != null，会出现空指针异常情况
            if(cur.next != null && cur.data == cur.next.data) {
                //如果不加上cur.next != null，会出现空指针异常情况
                while(cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }

    //判断是否为回文
    //修改前代码
    /*public boolean chkPalindrome() {
        //1.找到中间位置
        Node cur = this.head;
        Node fast = this.head;
        Node slow = this.head;
        Node curNext = null;
        fast = fast.next;
        while(fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        //slow为中间位置，开始进行第二步
        //2.进行反转
        while(cur != null) {
            cur = slow.next;
            cur.next = slow;
            curNext = cur.next;
            slow = slow.next;
        }
        cur = this.head;
        Node curNew = fast;

        //判断是否相等
        while(curNew.data == cur.data) {
            cur = cur.next;
            curNew = curNew.next;
            if(cur == curNew) {
                return true;
            }
        }
        return false;
    }*/
    //修改后代码
    //判断是否为回文
    public boolean chkPalindrome() {
        if(this.head == null) {
            return false;
        }
        if(this.head.next == null) {
            return true;
        }
        //找到中间位置
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //slow的位置是中间位置。开始进行第二步
        //2.进行反转
        Node cur = slow.next;
        while(cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //3.开始判断
        while(this.head != slow) {
            if(this.head.data != slow.data) {
                return false;
            }
            //偶数情况
            if(this.head.next == slow) {
                return true;
            }
            this.head = this.head.next;
            slow = slow.next;
        }
        return true;
    }

    //判断是否有环
    public Node hasCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        if(fast == null && fast.next == null) {
            return null;
        }
        return fast;
    }

    //查找环的入口
    public Node detectCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        if(fast == null && fast.next == null) {
            return null;
        }
       /* Node cur = this.head;
        while(cur != fast) {
            cur = cur.next;
            fast = fast.next;
        }
        return cur;*/
        slow = this.head;//如果有环，将其中一个比如slow拉到头前
        while(slow == fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}



/*
class Node {
    public Node head;
    public Node next;
    public int data;

    public Node(int data) {
        this.data = data;
    }

    //反转单链表
    //测试重新写一个display函数
    public Node reverseList() {
        Node cur = this.head;
        Node prev = null;
        Node newHead = null;
        while(cur != null) {
            Node curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
}
*/




