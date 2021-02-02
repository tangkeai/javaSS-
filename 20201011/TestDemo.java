//1. 写代码实现: 给定两个 int 变量, 交换变量的值.
//2. 写代码实现: 给定三个 int 变量, 求其中的最大值和最小值.



/*public class TestDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp = a;
		System.out.println("交换前: a = " + a + ",b = " +b);

		a = b;
		b = temp;
		System.out.println("交换后: a = " + a + ",b = " +b);
	}
}*/


 public class TestDemo {
 	public static void main(String[] args) {
 		int a = 999;
 		int b = 778;
 		int c = 1111;
 		int max = a>b?(a>c?a:c):(b>c?b:c);
 		int min = a<b?(a<c?a:c):(b<c?b:c);
 		System.out.println("在"+ a +" "+ b +" " + c + "中");
 		System.out.println("最大值为: "+ max);
 		System.out.println("最小值为: "+ min);
 	}
 }