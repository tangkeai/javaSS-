


class MyArryList {
    public int[] elm;
    public int usedSized;
    public MyArryList() {
        this.elm = new int[10];
        this.usedSized = 0;
    }
    public MyArryList(int capacity) {
        this.elm = new int[capacity];
        this.usedSized = 0;
    }
    public void add(int pos,int data) {
        if(pos<0 || pos>this.usedSized) {
            System.out.println("插入位置错误");
            //return;
        }
        if(this.usedSized == this.elm.length) {
            System.out.println("顺序表已满");
            //return;
        }
        for (int i = this.usedSized-1; i >= pos ; i--) {
            this.elm[i+1] = this.elm[i];
        }
        this.elm[pos] = data;
        this.usedSized++;
    }
    //打印顺序表
    public void display() {
        for (int i = 0; i <this.usedSized ; i++) {
            System.out.print(this.elm[i] + " ");
        }
        System.out.println();
    }

    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSized; i++) {
            if(this.elm[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    //查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSized ; i++) {
            if(this.elm[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    //获取pos位置的元素
    public int getPos(int pos) {
        if(pos < 0 || pos > this.usedSized-1) {
            return  -1;
        }
        return this.elm[pos];
    }

    //给pos位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos < 0 || pos >this.usedSized) {
            System.out.println("pos位置不合法");
            return;
        }
        this.elm[pos] = value;
    }
    public void remove(int toRemove) {
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("没有这个元素");
            return;//如果少了return 程序还会往下走
        }
        for (int i = toRemove; i < this.usedSized-1 ; i++) {
            this.elm[i] = this.elm[i+1];
        }
        this.usedSized--;
    }
    //清空数据表
    public void clear() {
        this.usedSized = 0;
    }
    //获取顺序表长度
    public int size() {
        return this.usedSized;
    }

    /*public int search(int toFind) {
        int left = 0;
        int right = this.elm.length-1;
        int mid = (left +right)/2;
        while(left < right) {
            if(left < right && toFind > this.elm[mid]) {
                left = mid+1;
            }
            if(left < right && toFind < this.elm[mid]) {
                right = mid-1;
            }
            mid = (left +right)/2;
            if ( toFind == this.elm[mid]) {
                return mid;
            }
        }
        return -1;
    }*/
}


















/*
public class MyArrayList {
    public int[] elm;
    public int usedSize;
    public MyArrayList() {
        this.elm = new int[10];
        this.usedSize = 0;
    }
    public  MyArrayList(int capacity) {
        this.elm = new int[capacity];
        this.usedSize = 0;
    }

    //在pos位置新增元素
    public void add(int pos,int data) {
        if(pos < 0 || pos  usedSize) {
            System.out.println("插入位置有误");
        }else {
            for (int i = usedSize; i > pos ; i--) {
                    elm[usedSize] = elm[usedSize-1] ;
                }
            elm[pos] = data;
            }
        }
    }
}
*/
