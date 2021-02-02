
 /**
  * 
  */
public class TestDemo {
	public static void main(String[] args) {
		boolean flg = true;
		System.out.println(flg);
	}





	public static void main6(String[] args) {
		/**
		 * byte 1
		 * short 2
		 * int 4
		 * long 8
		 * float 4
		 * double 8
		 */
		byte b = 10;
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
	}




	public static void main5(String[] args) {
		char ch = 'a';
		System.out.println(ch);
		//System.out.println('¸ß');
	}





	public static void main4(String[] args) {
		float f = 12.5f;
		System.out.println(f);

		double d = 12.7;
		System.out.println(d);

		float a = 1.0f;
		float b = 2.0f;
		System.out.println(a/b);

		double num = 1.1;
		System.out.println(num*num);
	}




	public static void main3(String[] args) {
		Long a = 10L;
		System.out.println(a);

		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);

		Long c = Long.MAX_VALUE+1;
		System.out.println(c);
		Long d = Long.MIN_VALUE-1;
		System.out.println(d);
	}


	public static void main2(String[] args) {
		/*int a = 10;
		int _ = 10;
		int ____ = 10;*/

	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);

	int a = Integer.MAX_VALUE+1;
	System.out.println(a);
	int b = Integer.MIN_VALUE-1;
	System.out.println(b);
	}

//public class TestDemo {
	public static void main1(String[] args) {

		for (int i = 0;i < args.length ;i++ ) {
			System.out.println(args[i]);
		}

		System.out.println("===============");
		System.out.println("hello,world");
	}	
	
}	