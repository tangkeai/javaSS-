


public class TestDemo3 {

    public static void main(String[] args) {
        String s1 = "9999999999999";
        String s2 = "1";
        int[] array = new int[14];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = s2.length()-1; j >= 0; j--) {
                int ret = s1.charAt(i) - '0' + s2.charAt(i) - '0' + array[i];//10
                if (ret > 9) {
                    array[i] = array[i] + ret % 10;//0
                    array[i + 1] = ret / 10;//1
                } else {
                    array[i] = array[i] + ret;
                }
            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
