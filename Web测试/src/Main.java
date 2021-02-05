import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            Map<Integer,Integer> map = new HashMap<>();
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                int scNum = sc.nextInt();
                array[i] = scNum;
            }
            for (int i = 0; i < array.length; i++) {
                int num = array[i];
                if (!map.containsKey(num)) {
                    map.put(num,1);
                }else {
                    int value = map.get(num);
                    map.put(num,value+1);
                }
            }
            int[] arr = new int[2];
            int i = 0;
            for (Map.Entry<Integer,Integer> m : map.entrySet()) {
                if(m.getValue()%2 == 1) {
                    arr[i++] = m.getKey();
                }
            }
            if (arr[0] >= arr[1]) {
                System.out.println(arr[1]+" "+arr[0]);
            }else {
                System.out.println(arr[0]+" "+arr[1]);
            }
        }
    }
}