/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2020-10-20
 * Time: 8:34
 */
public class TestDemo {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(1);
        mySingleList.addLast(2);
        mySingleList.addLast(3);
        mySingleList.addLast(4);
        mySingleList.addFirst(99);
        mySingleList.display();
        mySingleList.addIndex(5,88);
        mySingleList.display();
        mySingleList.remove(3);
        mySingleList.display();

    }
}
