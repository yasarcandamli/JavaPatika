package Week05.Practices.Practice02;

public class Book {
    private String bookName;
    private int pageNumber;
    private String author;
    private String publicationDate;

    public Book(String bookName, int pageNumber, String author, String publicationDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
}
