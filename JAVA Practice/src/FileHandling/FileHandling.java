package FileHandling;

import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

        //Creating a File
        System.out.println("File Handling in Java");
        File file = new File("FileHandling/Testfile.txt");
        try {
            file.createNewFile();
            System.out.println("File Exists: " + file.exists());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File Created Successfully");

        //Writing inside the File
        try (FileWriter fw = new FileWriter("FileHandling/Testfile.txt");
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Reading from the Test file \nHello Developer .....");
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Reading the File
        try (FileReader fr = new FileReader("FileHandling/Testfile.txt");
             BufferedReader br = new BufferedReader(fr)) {
            Scanner sc = new Scanner(br);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        //Deleting the File
//        File file = new File("Testfile.txt");
//        if(file.delete()){
//            System.out.println("The file have been deleted " + file.getName());
//        }
//        else{
//            System.out.println("Some problem occurred while deleting the file");
//        }
    }
}