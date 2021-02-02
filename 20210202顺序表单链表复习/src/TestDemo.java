public class TestDemo {

    public static void main(String[] args) {
       /* MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(0,2);
        myArrayList.add(0,3);
        myArrayList.add(0,4);
        myArrayList.display();*/

        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(2);
        mySingleList.addLast(2);
        mySingleList.addLast(2);
        mySingleList.addIndex(3,999);
        mySingleList.clear();
        mySingleList.display();
    }
}