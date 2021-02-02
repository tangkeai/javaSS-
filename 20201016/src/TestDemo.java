import java.util.Arrays;

public class TestDemo {

    public static void fac(int[] arry) {
        int left = 0;
        int right = arry.length-1;
        while(left < right) {
            while(left<right && arry[left]%2 == 0) {
                left++;
            }
            //left遇到奇数
            while(left<right && arry[right]%2 != 0) {
                right--;
            }
            //right遇到偶数
            if(left < right) {
                int tmp = arry[left];
                arry[left] = arry[right];
                arry[right] = tmp;
            }
        }
    }

    //数组偶数放在前面，奇数放在后面
    public static void main(String[] args) {
        int[] arry = {3,2,1,8,4,9};
        fac(arry);
        System.out.println(Arrays.toString(arry));

    }

    //数组逆置
    public static void reserve(int[] arry) {
        int left = 0;
        int right = arry.length-1;
        while(left < right) {
            int tmp = arry[right];
            arry[right] = arry[left];
            arry[left] = tmp;
            right--;
            left++;
        }
    }

    public static void main9(String[] args) {
        int[] arry = {4,3,2,1};
        reserve(arry);
        System.out.println(Arrays.toString(arry));
    }

    public static void bubbleSort1(int[] arry) {
        boolean flg = false;//默认为false

        //i是趟数
        for (int i = 0; i < arry.length-1; i++) {
            flg = false;
            for (int j = 0; j < arry.length-1-i ; j++) {
                if (arry[j] > arry[j+1]) {
                    int tmp = arry[j+1];
                    arry[j+1] = arry[j];
                    arry[j] = tmp;
                    flg = true;
                }
            }
            if(flg == false) {
                break; //结束整个循环
            }
        }
    }


    public static void main8(String[] args) {
        //int[] arry = {19,9,8,7};
        int[] arry = new int[10_1000];
        for (int i = 0; i < arry.length ; i++) {
            arry[i] = i;
        }
        long startTime = System.currentTimeMillis();
        bubbleSort1(arry);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        //System.out.println(Arrays.toString(arry));
    }




    //冒泡排序法
    //最大的沉到最下面
    public static void bubbleSort(int[] arry) {
        for (int i = 0; i < arry.length-1; i++) {
            for (int j = 0; j < arry.length-1-i ; j++) {
                if (arry[j] > arry[j+1]) {
                    int tmp = arry[j+1];
                    arry[j+1] = arry[j];
                    arry[j] = tmp;
                }
            }
        }
    }


    public static void main7(String[] args) {
        int[] arry = {19,9,8,7};
        bubbleSort(arry);
        System.out.println(Arrays.toString(arry));
    }


    //判断是否有序
    public static boolean isSorted(int[] arry) {
        for (int i = 0; i < arry.length-1 ; i++) {
            if(arry[i] >  arry[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main6(String[] args) {
        int[] arry = {1,9,8,10};
        System.out.println(isSorted(arry));

    }

    //查找非有序数列下标
    public static void main5(String[] args) {
        int[] arry = {12,6,13,4};
        Arrays.sort(arry);
        System.out.println(Arrays.toString(arry));
        System.out.println(Arrays.binarySearch(arry, 4));
    }


    //二分查找    有序排列
    /*public static int binarySearch(int[] arry,int key) {//10
        int left = 0;
        int right = arry.length-1;

        while (left <= right) {
            int mid = (left + right)/2;  //1

                if(key > arry[mid]) {   //
                    left = mid + 1;
                }else if(key < arry[mid]){
                    right = mid - 1;
                }else {
                    return mid;
                }
        }
        return -1;
    }
*/
    public static void main4(String[] args) {
        int[] arry = {1,5,8,10};
        System.out.println(Arrays.binarySearch( arry, 2));
    }

    //查找数组中指定下标
    public static int findNumber(int[] arry, int key) {
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main3(String[] args) {
        int[] arry = {12,34,1,9};
        System.out.println(findNumber(arry,0));
    }


    //求数组的平均值
    public static double avg(int[] arry) {
        double ret = 0;
        int sum = 0;
        /*for (int i = 0; i < arry.length ; i++) {
            sum += arry[i];
        }*/
        //不用下标，直接用foreach
        for (int x:arry) {
            sum += x;
        }
        ret = sum*1.0/arry.length;
        return ret;
    }

    public static void main2(String[] args) {
        int[] arry = {1,7,3,4,6};
        System.out.println(avg(arry));
    }


    //给定一个整形数组，找到其中的最大值（找到最小值同理）
    public static int maxArray(int[] arry) {
        if(arry.length == 0 || arry == null) {
            return -1;
        }
        int max = arry[0];
        for (int i = 1; i < arry.length ; i++) {
            if(arry[i] > max) {
                max = arry[i];
            }
        }
        return max;
    }

    public static void main1(String[] args) {
        int[] arry = {10,78,1,56,23};
        /*int max = arry[0];
            for (int i = 1; i < arry.length; i++) {
                max = arry[0]>arry[i] ? arry[0] : arry[i];
                arry[0] = max;
            }
        System.out.println(arry[0]);*/
        System.out.println(maxArray(arry));
    }
}
