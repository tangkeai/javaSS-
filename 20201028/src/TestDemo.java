import java.util.Arrays;

public class TestDemo {
    /*
    //字符串逆置
    //abcdef -> fedcba
    public static String reserve(String str) {
        if(str == null || str == "") {
            return null;
        }
        //现将字符串转为字符数组
        char[] arry = str.toCharArray();
        int i = 0 ;
        int j = arry.length -1;
        while (i < j) {
            char tmp = arry[i];
            arry[i] = arry[j];
            arry[j] = tmp;
            i++;
            j--;
        }
        //return new String(arry);
        return String.copyValueOf(arry);
        //return String.valueOf(arry);
    }*/


    //将字符串前k个元素放在字符串的后面，且顺序不变
    //abcdef k = 2  -> cdefab
    public static String reverse(String str,int i ,int j) {
        if(str == null || str == "") {
            return null;
        }
        //现将字符串转为字符数组
        char[] arry = str.toCharArray();
        /*int i = 0 ;
        int j = arry.length -1;*/
        while (i < j) {
            char tmp = arry[i];
            arry[i] = arry[j];
            arry[j] = tmp;
            i++;
            j--;
        }
        //return new String(arry);
        return String.copyValueOf(arry);
        //return String.valueOf(arry);
    }

    public static String reverseLeftWords(String str, int k) {
        if (str == null) {
            return null;
        }
        int len = str.length();
        if(str == "" || k <= 0 || k >len) {
            return null;
        }
        str = reverse(str, 0, k - 1);
        str = reverse(str, k, len - 1);
        str = reverse(str, 0, len -1 );
        return str;
    }

    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(reverseLeftWords(str, 2));
    }


    /*public static void main1(String[] args) {
        String str = "abcdef";
        System.out.println(reverse(str));
    }*/
}
