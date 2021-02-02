


import java.util.Arrays;
/*
    //main3
    class Person {
    int age;
    String name;
    String sex;
    //无参构造方法
    public Person() {
        this.name = "caocao";
        this.age = 10;
        this.sex = "男";
    }
    //两个参数的构造方法
    public Person(int age,String name) {
        this.name = name;
        this.age = age;
    }
    //三个参数的构造方法
    public Person(int age,String name,String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}*/

/*
//main2
class ArryTmp {
    public int[] arry1 = {1,2,3,4,5};
    public int[] arry2 = {6,7,8,9,10};
}
*/

/*
//main4
class Person {
    private int a;
    private int b;
    public Person(int a,int b) {
        this.a = b;
        this.b =a;
    }

    @Override
    public String toString() {
        return "交换前："+"a=" + a +
                ", b=" + b ;
    }
}
*/
/*
//main5
class Calculator {
    public int num1;
    public int num2;
}
*/
class Calculator {
    private int num1;
    private int num2;

    public int add() {
        return this.num1 + this.num2;
    }

    public int sub() {
        return this.num1 - this.num2;
    }

    public int mlt() {
        return this.num1 * this.num2;
    }

    public double dev() {
        return this.num1 * 1.0 / this.num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
class MyValue {
    public  int val;
}

public class HomeWork {

    public static void main(String[] args) {
        //MyArryList myArryList = new MyArryList();
        MyArryList myArryList1 = new MyArryList(5);
        myArryList1.add(0,1);
        myArryList1.add(1,2);
        myArryList1.add(2,3);
        myArryList1.add(3,4);
        myArryList1.add(4,5);
        myArryList1.display();
        System.out.println(myArryList1.contains(6));
        System.out.println(myArryList1.search(5));
        System.out.println(myArryList1.getPos(3));
        myArryList1.remove(2);
        System.out.println(Arrays.toString(myArryList1.elm));
        myArryList1.clear();
        myArryList1.display();
    }

    //交换
    public static void swap(MyValue myValue1,MyValue myValue2) {
        int tmp = myValue1.val;
        myValue1.val = myValue2.val;
        myValue2.val = tmp;
    }

    public static void main9(String[] args) {
        MyValue myValue1 = new MyValue();
        myValue1.val = 10;
        MyValue myValue2 = new MyValue();
        myValue2.val = 20;
        System.out.println(myValue1.val +" "+myValue2.val);
        swap(myValue1,myValue2);
        System.out.println(myValue1.val +" "+myValue2.val);
    }
    //计算器
    public static void main8(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setNum1(10);
        calculator.setNum2(20);
        System.out.println(calculator.add());
        System.out.println(calculator.sub());
        System.out.println(calculator.mlt());
        System.out.println(calculator.dev());
        }

    //可变参数
    public static int sum(int... array) {
        int rst = 0;
        for (int i = 0; i < array.length; i++) {
            rst += array[i];
        }
        return rst;
    }

    public static void main7(String[] args) {
        int[] arry = {1,4,2,3};
        System.out.println(sum(arry));
        System.out.println(sum(1,2,3,4,5,6,7));
        System.out.println(new int[]{1,2,3});//匿名数组   //打印出地址的哈希值
    }

    //main6
    public static void fuc(int[] arry1,int[] arry2) {
        for (int i = 0; i < arry1.length ; i++) {
            int tmp = arry1[i];
            arry1[i] = arry2[i];
            arry2[i] = tmp;
        }
    }

    public static void main6(String[] args) {
        int[] arry1 = {1,2,3,4,5};
        int[] arry2 = {6,7,8,9,10};
        fuc(arry1,arry2);
        System.out.println(Arrays.toString(arry1));
        System.out.println(Arrays.toString(arry2));
    }

    /*//编写一个类Calculator,有两个属性num1,num2,这两个数据的值，不能在定义的同时初始化，最后实现加减乘
    //除四种运算.
    public static void main5(String[] args) {
        Calculator calculator = new Calculator();
        calculator.num1 = 10;
        calculator.num2 = 30;
        System.out.println(calculator.num1 + calculator.num2);
        System.out.println(calculator.num1 - calculator.num2);
        System.out.println(calculator.num1 * calculator.num2);
        System.out.println(calculator.num1 / calculator.num2);
    }*/





    //实现交换两个变量的值。要求：需要交换实参的值。
    /*public static void main4(String[] args) {
        int a = 10;
        int b =20;
        System.out.println("交换前："+ "a="+a +", b="+b);
        Person person = new Person(a,b);
        System.out.println(person);
    }*/

    //设计一个包含多个构造函数的类，并分别用这些构造函数来进行实例化对象。
    /*public static void main3(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person(22,"tangziwei");
        Person person3 = new Person(23,"tang","女");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
    }
*/



    //作业标题
    // 交换两个数组
    //
    // 作业内容
    // 给定两个整型数组, 交换两个数组的内容.
    /*public static void main2(String[] args) {
        ArryTmp arryTmp = new ArryTmp();
        System.out.println("交换前:" + Arrays.toString(arryTmp.arry1) +Arrays.toString(arryTmp.arry2));
        int[] tmp = arryTmp.arry1;
        arryTmp.arry1 = arryTmp.arry2;
        arryTmp.arry2 = tmp;
        System.out.println("交换前:" + Arrays.toString(arryTmp.arry1) +Arrays.toString(arryTmp.arry2));
    }
*/

    //作业标题
    //奇数放到数组后面
    //
    //作业内容
    //给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
    /*public static void oddEvenTemp(int[] arry) {
        int left = 0;
        int right = arry.length-1;
        while(left < right) {
            while(left < right && arry[left]%2 == 0) {
                left++;
            }
            while(left < right && arry[right]%2 != 0) {
                right--;
            }
            int tmp = arry[right];
            arry[right] = arry[left];
            arry[left] = tmp;
        }
    }*/

    /*public static void main1(String[] args) {
        int[] arry = {15,2,9,10,3,8};
        System.out.println(Arrays.toString(arry));
        oddEvenTemp(arry);
        System.out.println(Arrays.toString(arry));
    }*/
}
