import java.io.*;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        FileWriter fis;

        {
        try {
            fis = new FileWriter("D://java/dzwrite.txt",false);
            String text = "Hello world";
            fis.write(text);
            fis.flush(); // flush чистить буфер
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


/*
        try {
            FileInputStream fis = new FileInputStream("D://java/test.txt");
            int i;
            while ((i = fis.read()) != -1){
                System.out.print((char) i); // char - превратить число в букву
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


/*      String text = "\nHello world";
        try {
            FileOutputStream fos = new FileOutputStream("D://java/test.txt",true);
            byte[] buffer = text.getBytes();
            fos.write(buffer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }
}