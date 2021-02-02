import java.util.Arrays;

public class MyArrayList {
    public int[] elem;
    public int usedsize;
    public MyArrayList() {
        this.elem = new int[10];
        this.usedsize = 0;
    }
    public MyArrayList(int captcity) {
        this.elem = new int[captcity];
        this.usedsize = 0;
    }

    public void add(int pos,int data) {
        if (pos < -1 || pos > usedsize) {
            System.out.println("插入位置不合法");
            return;
        }
        if (usedsize == elem.length) {
            System.out.println("顺序表已满");
            return;
        }
        for (int i = usedsize-1; i >= pos; i--) {
            elem[i+1] = elem[i];
        }
        elem[pos] = data;
        usedsize++;
    }

    public void display() {
        for (int i = 0; i < usedsize; i++) {
            System.out.print(elem[i]+" ");
        }
        System.out.println();
    }

    //判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedsize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    //查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedsize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    //获取pos位置的元素
    public int getPos(int pos) {
        if (pos < 0 || pos >= usedsize) {
            System.out.println("pos位置不合法");
            return -1;
        }
        if (usedsize == elem.length) {
            System.out.println("顺序表已满");
            return -1;
        }
        return this.elem[pos];
    }

    //获取顺序表的长度
    public int size() {
        return this.usedsize;
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int index = search(toRemove);
        if (index == -1) {
            System.out.println("没有这个数字");
            return;
        }
        for (int i = index; i < this.usedsize-1; i++) {
            elem[index] = elem[index+1];
        }
        this.usedsize--;
    }

    public boolean isFull() {
        if (this.usedsize == this.elem.length) {
            return true;
        }
        return false;
    }

    public void resize() {
        //进行拷贝
        this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
    }

    public void clear() {
        this.usedsize = 0;
    }
}


