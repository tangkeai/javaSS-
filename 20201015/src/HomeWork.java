import java.util.Scanner;

public class HomeWork {

    /**
     作业标题
     递归求 N 的阶乘

     作业内容
     递归求 N 的阶乘
     * */
    public static int fan(int N) {
        if(N == 1) {
            return 1;
        }
        return N*fan(N-1);
    }

    public static void main9(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入N的值: ");
        int N = scanner.nextInt();
        System.out.println(fan(N));
    }

    /**
     作业标题
     递归求和

     作业内容
     递归求 1 + 2 + 3 + ... + 10
     * */
    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        return n + sum(n-1);
    }

    public static void main8(String[] args) {
        System.out.println(sum(10));
    }

    /**

     作业标题
     递归打印数字的每一位

     作业内容
     按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
      */
    public static void printNumber(int n) {
        if(n < 10) {
            System.out.println(n);
            return;
        }
        printNumber(n/10);
        System.out.println(n%10);
    }

    public static void main7(String[] args) {
        printNumber(1234);
    }


    /**
     作业标题
     返回的数字之和
     作业内容
     写一个递归方法，输入一个非负整数，返回组成它的数字之和
     */
    public static int sumNumber(int n) {
        if (n < 10) {
            return n;
        }
        return sumNumber(n/10)+ n % 10;
    }
    public static void main6(String[] args) {
        System.out.println(sumNumber(1234));
    }

    /**
     作业标题
     递归求斐波那契数列的第 N 项
     作业内容
     递归求斐波那契数列的第 N 项
     */
    public static  int fiber(int N) {
        if(N==1 || N == 2) {
            return 1;
        }
        return fiber(N-1)+fiber(N-2);
    }
    public static void main5(String[] args) {
        System.out.println(fiber(5));
    }


    /**
     作业标题
     递归求解汉诺塔问题
     作业内容
     递归求解汉诺塔问题
     */
    /**
     * 1： A->C   1
     * 2: A->B  A->C  B->C   3
     * 3: A->C  A->B C->B  A->C  B->A  B->C  A->C  7
     * 64   2^64   -1
     * @param args
     */
    public static void main(String[] args) {
        hanoiTower(1,'A','B','C');
        System.out.println();
        hanoiTower(2,'A','B','C');
        System.out.println();
        hanoiTower(3,'A','B','C');
    }

    public static void move(char pos1,char pos2) {
        System.out.print(pos1+"->"+pos2+" ");
    }
    /**
     * @param n    盘子数量
     * @param pos1 盘子所在的位置
     * @param pos2 中转位置
     * @param pos3 目的位置
     */
    public static void hanoiTower(int n,char pos1,char pos2,char pos3) {
        if(n == 1) {
            move(pos1,pos3);
            return;
        }
        hanoiTower(n-1,pos1,pos3,pos2);
        move(pos1,pos3);
        hanoiTower(n-1,pos2,pos1,pos3);
    }



    /**
     *
     作业标题
     青蛙跳台阶问题
     作业内容
     青蛙跳台阶问题
     */
    public static int frogJump(int n) {
        if(n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return frogJump(n-1) + frogJump(n-2);
    }

    public static void main3(String[] args) {
        System.out.println(frogJump(4));
    }


    /**
     *
     作业标题
     求最大值方法的重载
     作业内容
     在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
     */
    public static  int max(int a, int b) {
        /*if(a > b) {
            return a;
        }else {
            return b;
        }*/
        return a>b ? a : b;
    }

    public static  double max(double a, double b) {
        /*if(a > b) {
            return a;
        }else {
            return b;
        }*/
        return a>b ? a : b;
    }

    public static  double max(double a, double b, int c) {
        double rst = max(a,b);
        if(rst>c) {
            return rst;
        }else {
            return  c;
        }
        /*if(max(a,b) > c) {
            return  max(a,b);
        }else {
            return c;
        }*/
    }


    public static void main1(String[] args) {
        System.out.println(max(12,24));
        System.out.println(max(12.5, 13.9));
        System.out.println(max(15.6,23.9,230));
        //System.out.println((double)103);
    }



    /**
     *作业标题
     * 求和的重载
     * 作业内容
     * 在同一个类中,分别定义求两个整数的方法和三个小数之和的方法。 并执行代码，求出结果
     * */
    public  static int fan(int a, int b) {
        return (a + b);
    }

    public  static double fan(double a, double b, double c) {
        return (a + b + c);
    }

    public static void main2(String[] args) {
        System.out.println(fan(12,14));
        System.out.println(fan(12.1,11.2,1.1));
        //System.out.println(fan(12.1,11.2,1.1));
        //值得注意的是若12.1后面不加f的话，默认为float类型，调用fan(int a, int b, int c)会报错
    }
}
