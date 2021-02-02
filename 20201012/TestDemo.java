/*1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
2. 判定一个数字是否是素数
3. 打印 1 - 100 之间所有的素数
4. 输出 1000 - 2000 之间所有的闰年
5. 输出乘法口诀表*/

import java.util.Scanner;




public class TestDemo {
	//打印出1-100以内能被3和5整除的数
	public static void main(String[] args) {
		int i = 1;
		 while(i <= 100) {
		 	if( i%3==0 && i%5==0) {
		 		System.out.println(i);
		 		i++;
		 		continue;
		 	} 
		 	i++;
		 	//continue;
		 }
	}


    // 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
	public static void main6(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("请输入年龄： ");
		while(scan.hasNextInt()) {
			int age = scan.nextInt();
			if(age <= 18) {
				System.out.println("少年");	
			} else if( 19<=age && age<=28 ) {
				System.out.println("青年");
			} else if( 29<=age && age<=55 ) {
				System.out.println("中年");
			} else {
				System.out.println("老年");
			}

		}
	}


	/*public static void main(String[] args) {
			//Scanner scan = new Scanner(System.in);
			int age = 13;//scan.nextInt;

			if(age <= 18) {
				System.out.println("少年");	
			} else if( 19<=age && age<=28 ) {
				System.out.println("青年");
			} else if( 29<=age && age<=55 ) {
				System.out.println("中年");
			} else {
				System.out.println("老年");
		}

		}
	}*/








	public static void main5(String[] args) {
		int i = 1;
		int fac = 1;
		int sum = 0;
		while(i <= 5) {
			fac = fac*i;
			sum = sum+fac;
			i++;
		}
		System.out.println(sum); 
	}

	/*public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while(num <= 100) {
			sum += num;
			num++;
		}
		System.out.println("1到100的和为： "+sum);

		sum = 0;
		num = 1;
		while(num<=100 && num%2==1 ) {
			sum += num;
			num++;
			continue;
		}
		System.out.println("1到100以内奇数的和为： "+sum);

		sum = 0;
		while(num<=100 && num%2==0 ) {
			sum += num;
			num++;
		}
		System.out.println("1到100以内偶数的和为： "+sum);

	}*/

	public static void main4(String[] args) {
		//从键盘中获取数据
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()) {
			//读入一个整形
			int num = scan.nextInt();
			if(num % 2 == 0) {
				System.out.println("偶数");
			} else {
				System.out.println("奇数");
			}
		}
	}
		

	public static void main3(String[] args) {
		int a = 1;
		if(a == 2) {
			System.out.println("hello");
		} else {
			System.out.println("else");
		}
	}

	public static void main2(String[] args) {
		int  a = 1;
		if(a == 1) {
			System.out.println(a);
		}
		System.out.println("else");
	}

	public static void main1(String[] args) {
		//顺序结构
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
	}
}