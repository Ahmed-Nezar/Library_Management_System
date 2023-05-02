import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadReadersFromFile {

   public static void readReaders(String fileName) {

      String line = null;

      try {
         FileReader fileReader = new FileReader(fileName);
         BufferedReader bufferedReader = new BufferedReader(fileReader);

         while((line = bufferedReader.readLine()) != null) {
            String[] readerData = line.split(","); 
            
            String password = readerData[0];
            String firstName = readerData[1];
            String lastName = readerData[2];
            String address = readerData[3];
            String cellPhone = readerData[4];
            String email = readerData[5];
            boolean blocked = false;
            Library.addReaders(new Readers(password, firstName, lastName, address, cellPhone, email, blocked));
          
         }

         bufferedReader.close();
      }
      catch(IOException ex) {
         System.out.println("Error reading file: " + fileName);
      }
   }
}
