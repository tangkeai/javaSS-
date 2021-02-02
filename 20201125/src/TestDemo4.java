public class TestDemo4 {
    public static int count(int[] A, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(A[i] > A[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,6,1,9,10};
        System.out.println(count(array,array.length));
    }
}
