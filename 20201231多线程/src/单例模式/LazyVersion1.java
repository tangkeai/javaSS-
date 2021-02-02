package 单例模式;
public class LazyVersion1 {
    private static LazyVersion1 instance = null;

    public static LazyVersion1 getInstance() {
        if (instance == null) {
            instance = new LazyVersion1();
        }
        return instance;
    }
}