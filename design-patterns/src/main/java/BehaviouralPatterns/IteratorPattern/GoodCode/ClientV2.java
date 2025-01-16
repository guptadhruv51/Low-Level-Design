package BehaviouralPatterns.IteratorPattern.GoodCode;

import java.util.Iterator;

public class ClientV2
{
    public static void main(String[] args) {

        BookCollectionV1 bookCollection=new BookCollectionV1();
        bookCollection.addBook(new BookV1("Java"));
        bookCollection.addBook(new BookV1("Java"));
        bookCollection.addBook(new BookV1("Java"));

       Iterator<BookV1>iterator= bookCollection.createIterator();
       while(iterator.hasNext())
       {
           BookV1 bookV1=iterator.next();
           System.out.println(bookV1);
       }

    }


}
