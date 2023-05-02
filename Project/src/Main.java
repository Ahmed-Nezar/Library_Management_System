import javafx.application.Application;

public class Main extends Library_Managment_System   {   
    public static void main(String[] args) throws Exception {
        
        Library.addLibrarians(new Librarians("testlibrarian", "TestLibrarian", "TestLibrarian", "TestLibrarian", "TestLibrarian", "TestLibrarian", false));
        Library.addReaders(new Readers("testreader", "TestReader", "TestReader", "TestReader", "TestReader", "TestReader", false));
        String BookData = "Project\\src\\Books.txt"; 
        ReadBooksFromFile.readBooks(BookData);
        Application.launch(args);
    }
}
