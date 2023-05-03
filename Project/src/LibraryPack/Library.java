package LibraryPack;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public abstract class Library {
    protected static ArrayList<Books> books = new ArrayList<>();
    protected static ArrayList<Users> users = new ArrayList<>();
    protected static ArrayList<Librarians> librarians = new ArrayList<>();
    protected static ArrayList<Readers> readers = new ArrayList<>();
    protected static ArrayList<Order> orders = new ArrayList<>();
    protected static ArrayList<Loan> loans = new ArrayList<>();
    
    public static void AddBook(Books book) {
        Library.books.add(book);
        //WriteOutputToFile.writeToFile(book);
    }
    public static void setBooks(ArrayList<Books> books) {
        Library.books = books;
    }
    public static void setUsers(ArrayList<Users> users) {
        Library.users = users;
    }
    public static void setLibrarians(ArrayList<Librarians> librarians) {
        Library.librarians = librarians;
    }
    public static void setReaders(ArrayList<Readers> readers) {
        Library.readers = readers;
    }
    public static void setOrders(ArrayList<Order> orders) {
        Library.orders = orders;
    }
    public static void setLoans(ArrayList<Loan> loans) {
        Library.loans = loans;
    }
    public static ArrayList<Books> getBooks() {
        return books;
    }
    public static ArrayList<Users> getUsers() {
        return users;
    }
    public static ArrayList<Librarians> getLibrarians() {
        return librarians;
    }
    public static ArrayList<Readers> getReaders() {
        return readers;
    }
    public static ArrayList<Order> getOrders() {
        return orders;
    }
    public static ArrayList<Loan> getLoans() {
        return loans;
    }
    public static void RemoveBook(int index) {
        Library.books.remove(index);
    }
    public static void addReaders(Readers readers) {

        Library.users.add(readers);
    }
    public static void addLibrarians(Librarians librarians) {
        Library.users.add(librarians);
    }
    public void removeUser(Users user) {
        Library.users.remove(user);
    }
    public static List<Users> searchMembers(String search) {
        return Library.users.stream()
                .filter(user -> 
                    user.getFirstName().equalsIgnoreCase(search) ||
                    user.getLastName().equalsIgnoreCase(search) ||
                    user.getCellPhone().equalsIgnoreCase(search) ||
                    user.getEmail().equalsIgnoreCase(search) ||
                    user.getAddress().equalsIgnoreCase(search) ||
                    (user.getFirstName() + " " + user.getLastName()).equalsIgnoreCase(search)
                )
                .collect(Collectors.toList());
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
}