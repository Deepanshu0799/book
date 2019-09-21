import java.util.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Book {
    public static void main(String[] args) {
        String bookName,authorName;
        int i,n,Isbn;
        System.out.println("Enter the no of book you want to entered ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        Author arr[]=new Author[n];
        if(n>0) {
            for (i = 0; i < n; i++) {
                sc.nextLine();
                bookName = sc.nextLine();
                authorName = sc.next();
                Isbn = sc.nextInt();

                arr[i] = new Author(bookName, authorName, Isbn);

            }

            for (i = 0; i < n; i++) {

                System.out.println("-------------------------");
                System.out.println("Bookkname :" + arr[i].BookName().toString());
                System.out.println("Authorname :" + arr[i].AuthorName().toString());
                System.out.println("ISBN :" + arr[i].Isbn());
                System.out.println("-------------------------");

            }
        }
        else{
            System.out.println("plzz enter the valid no");
        }


        sc.close();
    }
}
class Author{
    private String bookName;
    private String authorName;
    private int Isbn;


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

    public int getIsbn() {
        return Isbn;
    }

    public void setIsbn(int Isbn) {
        this.Isbn = Isbn;
    }

    public Author(String bookName, String authorName, int Isbn) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.Isbn = Isbn;
    }
    public String BookName(){
        return bookName;
    }
    public String AuthorName(){
        return authorName;
    }
    public int Isbn(){
        return Isbn;
    }

}