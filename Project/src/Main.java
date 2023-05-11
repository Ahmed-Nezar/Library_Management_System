import FileHandling.*;
import GUI.*;
import javafx.application.Application;

public class Main extends Library_Managment_System   {   
    public static void main(String[] args) throws Exception {
        
        String BookData = "Project\\src\\Data\\Books.txt"; 
        String ReaderData = "Project\\src\\Data\\ReadersData.txt";
        String LibrarianData = "Project\\src\\Data\\LibrariansData.txt";
        ReadBooksFromFile.readBooks(BookData);
        ReadReadersFromFile.readReaders(ReaderData);
        ReadLibrariansFromFile.readLibrarians(LibrarianData);
        
        Application.launch(args);
    }
}
