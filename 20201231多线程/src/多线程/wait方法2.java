package 多线程;

public class wait方法2 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        synchronized (object) {
            System.out.println("等待中");
            object.wait();
            System.out.println("等待结束");
        }
    }
}
