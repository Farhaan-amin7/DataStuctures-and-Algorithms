package SuperPackage.FileHandling;
import SuperPackage.FileHandling.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;


public class FileReader1 {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("scratch.html")){
            System.out.println("Enter some letters: ");
            int letters = fr.read();
            while(fr.ready()){
                System.out.println((char) letters);
                letters = fr.read();
            }
//            isr.close();
            System.out.println();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}