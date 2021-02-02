

public class TestDemo {
	public static void main(String[] args) {
		boolean flg = true ? false : true==true ? true : false;
		boolean flg1 = false ? false : true==true ? true : false;
		System.out.println(flg);//false
		System.out.println(flg1);//true

	}


	public static void main18(String[] args) {
		int a = 10;
		int b = 20;
		//System.out.println(!a<b);// 错误: 一元运算符 '!' 的操作数类型int错误
		System.out.println(!(a<b));//false
	}


	public static void main17(String[] args) {
		int a = 1;
		int b = 2;
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		System.out.println(a>=b);//false
		System.out.println(a<=b);//true
	}


	public static void main16(String[] args) {
		int a = 10;
		a = a++;
		System.out.println(a);//10
	}

	public static void main15(String[] args) {
		System.out.println(10/0);
		System.out.println(10/3);//3
		System.out.println(-10/3);//-3
		System.out.println(10/-3);//-3
		System.out.println(-10/-3);//3
	}


	public static void main14(String[] args) {
		System.out.println(10%3);//1
		System.out.println(-10%3);//-1
		System.out.println(10%-3);//1
		System.out.println(-10%-3);//-1

		System.out.println(11.5%2.0);//1.5
	}


	public static void main12(String[] args) {
		System.out.println(5/2);//2
		System.out.println(5.0/2);//2.5
		System.out.println((float)5/2);//2.5
		System.out.println(5/(float)2);//2.5
		System.out.println((float)(5/2));//2.0
	}


	public static void main11(String[] args) {
		String str = "abc";
		System.out.println(str);

		int str1 = Integer.valueOf(str);
	}


	public static void main10(String[] args) {
		int num = 10;
		String str = 10+" ";
		System.out.println(num);
		System.out.println(str);

		String str2 = String.valueOf(num);
		System.out.println(str2);
	}


	public static void main9(String[] args) {
		/*byte b1 = 1;
		byte b2 = 2;
		byte b3 = b1+b2;  //错误: 不兼容的类型: 从int转换到byte可能会有损失
		System.out.println(b3);*/
		byte b1 = 1;
		byte b2 = 2;
		byte b3 =(byte) (b1+b2);  
		System.out.println(b3);
		/*byte b4 = 1;
		//打印输出1
		System.out.println(b4);*/
	}



	public static void main8(String[] args) {
		int a = 10;
		long b = a;
		int c = (int)b;
		System.out.println(a + "," +b+"+"+c);
	}


	public static void main7(String[] args) {
		final int A;
		A = 100;
		System.out.println(A);
	}


	public static void main6(String[] args) {
		int a = 10;
		{
			a=99;
			//打印输出99
			System.out.println(a);
		}
		//打印输出99
		System.out.println(a);
	}




	/*public static void main5(String[] args) {
	 	{
			int a = 10;
			System.out.println(a);
		}
		System.out.println(a);   // 错误: 找不到符号System.out.println(a);
	}
	 */


	public static void main4(String[] args) {
		String a = "hello";
		String b = "world";
		String c = a + b;
		//打印helloworld
		System.out.println(c);
	}


	public static void main3(String[] args) {
		System.out.println("ab"+"cd");
		int a = 10;
		//打印a=10
		int b = 20;
		System.out.println("a="+a);
		System.out.println(a+b);
		//打印a = 10,b = 20
		System.out.println("a = "+ a +",b = "+b);
	}


	public static void main2(String[] args) {
		//打印"abc"
		System.out.println("\"abc\"");
		//打印D:\JavaPratice\20201010
		System.out.println("D:\\JavaPratice\\20201010");
	}


	public static void main1(String[] args) {
		String str = "hello";
		System.out.println(str);

		System.out.print("打印但是不换行");
		System.out.println("打印并且换行");
		System.out.printf("%s\n","格式化打印");

		System.out.printf("%d\n",10);
	}
}