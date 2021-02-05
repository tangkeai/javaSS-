import java.util.*;
public class Main2 {
    public static int searchLeft(int[] arr,int index) {
        if (index == 0) {
            return -1;
        }
        for (int i = index-1; i >= 0 ; i--) {
            if (arr[i] < arr[index]) {
                return i;
            }
        }
        return -1;
    }

    public static int searchRight(int[] arr,int index) {
        if (index == arr.length-1) {
            return -1;
        }
        for (int i = index+1; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(searchLeft(arr,i)+" "+searchRight(arr,i));
            }
        }
    }
}