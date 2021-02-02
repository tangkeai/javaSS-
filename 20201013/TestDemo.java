import java.util.Scanner;

public class TestDemo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//9999  9999999
        for (int i = 1; i < n; i++) {
            //1、求当前的i是几位数
            int count = 0;
            int tmp = i;
            while (tmp != 0) {
                count++;//1 2   3
                tmp = tmp/10;//12  1   0
            }
            //此时count已经知道是几位数了
            //2、求i的每一位,相当于求tmp的每一位
            tmp = i;//123
            int sum = 0;
            while (tmp != 0) {
                //3^3
                sum += Math.pow(tmp%10,count);
                tmp /= 10;//123/10=12
            }
            if(sum == i) {
                System.out.println(i+"是自幂数");
            }
        }
    }

		
}


	





//1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
/*public class TestDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄: ");
        
        while(scanner.hasNextInt()) {
        	int age = scanner.nextInt();

        	if(age <= 18) {
	            System.out.println("少年");
	        } else if(age >= 19 && age <= 28) {
	            System.out.println("青年");
	        } else  if(age >= 29 && age <= 55) {
	            System.out.println("中年");
	        } else {
	            System.out.println("老年");
	        }
        }
    }
}
*/