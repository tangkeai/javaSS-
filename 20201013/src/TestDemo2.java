import java.util.Scanner;

public class TestDemo2 {
    //找出出现一次的数字
    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
    public  static  int findOnceNumer(int[] arr) {
        int a = 0;
        for (int i = 0; i < 5 ; i++) {
            a = a^arr[i];
        }
        return a;
    }

    public static void main(String[] args) {
        int[] array = {2,5,1,2,1};
        System.out.println(findOnceNumer(array));
    }



    //求斐波那契数列的第n项。(迭代实现)
    //斐波那契数列: 从第三项起，后一项是前两项的和 1 1 2 3 5 8 //13
      //1234
    public  static int fer(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for (int i = 3; i <=n ; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }


    public static void main4(String[] args) {
        System.out.println(fer(6));
    }

    public static int max2(int a, int b) {
        if(a > b) {
            return a;
        }else {
            return b;
        }
    }

    public static int max3(int a, int b, int c) {
        return max2(max2(a ,b),c );
    }

     //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
     public static void main3(String[] args) {
         int a = 10;
         int b = 256;
         int c = 123;
         System.out.println(a +" "+ b+" " + c);
         System.out.println("最大值为: "+ max3(a, b, c));
     }


    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
    //求 N 的阶乘 。
    public static long fuc(long n) {
        long rst = 1L;
        for (long i = 1L; i <=n ; i++) {
            rst*=i;//1*1*2
        }
        return rst;
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n的值: ");
        long N = scanner.nextLong();
        System.out.println(fuc(N));

    }


    //俩个方法调用 求阶乘之和

    public static long sumFuc(long n) {
        long sum = 0;
        for (long i = 1; i <=n ; i++) {
            sum += fuc(i);// 1*1+
        }
        return sum;
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n的值: ");
        long n = scanner.nextInt();
        System.out.println(sumFuc(n));
    }
}
