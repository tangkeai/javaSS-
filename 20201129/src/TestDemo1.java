import java.util.Scanner;

public class TestDemo1 {
    public static void func(StringBuffer x) {
        String s = x.toString();
        int num = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer x = null;
        String s;
        for (int i = 0; i < n; i++) {
            s = sc.next();
            x.append(s);
        }
        func(x);
    }
}