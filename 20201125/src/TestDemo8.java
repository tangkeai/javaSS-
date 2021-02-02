import java.util.Scanner;

public class TestDemo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;
        int end = 0;
        int tmp = 0;
        for (int i = 0; i < str.length(); i++) {
            //如果是数字进入
            if (str.charAt(i)>='0' && str.charAt(i)<='9') {
                count++;
                if (tmp < count) {
                    tmp = count;
                    end = i;
                }
            }else {
                count = 0;
            }
        }
        //a12c345g  end = 6  3
        System.out.println(str.substring(end-tmp+1,end+1));


    }
}


