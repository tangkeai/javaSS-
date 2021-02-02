import java.util.*;

public class TestDemo6 {

    Map<Character,Integer> map = new HashMap<>();
    static int count = 0;
    static int num = 0;
    static int start = 0;
    static int end = 0;
    static int mstart = 0;
    static int mend = 0;

    public static String func(String  str) {
        char[] array = str.toCharArray();
        char[] array1 = new char[str.length()];
        for (int i = 0; i < array.length; i++) {
            int tmp = end - start + 1;
            if (array[i] >= '0' && array[i] <= '9') {
                count = 0;
                start = i;
                while (array[i] >= '0' && array[i] <= '9') {
                    //map.put(array[i],count+num);
                    if (i < array.length -1) {
                        i++;
                    }else {
                        break;
                    }
                }
            }
            end = i+1;
            if (tmp < end-start +1) {
                mstart = start;
                mend = end;
                //tmp = end-start;
            }
        }
        for (int i = 0; i <= end - start; i++) {
            array1[i] = array[mstart++];
            System.out.print(array1[i]);
        }
        for (int i = 0; i < mend-mstart; i++) {
            array[i] = array1[i];
        }
        return array1.toString();
    }

    /*public static void func(String str) {
        char[] array = str.toCharArray();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {

            if (array[i] >= '0' && array[i] <= '9') {
                while (array[i] >= '0' && array[i] <= '9') {

                }
            }
        }
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            //String str1 = func(str);
            //System.out.println(str1);
        }

    }
}
