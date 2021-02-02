package 多线程;

public class 多线程创建方法2 {
    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
