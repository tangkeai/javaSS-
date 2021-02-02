import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java.util.ArrayList;
class Solution {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        int tmp = 1;
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<B.length; j++) {
                if (i != j) {
                    tmp *= A[j];
                }
            }
            B[i] = tmp;
        }
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]+" ");
        }
        return B;
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        Solution solution = new Solution();
        solution.multiply(array);
    }
}
