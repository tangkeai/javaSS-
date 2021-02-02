import java.util.Scanner;

public class TestDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int[] array = new int[2*s1.length()];
        for (int i = 0; i < s2.length(); i++) {
            int tmp  = s2.charAt(i)-'0' + s1.charAt(i)-'0'+array[i];
            if (tmp > 9) {
                array[i]= tmp%10 + array[i];//0
                array[i+1] = tmp/10;//1
            }else {
                array[i] = tmp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
