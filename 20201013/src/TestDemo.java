
import sun.nio.cs.ext.MacArabic;

import java.util.Random;
import java.util.Scanner;

/*
2. 判定一个数字是否是素数
3. 打印 1 - 100 之间所有的素数
4. 输出 1000 - 2000 之间所有的闰年
5. 输出乘法口诀表
6. 求两个正整数的最大公约数
7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
8. 编写程序数一下 1到 100 的所有整数中出现多少个数字9。
9. 求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本
        身，如；153＝1＋5＋3?，则153是一个“水仙花数”。)
        10. 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输
        入，最多输入三次。三次均错，则提示退出程序
        11. 写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1
        12. 获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列。
        13. 输出一个整数的每一位.
        14. 完成猜数字游戏*/
//1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
public class TestDemo {

    //完成猜数字游戏
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Random random = new Random(20201013); //伪随机，指定一个规则，下次的随机数是上次的随机数
        Random random = new Random();
        int rand = random.nextInt(100)+1;
        while(true) {
            System.out.println("请输入一个数：");
            int n = scanner.nextInt();
            //[0,100)--->  +1  [1-100]
            if(n > rand) {
                System.out.println("猜大了！");
            }else if (n == rand) {
                System.out.println("猜对了！");
                break;
            }else {
                System.out.println("猜小了！");
            }
        }
    }

    //13. 输出一个整数的每一位.  （逆序用递归）
    public static void main16(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        //输出每一位
        while(n != 0) {
            System.out.print(n%10+" ");
            n /= 10;
        }
    }

    //12. 获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列。
    public static void main15(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //i所对应位为偶数位
        for (int i = 31; i >= 1 ; i-=2) {
            System.out.print(((n>>i)&1)+" ");
        }
        System.out.println();
        //i所对应位为奇数位
        for (int i = 30; i >= 0 ; i-=2) {
            System.out.print(((n>>i)&1)+" ");
        }
    }

    //优化1  相邻两位相与  每与一次少一个1
    public static void main14(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while(n != 0) {
            count++;
            n = n & (n-1);
        }
        System.out.println(count);
    }

    //优化
    //11. 写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1
    public static void main13(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while(n != 0) {
            if((n&1) != 0) {
                count++;
            }
            n = n >>> 1;
        }
        System.out.println(count);
    }

    ////11. 写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1
    public static void main12(String[] args) {
        int n = 15;
        int count = 0;
        for (int i = 0; i < 15 ; i++) {
            if((n&1) != 0) {
                count++;
                n = n >> 1;
            }
        }
        System.out.println(count);
    }


    //10. 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输
    public static void main11(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        while(count != 0) {
            System.out.println("请输入密码: ");
            String password = scanner.nextLine();
            if(password.equals("123456")) {
                System.out.println("登陆成功");
                break;
            } else {
                count--;
                System.out.println("登录失败");
                System.out.println("你还有"+ count+ "次机会");
            }
        }
    }

    //9. 求出1～n之间的所有“自幂数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，
    // 如；153＝1＋5＋3?，则153是一个“水仙花数”。)
    public static void main10(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) {
            int count = 0;
            int tmp = i;
            //判断count是几位
            while(tmp != 0) {
                count++; //1 2 3
                tmp /= 10;//12 1 0
            }
            //此时已经知道count几位了
            //第2步，求每一位
            tmp = i;
            int sum = 0;
            while(tmp != 0) {
                //3^3
                sum += Math.pow(tmp%10,count);//3 2 1
                tmp = tmp / 10;//12 1 0
            }
            if(i == sum) {
                System.out.println(i+ "是自幂数");
            }
        }
    }


    //8. 编写程序数一下 1到 100 的所有整数中出现多少个数字9。
    public static void main9(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 9) {
                count++;
            }
            if (i / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }

    //7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
    public static void main8(String[] args) {
        double sum = 0;
        int flg = 1;
        for (int i = 1; i <=100 ; i++) {
            sum += 1.0/i*flg;
            flg = - flg;
        }
        System.out.println("结果为: "+ sum);
    }

    //求两个正整数的最大公约数
    //辗转相除法
    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a % b != 0) {
            int c = a%b;
            a = b;
            b = c;
        }
        System.out.println("最大公约数是: "+b);
    }

    //输出乘法口诀表
    //了解如何打印直角三角形
    //了解for循环的嵌套使用
    public static void main6(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n  ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println(" ");
        }
    }


    //输出 1000 - 2000 之间所有的闰年
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int year = 1000; year <= n ; year++) {
            if(year%4==0 && year%100!=0 || year%400==0) {
                System.out.println(year +"是闰年");
            }
        }

    }

    //再次优化优化代码  根号n
    //2. 判定一个数字是否是素数
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 2;

        if(n <= 0) {
            System.out.println("不是素数");
            return; //遇到return结束main方法
        }
        for (; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0) {
                System.out.println("不是素数");
                break; //如果判断一次不是素数，就结束for循环
            }
        }
        //代码走到这有两种情况：
        //1、循环条件退出（是素数）
        //2、遇到break(不是素数)
        if(i > Math.sqrt(n)) {
            System.out.println("是素数");
        }
    }

    //优化代码  n/2
    //2/. 判定一个数字是否是素数
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 2;

        if(n <= 0) {
            System.out.println("不是素数");
            return; //遇到return结束main方法
        }
        for (; i <= n/2 ; i++) {
            if(n % i == 0) {
                System.out.println("不是素数");
                break; //如果判断一次不是素数，就结束for循环
            }
        }
        //代码走到这有两种情况：
        //1、循环条件退出（是素数）
        //2、遇到break(不是素数)
        if(i > n/2) {
            System.out.println("是素数");
        }
    }



    //基础代码
    //2. 判定一个数字是否是素数
    //素数：除了1和本身外，不能被其他任何正整数整除 2是素数
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 2;

        if(n <= 0) {
            System.out.println("不是素数");
            return; //遇到return结束main方法
        }
        for (; i <n ; i++) {
            if(n % i == 0) {
                System.out.println("不是素数");
                break; //如果判断一次不是素数，就结束for循环
            }
        }
        //代码走到这有两种情况：
        //1、循环条件退出（是素数）
        //2、遇到break(不是素数)
        if(i >= n) {
            System.out.println("是素数");
        }
    }

    //1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()) {
            //System.out.println("请输入年龄: ");  有问题
            int age = scanner.nextInt();
            //判断年龄范围
            if(age <= 18) {
                System.out.println("少年");
            }else if (age >= 19 && age <= 28) {
                System.out.println("青年");
            }else if(age >= 29 && age <= 55) {
                System.out.println("中年");
            }else {
                System.out.println("老年");
            }
        }
    }
}

