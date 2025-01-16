package BehaviouralPatterns.IteratorPattern.GoodCode;

import BehaviouralPatterns.IteratorPattern.BadCode.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollectionV1
{
    private ArrayList<BookV1> books=new ArrayList();


    public void addBook(BookV1 book)
    {
        books.add(book);
    }
    public List<BookV1> getBooks()
    {
        return books;
    }

    public Iterator<BookV1> createIterator()
    {
        return new BookIterator(this.books);
    }
    private class BookIterator implements Iterator<BookV1>
    {
        private List<BookV1> books;
        private int pos=0;

        public BookIterator(List<BookV1> books)
        {
            this.books=books;
        }

        @Override
        public boolean hasNext() {
            return pos<books.size();
        }

        @Override
        public BookV1 next()
        {
            return books.get(pos++);
        }
    }

}
