import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TsetDemo1 {
    public static void func(String str1, String str2) {
        Set<Character> set = new HashSet<>();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        for (char chB: ch2) {
            set.add(chB);
        }
        for (char chA:ch1) {
            if (!set.contains(chA)) {
                System.out.print(chA);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            func(str1,str2);
        }
    }
}
