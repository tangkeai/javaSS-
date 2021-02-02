import java.util.Arrays;
import java.util.Scanner;

/*
* Z国的货币系统包含面值1元、4元、16元、64元共计4种硬币，以及面值1024元的纸币。现在小Y使用1024元的纸币购买了一件价值为
N(0<N≤1024)的商品，请问最少他会收到多少硬币？
输入描述:
一行，包含一个数N。
输出描述:
一行，包含一个数，表示最少收到的硬币数。
花200，需要找零824块，找12个64元硬币，3个16元硬币，2个4元硬币即可。
* */


public class HomeWork {
    public static int findCoin(int N) {
        int surplus = 1024 - N;
       return surplus/64 + surplus%64/16 +surplus%64%16/4+surplus%64%16%4/1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入N的值: ");
        int N = scanner.nextInt();
        System.out.println(findCoin(N));
    }

    /**
     *
     作业标题
     数组转字符串

     作业内容
     实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} ,
     返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
     * */
    public static String toString(int[] arr) {
        String ret = "\"";
        ret += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                ret += arr[i] + ",";
            } else if (i == arr.length - 1) {
                ret += arr[i] + "]";
            }
        }
        ret += "\"";
        return ret;
    }
    public static void main10(String[] args) {
        int[] arr = {1, 2, 3};
        String s = toString(arr);
        System.out.println(s);
    }



    /**
     * 数组的拷贝
     *
     * 作业内容
     * 实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
     * */
    public static void main9(String[] args) {
        int[] arry = {12,6,34,1};
        int[] arry1 = Arrays.copyOf(arry,arry.length);
        System.out.println(Arrays.toString(arry1));
    }

    /**
     * 作业标题
     * 二分查找
     *
     * 作业内容
     * 给定一个有序整型数组, 实现二分查找
     */
    public static int binarySearch(int[] arry,int key) {
        int left = 0;
        int right = arry.length-1;
        while(left <= right) {
            int mid = (left+right)/2;
            if(key > arry[mid]) {
                left = mid + 1;
            }else if(key < arry[mid]) {
                right = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main8(String[] args) {
        int[] arry = {1,3,4,5};
        System.out.println(binarySearch(arry,4));

    }



    /**
     *
     数组是否有序

     作业内容
     给定一个整型数组, 判定数组是否有序（递增）
     *
     */
    public static boolean isSorted(int[] arry) {
        for (int i = 0; i < arry.length-1 ; i++) {
            if(arry[i] > arry[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main7(String[] args) {
        int[] arry = {13,34,93,100};
        System.out.println(isSorted(arry));
    }



    /**
     *
     作业标题
     冒泡排序

     作业内容
     给定一个整型数组, 实现冒泡排序(升序排序)
     * */
    public static void bubbleSort(int[] arry) {
        boolean flg = false;
        for (int i = 0; i < arry.length-1 ; i++) {
            flg = false;
            for (int j = 0; j < arry.length-1-i; j++) {
                if(arry[j] > arry[j+1]) {
                    int tmp = arry[j+1];
                    arry[j+1] = arry[j];
                    arry[j] = tmp;
                    flg = true;
                }
            }
            if(flg = false) {
                break;
            }
        }
    }

    public static void main6(String[] args) {
        int[] arry = {12,5,2,7,36,1};
        System.out.println(Arrays.toString(arry));
        bubbleSort(arry);
        System.out.println(Arrays.toString(arry));
    }


    public static void main5(String[] args) {
        int[] arry = new int[100];
        for (int i = 0; i < arry.length ; i++) {
            arry[i] = i+1;
        }
        System.out.println(Arrays.toString(arry));
    }


    /**
     * 作业标题
     * 打印数组
     *
     * 作业内容
     * 实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
     */
    public static void printArray(String[] arry) {
        for (int i = 0; i < arry.length ; i++) {
            System.out.println(arry[i]);
        }
    }

    public static void main4(String[] args) {
        String[] arry = {"hello!"};
        printArray(arry);
    }



    /**
     *
     作业标题
     改变原有数组元素的值

     作业内容
     实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
     例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
     * */
    public static int[] transform(int[] arry) {
        for (int i = 0; i < arry.length ; i++) {
            arry[i] *= 2;
        }
        return arry;
    }

    public static void main3(String[] args) {
        int[] arry = {1,2,3};
        //transform(arry);
        System.out.println("原数组为: "+ Arrays.toString(arry));
        System.out.println("修改后为: "+ Arrays.toString(transform(arry)));
    }


    /**
     *
     作业标题
     数组所有元素之和

     作业内容
     实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
     * */
    public static int sum(int[] arry) {
        int rst =0;
        for (int i = 0; i < arry.length; i++) {
            rst += arry[i];
        }
        return rst;
    }

    public static void main2(String[] args) {
        int[] arry = {13,1,2,3};
        System.out.println(sum(arry));
    }




    /**
     *
     作业标题
     求数组的平均值

     作业内容
     实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
     * */
    public static  double avg(int[] arry) {
        double sum = 0;
        for (int i = 0; i < arry.length ; i++) {
            sum += arry[i];
        }
        return sum/arry.length;
    }

    public static void main1(String[] args) {
        int[] arry = {1,4,8,6,10};

        System.out.println(avg(arry));
    }

}
