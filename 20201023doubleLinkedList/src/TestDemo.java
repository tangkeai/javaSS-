


public class TestDemo {

    public static void main(String[] args) {
        DoubleList doubleList = new DoubleList();
        doubleList.addLast(1);
        doubleList.addLast(2);
        doubleList.addLast(3);
        doubleList.addLast(4);
        doubleList.addIndex(4, 99);
        doubleList.addFirst(100);
        doubleList.display();
    }
}
