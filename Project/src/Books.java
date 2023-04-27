import java.util.List;

public class Books extends Library{
    private String Title;
    private String Genre;
    private String Author;
    private long ISBN;
    private boolean Available;
    private static int BookCount = 0;
    public Books(String Title, String Genre, String Author,long ISBN, boolean Available) {
        this.Title = Title;
        this.Genre = Genre;
        this.Author = Author;
        this.ISBN = ISBN;
        this.Available = true;
        BookCount++;
    }

    public String getTitle() {
        return Title;
    }

    public String getGenre() {
        return Genre;
    }

    public String getAuthor() {
        return Author;
    }

    public long getISBN() {
        return ISBN;
    }
    
    public void setAvailable(boolean available) {
        Available = available;
    }

    public boolean Available() {
        return Available;
    } 

    public static int getBookCount() {
        return BookCount;
    }
    public static List<Books> searchBooks(String search) {
        return Library.books.stream()
                .filter(book -> 
                    book.getTitle().equalsIgnoreCase(search) ||
                    book.getAuthor().equalsIgnoreCase(search) ||
                    String.valueOf(book.getISBN()).equalsIgnoreCase(search)
                )
                .collect(java.util.stream.Collectors.toList());
    }
    public static void AddBook(Books book) {
        Library.books.add(book);
    }
    public static void RemoveBook(int index) {
        Library.books.remove(index);
    }
    @Override
    public String toString() {
        return "ISBN: " + ISBN +
                ", Title: " + Title +
                ", Author: " + Author +
                ", Genre: " + Genre +
                ", Availability: " + (Available ? "Available" : "Not Available");
    }

}
