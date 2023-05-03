package LibraryPack;
public class Readers extends Users {
    private String ID;
    private String Type;
    private static int ReaderCount = 0;
    public Readers(String Password, String FirstName, String LastName, String Address, String CellPhone, String Email, boolean Blocked) {
        super(Password, FirstName, LastName, Address, CellPhone, Email, Blocked);
        ReaderCount++;
        this.Type = "Reader";
        this.ID = "R" + ReaderCount + FirstName.charAt(0) + LastName.charAt(0);
        Library.readers.add(this);
        
    }
    public String getID() {
        return ID;
    }
    public String getType() {
        return Type;
    }
    public void searchMembers(String FirstName, String LastName, String Cellphone) {
        Library.users.stream().filter(user -> user.getFirstName().equals(FirstName) && user.getLastName().equals(LastName) && user.getCellPhone().equals(Cellphone)).forEach(System.out::println);
    }
    
    public void addSelfToOrderList(Books book) {
        Order order = new Order(this, book);
        Library.orders.add(order);
    }
    
    public void rentBook(Books book) {
        Loan loan = new Loan(this, book);
        Library.loans.add(loan);
    }

    public static int getReaderCount() {
        return ReaderCount;
    }
    @Override
    public String toString() {
        return "Reader ID: " + this.ID +
                ", Name: " + super.getFirstName() + " " + super.getLastName() +
                ", Address: " + super.getAddress() +
                ", Cellphone: " + super.getCellPhone() +
                ", Email: " + super.getEmail() +
                ", Blocked: " + (super.Blocked() ? "Yes" : "No");
    }
    
    
}
