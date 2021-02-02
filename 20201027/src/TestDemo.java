
class MyExcrption extends RuntimeException {

    public MyExcrption() {
    }

    public MyExcrption(String message) {
        super(message);
    }
}

public class TestDemo {

    public static void func2(int x) throws MyExcrption {
        if(x == 10) {
            throw new MyExcrption("x == 10");
        }
    }

    public static void main(String[] args) {
        try {
            func2(10);
        } catch (MyExcrption e) {
            e.printStackTrace();
        }

    }

    public static  double func(int x,int y) throws ArithmeticException{
        if (y == 0) {
            throw new ArithmeticException("除了个0");
        }
        return x*1.0 / y;
    }


    public static void main1(String[] args) {
        try {
            System.out.println(func(10, 0));
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("除数为0!");
        }
    }
}
