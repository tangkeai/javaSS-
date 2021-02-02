package operation;

import book.Book;
import book.BookList;

public class AddOperation implements IOperation {
    public void work(BookList bookList) {
        System.out.println("增加图书");
        System.out.println("请输入书名：");
        String name = this.scan.next();
        System.out.println("请输入作者：");
        String author = this.scan.next();
        System.out.println("请输入价格：");
        int price = this.scan.nextInt();
        System.out.println("请输入类型：");
        String type = this.scan.next();

        Book book = new Book(name,author,price,type);
        int currentSize = bookList.getUsedsize();//usedSize是private的，需要通过getUsedsize()拿到
        bookList.setBook(currentSize, book);
        bookList.setUsedsize(currentSize+1);
    }
}
