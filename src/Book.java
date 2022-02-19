public class Book {
    private String bookName;
    private int bookNumber;


    public Book(String bookName, int bookNumber) {
        this.bookName = bookName;
        this.bookNumber = bookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }
    public void bookInformation(){
        System.out.println("Book name : " + " " +getBookName() + " , " +"Book number : " + " " +getBookNumber());
    }
}
