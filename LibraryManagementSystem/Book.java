public class Book {
    private int bookID;
    private String bookName;
    private String authorName;
    private String category;

    public Book(int bookID, String bookName, String authorName, String category) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.authorName = authorName;
        this.category = category;
    }

    
    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
