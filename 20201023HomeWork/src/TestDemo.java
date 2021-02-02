



public class TestDemo {
    public static void main(String[] args) {
        DoubleList doubleList = new DoubleList();
        doubleList.addLast(1);
        doubleList.addLast(2);
        doubleList.addLast(3);
        doubleList.addLast(4);
        doubleList.display();
        //doubleList.addFirst(5);
        //doubleList.addFirst(6);
        doubleList.display();
        doubleList.remove(1);
        doubleList.display();
        System.out.println(doubleList.size());
        System.out.println(doubleList.contains(0));
    }
}
