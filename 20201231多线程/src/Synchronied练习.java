public class Synchronied练习 {
    //Object object = new Object();
    static final long count = 10_0000;
    static long n = 0;
    static class Adder extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < count; i++) {
                synchronized (Adder.class) {
                    n++;
                }
            }
        }
    }
    static class Suber extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < count; i++) {
                synchronized (Adder.class) {
                    n--;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Adder();
        Thread t2 = new Suber();
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(n);
    }
}
