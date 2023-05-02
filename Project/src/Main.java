import javafx.application.Application;

public class Main extends Library_Managment_System   {   
    public static void main(String[] args) throws Exception {
        
        Library.addLibrarians(new Librarians("testlibrarian", "TestLibrarian", "TestLibrarian", "TestLibrarian", "TestLibrarian", "TestLibrarian", false));
        Library.addReaders(new Readers("testreader", "TestReader", "TestReader", "TestReader", "TestReader", "TestReader", false));
        Library.AddBook(new Books("Harry Potter and the Philosopher's Stone", "Fiction", "J.K. Rowling", 123450987, true));
        Library.AddBook(new Books("The Hobbit", "Fiction", "J.R.R. Tolkien", 901234567, true));
        Library.AddBook(new Books("The Lord of the Rings", "Fiction", "J.R.R. Tolkien", 890123456, true));
        Library.AddBook(new Books("Brave New World", "Fiction", "Aldous Huxley", 789012345, true));
        Library.AddBook(new Books("Animal Farm", "Fiction", "George Orwell", 678901234, true));
        Library.AddBook(new Books("The Great Gatsby", "Fiction", "F. Scott Fitzgerald", 567890123, true));
        Library.AddBook(new Books("Pride and Prejudice", "Fiction", "Jane Austen", 456789012, true));
        Library.AddBook(new Books("1984", "Fiction", "George Orwell", 345678901, true));
        Library.AddBook(new Books("To Kill a Mockingbird", "Fiction", "Harper Lee", 234567890, true));
        Library.AddBook(new Books("The Catcher in the Rye", "Fiction", "J.D. Salinger", 123456789, true));
        Application.launch(args);
    }
}
