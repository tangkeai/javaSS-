import java.util.*;
public class TestDemo {

    public static int func(String[] arraystr) {
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (String s:arraystr) {
            list.add(s);
        }

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!set.contains(list.get(i))) {
                set.add(list.get(i));
                count++;
            }else {
                set.add(list.get(i));
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int ans = 0 ;
        String s = scanner.nextLine();
            for(int i = 0; i<s.length(); i++){
                for(int j = 0; j < s.length(); j++){
                    String[] arraystr = new String[s.length()];
                    arraystr = str.split(" ");
                    ans += func(arraystr);
                }
            }
        System.out.println(ans);
    }
}


 /*
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int ans = 0, x;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    x = sc.nextInt();
                    ans += x;
                }
            }
            System.out.println(ans);
        }
    }*/


/*while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String[] arraystr = new String[2500];
            arraystr = str.split(" ");
            System.out.println(func(arraystr));
        }*/