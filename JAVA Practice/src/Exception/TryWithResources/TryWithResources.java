package Exception.TryWithResources;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("FileHandling/java.txt")){
            int letters = fr.read();
            System.out.println(letters);
            letters = fr.read();
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found "+e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
