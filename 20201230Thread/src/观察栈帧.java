public class 观察栈帧 {
    private static void a() {

    }
    private static void b() {
        a();
    }
    private static void c() {
        b();
    }
    private static void d() {
        c();
    }
    private static void e() {
        d();
    }

    public static void main(String[] args) {
        e();
    }
}
