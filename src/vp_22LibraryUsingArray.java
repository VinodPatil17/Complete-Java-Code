import java.util.Arrays;

class Library{
    String [] books = new String[0];
    public void addBook(String newBook){
        books = Arrays.copyOf(books , books.length+1);
        books[books.length-1] = newBook;
    }

    public void IssueBook(String issue){
        int index = -1;
        for(int i = 0; i < books.length; i++){
            if(books[i].equals(issue)){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println(issue + " " + "Not found");
            return;
        }
        String[] result = new String[books.length - 1];
        System.arraycopy(books, 0, result, 0, index);
        System.arraycopy(books, index + 1, result, index, books.length - index - 1);
        books = result;
    }

    public void returnBook(String returnBook){
        books = Arrays.copyOf(books , books.length+1);
        books[books.length-1] = returnBook;
    }

    public boolean shoeAvailableBook(String Avail){
        for(int i = 0; i < books.length; i++){
            if(books[i].equals(Avail)) {
                return true;
            }
        }
        return false;
    }
}
public class vp_22LibraryUsingArray {
    public static void main(String[] args){
        Library lib = new Library();
        lib.addBook("Summertime Saga");
        lib.addBook("Thanush Gaandu");
        lib.IssueBook("Summertime Saga");
        lib.IssueBook("Thanush Gaandu");
        lib.returnBook("Thanush Gaandu");
        System.out.println(lib.shoeAvailableBook("Thanush Gaandu"));
        //System.out.println(lib.books[1]);
        //System.out.println(Arrays.toString(lib.books));
    }
}
