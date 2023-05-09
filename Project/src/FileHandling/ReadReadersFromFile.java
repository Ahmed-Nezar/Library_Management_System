package FileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import LibraryPack.Library;
import LibraryPack.Readers;

public class ReadReadersFromFile {

   public static void readReaders(String fileName) {

      String line = null;

      try {
         FileReader fileReader = new FileReader(fileName);
         BufferedReader bufferedReader = new BufferedReader(fileReader);

         while((line = bufferedReader.readLine()) != null) {
            String[] readerData = line.split(","); 
            
            String username = readerData[0];
            String password = readerData[1];
            String firstName = readerData[2];
            String lastName = readerData[3];
            String address = readerData[4];
            String cellPhone = readerData[5];
            String email = readerData[6];
            boolean blocked = false;
            Library.addReaders(new Readers(username,password, firstName, lastName, address, cellPhone, email, blocked));
            System.out.println(Library.getReaders().get(Library.getReaders().size()-1).getUsername());
         }

         bufferedReader.close();
      }
      catch(IOException ex) {
         System.out.println("Error reading file: " + fileName);
      }
   }
}
