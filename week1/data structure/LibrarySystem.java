import java.util.Arrays;
import java.util.Comparator;

class Book {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return bookId + " - " + title + " by " + author;
    }
}

public class LibrarySystem {

    
    public static Book linearSearchByTitle(Book[] books, String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    
    public static Book linearSearchByAuthor(Book[] books, String author) {
        for (Book book : books) {
            if (book.author.equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    // Binary search by title 
    public static Book binarySearchByTitle(Book[] books, String title) {
        int low = 0, high = books.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(title);
            if (cmp == 0) return books[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    
    public static Book binarySearchByAuthor(Book[] books, String author) {
        int low = 0, high = books.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].author.compareToIgnoreCase(author);
            if (cmp == 0) return books[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "The Alchemist", "Paulo Coelho"),
            new Book(2, "Atomic Habits", "James Clear"),
            new Book(3, "Clean Code", "Robert C. Martin"),
            new Book(4, "1984", "George Orwell"),
            new Book(5, "Deep Work", "Cal Newport")
        };

        
        System.out.println("Linear Search by Title:");
        Book titleResult1 = linearSearchByTitle(books, "Clean Code");
        System.out.println(titleResult1 != null ? titleResult1 : "Book not found");

        
        System.out.println("\nLinear Search by Author:");
        Book authorResult1 = linearSearchByAuthor(books, "James Clear");
        System.out.println(authorResult1 != null ? authorResult1 : "Book not found");

        
        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));

        
        System.out.println("\nBinary Search by Title:");
        Book titleResult2 = binarySearchByTitle(books, "Deep Work");
        System.out.println(titleResult2 != null ? titleResult2 : "Book not found");

        
        Arrays.sort(books, Comparator.comparing(b -> b.author.toLowerCase()));

       
        System.out.println("\nBinary Search by Author:");
        Book authorResult2 = binarySearchByAuthor(books, "George Orwell");
        System.out.println(authorResult2 != null ? authorResult2 : "Book not found");
    }
}

 