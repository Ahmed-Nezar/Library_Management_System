package LibraryPack;
public class Librarians extends Users {
    private String ID;
    private String Type;
    private static int LibrarianCount = 0;
    public Librarians(String Password, String FirstName, String LastName, String Address, String CellPhone, String Email, boolean Blocked) {
        super(Password, FirstName, LastName, Address, CellPhone, Email, Blocked);
        LibrarianCount++;
        this.ID = "L" + LibrarianCount + FirstName.charAt(0) + LastName.charAt(0);
        this.Type = "Librarian";
        
    Library.librarians.add(this);
    }
    
    public String getID() {
        return ID;
    }

    public void addUserToOrderList(Users user, Books book) {
        Order order = new Order(user, book);
        Library.orders.add(order);
    }
    
    public void removeUserFromOrderList(Users user) {
        Library.orders.removeIf(order -> order.getUser().equals(user));
    }
    
    
    
    
    @Override
    public String toString() {
        return "Librarian ID: " + this.ID +
                ", Name: " + super.getFirstName() + " " + super.getLastName() +
                ", Address: " + super.getAddress() +
                ", Cellphone: " + super.getCellPhone() +
                ", Email: " + super.getEmail() +
                ", Blocked: " + (super.Blocked() ? "Yes" : "No");
    }

    public String getType() {
        return Type;
    }
    public static int getLibrarianCount() {
        return LibrarianCount;
    }
    public void makeReaderLibrarian(Readers reader) {
        Librarians librarian = new Librarians(reader.getPassword(), reader.getFirstName(), reader.getLastName(), reader.getAddress(), reader.getCellPhone(), reader.getEmail(), reader.Blocked());
        Library.librarians.add(librarian);
        Library.readers.remove(reader);
    }
}