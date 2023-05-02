import javafx.application.Application;

public class Main extends Library_Managment_System   {   
    public static void main(String[] args) throws Exception {
        
        String BookData = "Project\\src\\Books.txt";
        String ReaderData = "Project\\src\\ReadersData.txt";
        String LibrarianData = "Project\\src\\LibrariansData.txt";
        ReadBooksFromFile.readBooks(BookData);
        ReadReadersFromFile.readReaders(ReaderData);
        ReadLibrariansFromFile.readLibrarians(LibrarianData);
        Application.launch(args);
    }
}
