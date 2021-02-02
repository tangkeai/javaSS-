

public class TestDemo2 {

    public static void func(int n) {
        int num = n/8;
        if (num%6 == 0) {
            num = n / 8 + num / 6;
        }
    }

    public static void main(String[] args) {

    }
}
