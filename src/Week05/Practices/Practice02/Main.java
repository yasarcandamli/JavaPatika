package Week05.Practices.Practice02;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books1 = new TreeSet<>(new OrderByNameComparator());

        books1.add(new Book("Fareler ve İnsalar", 111, "John Steinbeck", "26.01.2023"));
        books1.add(new Book("Sefiller", 400, "Victor Hugo", "01.11.2022"));
        books1.add(new Book("Yüzbaşının Kızı", 144, "Alexandr Sergeyeviç Puşkin", "28.11.2020"));
        books1.add(new Book("Tutunamayanlar", 724, "Oğuz Atay", "08.08.2023"));
        books1.add(new Book("Yer Altından Notlar", 136, "Fyodor Mihailoviç Dostoyevski", "28.11.2020"));

        for (Book book : books1) {
            System.out.println(book.getBookName());
        }

        System.out.println("\n-------------------------\n");

        TreeSet<Book> books2 = new TreeSet<>(new OrderByPageNumberComparator());

        books2.add(new Book("Fareler ve İnsalar", 111, "John Steinbeck", "26.01.2023"));
        books2.add(new Book("Sefiller", 400, "Victor Hugo", "01.11.2022"));
        books2.add(new Book("Yüzbaşının Kızı", 144, "Alexandr Sergeyeviç Puşkin", "28.11.2020"));
        books2.add(new Book("Tutunamayanlar", 724, "Oğuz Atay", "08.08.2023"));
        books2.add(new Book("Yer Altından Notlar", 136, "Fyodor Mihailoviç Dostoyevski", "28.11.2020"));

        for (Book book : books2) {
            System.out.println(book.getBookName());
        }
    }
}
