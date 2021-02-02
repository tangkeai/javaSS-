/*1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
2. 判定一个数字是否是素数
3. 打印 1 - 100 之间所有的素数
4. 输出 1000 - 2000 之间所有的闰年
5. 输出乘法口诀表
 */
//import java.util.Scanner;



public class TestDemo {
	public static void main(String[] args) {
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
	}
}