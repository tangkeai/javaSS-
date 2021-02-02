package 单例模式;

//线程安全+简单
//构造的早，如果不用，就浪费空间了
public class Hungry {

    private Hungry() {}

    private static Hungry instance = new Hungry(); //只会有这么一个对象
    public static Hungry getInstance() {
        return instance;
    }
}
