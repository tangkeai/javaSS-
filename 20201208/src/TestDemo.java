import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        //行
        for (int i = 0; i < Math.round(N/2.0) ; i++) {
            //列
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == Math.round(N/2.0)-1) {
                    System.out.print(s);
                }else {
                    if (j == 0 || j == N-1) {
                        System.out.print(s);
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
