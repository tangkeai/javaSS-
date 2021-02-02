package 多线程;

public class 多线程创建方法4 {

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println(this.getName());
            }
        };
        t1.start();
    }
}
