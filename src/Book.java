public class Book {
    private final String bookTitle;
    private final Author authorName;
    private int publicationYear;

    public Book(String bookTitle, Author authorName, int publicationYear) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    public Author getAuthor(){
        return this.authorName;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
