import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestDemo1 {

    public static int  func (int[] array,int score) {
        Map<Integer,Integer> map = new HashMap<>();
        //String[] array = s.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i],1);
            }else {
                int value = map.get(array[i]);
                map.put(array[i],value+1);
            }
        }
        for (Map.Entry<Integer,Integer> m : map.entrySet()) {
            if(m.getKey() == (score)) {
                return m.getValue();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int[] array = new int[N];
            int i = 0;
            while (N != 0) {
                array[i++] = sc.nextInt();
                N--;
            }
            int score = sc.nextInt();
            System.out.println(func(array,score));
        }
    }
}
