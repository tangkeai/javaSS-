public class TestDemo {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(1);
        mySingleList.addLast(2);
        mySingleList.addLast(6);
        mySingleList.addLast(4);
        mySingleList.addLast(7);
        mySingleList.addLast(9);
        //mySingleList.addFirst(99);
        mySingleList.display();
        // mySingleList.addIndex(4,999);
        mySingleList.display();
        System.out.println(mySingleList.contains(0));
        //mySingleList.remove(99);
        mySingleList.display();
        //mySingleList.addLast(3);
        //mySingleList.display();
    }
}