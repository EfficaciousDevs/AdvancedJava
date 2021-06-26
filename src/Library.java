import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList = new ArrayList<>();

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBook(Book b){
        this.bookList.add(b);
    }
    public boolean isEmpty(){
        return bookList.isEmpty();
    }

    public ArrayList<Book> viewAllBooks(){
        return bookList;
    }

    public ArrayList<Book> viewBooksByAuthor(String author){
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for(Book b : bookList){
            if(b.getAuthor().contains(author))
                booksByAuthor.add(b);
        }
        return booksByAuthor;
    }
    public int countNoBook(String bname){
        int count = 0;
        for(Book b:bookList){
            if(b.getBookName().contains(bname))
                count++;
        }
        return count;
    }
}
