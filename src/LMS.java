import java.util.ArrayList;
import java.util.Scanner;

public class LMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add Book");
        System.out.println("2.Display all book details");
        System.out.println("3.Search Book by author");
        System.out.println("4.Count number of books-by book name");
        System.out.println("5.Exit");

        Library lib = new Library();
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Enter the isbn no:");
                int isb = sc.nextInt();
                System.out.println("Enter the book name:");
                String bname = sc.next();
                System.out.println("Enter the author name:");
                String aname = sc.nextLine();

                Book book = new Book();
                book.setIsbnNo(isb);
                book.setBookName(bname);
                book.setAuthor(aname);

                lib.addBook(book);
                break;

            case 2:
                ArrayList<Book> books = lib.getBookList();
                for(Book b : books)
                    System.out.println(b);

                break;

            case 3:
                System.out.println("Enter the author name:");
                String bookbyAuthor = sc.nextLine();

                ArrayList<Book> Abooks = lib.viewBooksByAuthor(bookbyAuthor);
                if(!Abooks.isEmpty()) {
                    for (Book b : Abooks)
                        System.out.println(b);
                }
                else
                    System.out.println("None of the book published by the author " + bookbyAuthor);
                break;


            case 4:
                System.out.println("Enter the book name:");
                String bookName = sc.nextLine();

                int freq = lib.countNoBook(bookName);
                System.out.println(freq);
                break;

            default:break;
        }
    }
}
