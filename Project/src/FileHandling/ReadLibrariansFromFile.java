package FileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import LibraryPack.Librarians;
import LibraryPack.Library;

public class ReadLibrariansFromFile {

    public static void readLibrarians(String fileName) {

        String line = null;
  
        try {
           FileReader fileReader = new FileReader(fileName);
           BufferedReader bufferedReader = new BufferedReader(fileReader);
  
           while((line = bufferedReader.readLine()) != null) {
              String[] librarianData = line.split(","); 
              
              String password = librarianData[0];
              String firstName = librarianData[1];
              String lastName = librarianData[2];
              String address = librarianData[3];
              String cellPhone = librarianData[4];
              String email = librarianData[5];
              boolean blocked = false;
              Library.addLibrarians(new Librarians(password, firstName, lastName, address, cellPhone, email, blocked));
            
           }
  
           bufferedReader.close();
        }
        catch(IOException ex) {
           System.out.println("Error reading file: " + fileName);
        }
    }
}
