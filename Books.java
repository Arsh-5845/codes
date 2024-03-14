import java.util.ArrayList;

class Books {
    int bookId;
    String bookName;
    String authorName;

    Books(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }
}

 class Main {
    public static void main(String[] args) {
        ArrayList<Books> bookslist = new ArrayList<>();
        bookslist.add(new Books(1, "Indian polity", "M lakshmikant"));
        bookslist.add(new Books(2, "Modern history", "Bipin chandra"));
        bookslist.add(new Books(3, "Indian geography", "Gc leong"));
        System.out.println("All Books Details:");
       
        for ( Books books: bookslist) {
            System.out.println("Book ID: " + books.bookId);
            System.out.println("Book Name: " + books.bookName);
            System.out.println("Author Name: " + books.authorName);
            System.out.println();
        }
    }
}