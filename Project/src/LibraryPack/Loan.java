package LibraryPack;
public class Loan {
    private Users user;
    private Books book;

    public Loan(Users user, Books book) {
        this.user = user;
        this.book = book;
        Library.loans.add(this);
    }
    
    public Users getUser() {
        return user;
    }
    
    public Books getBook() {
        return book;
    }
}
