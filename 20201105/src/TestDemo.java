//Definition for Employee.
import java.util.ArrayList;
import java.util.List;
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};


/*class Solution {
    public int getImportance(List<Employee> employees, int id) {
        //employees = new ArrayList<>();
        employees.get(id-1);
        employees

    }
}*/



class Solution2 {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum =0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        if(sum % 3.0 != 0) {
            return false;
        }
        sum = sum / 3;
        int ret = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            ret += A[i];
            if(ret == sum) {
                ret = 0;
                count++;
                if(count == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}


/*class Solution1 {
    public int findJudge(int N, int[][] trust) {
        if(N == 1) {
            return -1;
        }
        for (int i = 0; i < trust.length; i++) {
            int[] arry = trust[i];
        }

    }
}*/

public class TestDemo {
    public static void main(String[] args) {

    }
}
