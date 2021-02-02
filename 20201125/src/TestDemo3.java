import java.util.Scanner;

public class TestDemo3 {

    /*public static int func(int num) {
        if(num % 3 == 0) {
            return 0;
        }
        count++;
        if(num % 3 == 2) {
            return count + 1;
        }
        count =  count + func(num/3 +1);
        return count;
    }*/
    public static int func(int num,int count) {
        if(num == 0) {
            return 0;
        }
        while (num != 0) {
            if(num ==2) {
                num = num +1;
                count++;
                break;
            }else if (num < 2) {
                break;
            }else {
                count = count + num/3 ;//1
                num = num/3 + num % 3;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
             int count = 0;
            if(num ==0) {
                break;
            }
            System.out.println(func(num,count));
        }
    }
}
