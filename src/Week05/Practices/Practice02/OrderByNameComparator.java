package Week05.Practices.Practice02;

import java.util.Comparator;

public class OrderByNameComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getBookName().compareTo(o2.getBookName());
    }
}
