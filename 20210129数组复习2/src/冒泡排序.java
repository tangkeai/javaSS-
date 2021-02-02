import java.util.Arrays;

public class 冒泡排序 {

    public static void bubbleSort1(int[] array) {
        //i是趟数
        for (int i = 0; i < array.length - 1; i++) {
            //相互比较
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
    /*
    * 冒泡优化
    * */
    public static void bubbleSort2(int[] array) {
        boolean flag = false; //默认没发生交换
        //i是趟数
        for (int i = 0; i < array.length - 1; i++) {
            flag = false; //每一趟都有可能没有交换
            //相互比较
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
    }

    public static void reverse(int[] array) {

        int j = array.length-1;
        int tmp = 0;
        for (int i = 0; i < array.length/2; i++) {
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] array = {11,3,1,7};
        //bubbleSort2(array);
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
}
