package LibraryPack;
public class Members extends Users {
    private boolean isLibrarian;

    public Members(String Username,int ID, String Password, String FirstName, String LastName, String Address, String CellPhone, String Email, boolean isLibrarian) {
        super(Username,Password, FirstName, LastName, Address, CellPhone, Email, isLibrarian);
        this.isLibrarian = isLibrarian;
    }

    public boolean isLibrarian() {
        return isLibrarian;
    }

    public void setLibrarian(boolean librarian) {
        isLibrarian = librarian;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Role: " + (isLibrarian ? "Librarian" : "Reader");
    }
}