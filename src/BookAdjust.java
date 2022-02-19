import java.util.ArrayList;

public class BookAdjust implements itfBookAdjust{
    static ArrayList<Book> books=new ArrayList<Book>();


    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void controlBook(Integer imp) {
        for (Book books: books) {
            if (books.getBookNumber() ==imp) {
                System.out.println("Book name :" +" " +books.getBookName()+" "+"Book number :"+books.getBookNumber());
                return;
            }
        }
        System.out.println("Specified book not found. ");
    }


    @Override
    public void deleteBook(int bookNumber) {
        BookAdjust.books.remove(bookNumber-1);

    }



    @Override
    public void countBook() {
        System.out.println("The number of books :"+books.size());

    }



    @Override
    public void showBooks() {
        if(books.isEmpty()){
            System.out.println("There is no book. ");
        }
        else{
            for(Book bk:books){
                bk.bookInformation();
            }
        }
    }


}




