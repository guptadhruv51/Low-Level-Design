package BehaviouralPatterns.IteratorPattern.GoodCode;

public class BookV1
{
    private String title;
    public BookV1(String title)
    {
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}

