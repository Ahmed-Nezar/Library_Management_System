package FileHandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import LibraryPack.Books;

public class WriteOutputToFile {

    public static void writeToFile(Books book){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Project\\src\\Books.txt", true))) {
            String Output = book.getTitle() + "," + book.getGenre() + "," + book.getAuthor() + "," + book.getISBN() + "\n";
            bufferedWriter.write(Output);
        } catch(IOException ex) {
            System.out.println("Error writing to file '" + "Books.txt" + "'");
        }
    }
    
       
}