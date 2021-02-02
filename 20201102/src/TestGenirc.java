/**
 * 泛型：
 * class MyArrayList<T>   <T>:只是一个占位符，表示当前类是一个泛型类
 * 意义：
 * 1.可以进行类型的自动检查
 * 2.可以自动进行类型转换
 * 注意：
 * 1.不能new泛型类型的数组   new T[]
 * 2.MyArrayList<int> myArrayList2 = new MyArrayList<>();
 *  简单类型不能作为泛型类型的参数 <包装类/类>
 * 3.泛型类型的参数  不参与类型的组成
 * 面试问题：
 *      泛型是如何编译的？   擦除机制：被擦除为Object 不是替换为Object
 *      泛型是在编译时期的一个动作，它只存在于编译时期
 * @param <T>
 */
class MyArrayList<T> {
    public T[] elem;
    public int usedSize;

    public MyArrayList() {
        //不能直接new泛型类型的数组
        this.elem = (T[])new Object[10];
    }

    public void add(T data) {
        this.elem[this.usedSize++] = data;
    }

    public T getPos(int pos) {
        return this.elem[pos];
    }
}

class Person {

}
public class TestGenirc {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
        MyArrayList<String> myArrayList = new MyArrayList<>();
        System.out.println(myArrayList);
        MyArrayList<String> myArrayList2 = new MyArrayList<>();
        System.out.println(myArrayList2);
    }

    public static void main1(String[] args) {
        /*MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add(1.9);
        myArrayList.add("hello");

        String str = (String)myArrayList.getPos(2);
        System.out.println(str);*/

        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("hello");
        myArrayList.add("world");
        myArrayList.add("hhhhh");

        String str = (String)myArrayList.getPos(2);
        System.out.println(str);

        MyArrayList<Integer> myArrayList2 = new MyArrayList<>();
        myArrayList2.add(1);
        myArrayList2.add(2);
        myArrayList2.add(3);

    }
}
