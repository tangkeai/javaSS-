package Map;
import java.util.*;

public class TestDemo {
    //将十万个数据，统计重复出现的数据及出现的次数
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10_0000; i++) {
            int num = random.nextInt(10_0000);
            list.add(num);
        }
        /*for (int i = 0; i < list.size(); i++) {
                int key = list.get(i);
                if(map.get(key) == null) {
                    map.put(key,1);
                }else {
                int val = map.get(key);
                map.put(key,val+1);
            }
        }*/
        //遍历list
        for (Integer key:list) {
            if (map.get(key) == null) {
                map.put(key,1);
            }else {
                int val = map.get(key);
                map.put(key,val+1);
            }
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print("重复的数字："+entry.getKey() + "次数："+entry.getValue());
                System.out.println();
            }
        }
    }

    //List当中存放的数据为10_0000个，把重复的数字全部去重
    public static void main4(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10_0000; i++) {
            int num = random.nextInt(10_00000);
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
    }

    //List当中存放的数据为10_0000个，找打第一个重复的数据
    public static void main3(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10_0000; i++) {
            int num = random.nextInt(10_00000);
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            if (set.contains(list.get(i))) {
                System.out.println(list.get(i));
                return;
            }else {
                set.add(list.get(i));
            }
        }
    }

    public static void main2(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("abcd");
        set.add("abcde");
        set.add("abcd");
        System.out.println(set);
        Iterator<String> it = set.iterator();
        //System.out.println(it);//错误 java.util.HashMap$KeyIterator@1b6d3586

        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println("======");
        System.out.println(set.size());
        it.remove();
        System.out.println(set.size());
    }

    public static void main1(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("及时雨","宋江");
        System.out.println(map.get("及时雨")+ "1");
        for (Map.Entry<String,String> entry:map.entrySet()) {
            System.out.println(entry.getKey()+"2");
            System.out.println(entry.getValue()+"3");
        }
    }
}

