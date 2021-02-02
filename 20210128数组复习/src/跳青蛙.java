public class 跳青蛙 {

    public static int floorNor(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int 

    }

    public static int floor(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return floor(n-1) + floor(n-2);
    }
    public static void main(String[] args) {
        System.out.println(floor(8));

    }
}
