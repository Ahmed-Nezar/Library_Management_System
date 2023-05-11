package LibraryPack;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import FileHandling.*;
public abstract class Library {
    protected static ArrayList<Books> books = new ArrayList<>();
    protected static ArrayList<Users> users = new ArrayList<>();
    protected static ArrayList<Librarians> librarians = new ArrayList<>();
    protected static ArrayList<Readers> readers = new ArrayList<>();
    protected static ArrayList<Order> orders = new ArrayList<>();
    protected static ArrayList<Loan> loans = new ArrayList<>();
    
    protected static Users loggedUser;
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
    public static void setLoggedUser(Users loggedUser) {
        Library.loggedUser = loggedUser;
    }

    public static ArrayList<Books> getBooks() {
        return books;
    }
    public static List<Users> getUsers() {
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
    public static Users getLoggedUser() {
        return loggedUser;
    }

    public static void AddBook(Books book) {
        Library.books.add(book);
        WriteOutputToBookFile.writeToFile();
    }
    public static void addReaders(Readers readers) {

        Library.users.add(readers);
        WriteOutputToReaderFile.writeToFile();
    }
    public static void addLibrarians(Librarians librarians) {
        Library.users.add(librarians);
    }
    public static void removeBook(Books book) {
        Library.books.remove(book);
    }

    public static void removeUser(Users user) {
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
                    book.getGenre().equalsIgnoreCase(search) ||
                    String.valueOf(book.getISBN()).equalsIgnoreCase(search)
                )
                .collect(java.util.stream.Collectors.toList());
    }

    public static void rentBook(Books book) {
        
        Users user = Library.loggedUser;
        Loan loan = new Loan(user, book);
        
        Library.loans.add(loan);

        
    }

    public static String getRentedBy(Books book) {
        String result = "";
        for (Loan loan : Library.loans) {
            if (loan.getBook().equals(book) && users.contains(loan.getUser())) {
                result += loan.getUser().getFirstName() + " " + loan.getUser().getLastName() + "\n";
            }
        }
        return result;
    }
    
    public static String getLoanedBooks(Users user) {
        String result = "";
        for (Loan loan : Library.loans) {
            if (loan.getUser().equals(user) && books.contains(loan.getBook())) {
                result += loan.getBook().getTitle() + "\n";
            }
        }
        return result;
    }

    public static void orderBook(Books book) {
        Users user = Library.loggedUser;
        Order order = new Order(user, book);
        Library.orders.add(order);
    }
    public static void removeOrder(Users user, Books book) {
        Library.orders.removeIf(order -> order.getUser().equals(user) && order.getBook().equals(book));
    }
    public static List<Order> searchOrders (String search) {
        List<Users> users = Library.users.stream()
        .filter(user -> 
            user.getFirstName().equalsIgnoreCase(search) ||
            user.getLastName().equalsIgnoreCase(search) ||
            user.getCellPhone().equalsIgnoreCase(search) ||
            user.getEmail().equalsIgnoreCase(search) ||
            user.getAddress().equalsIgnoreCase(search) ||
            (user.getFirstName() + " " + user.getLastName()).equalsIgnoreCase(search)
        )
        .collect(Collectors.toList());
        for (Users user : users) {
            return Library.orders.stream()
            .filter(order -> 
                order.getUser().equals(user)
            )
            .collect(Collectors.toList());
        }
        return null;
    }

}
